/*
    Copyright (C) 2021-21 Helal Anwar

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licens
 */
package org.helal_anwar.prayer

import org.helal_anwar.prayer.prayer_Enums.Institution
import org.helal_anwar.prayer.prayer_Enums.Method
import org.helal_anwar.prayer.prayer_Enums.TimeZones
import java.lang.Math.toDegrees
import java.time.LocalDate
import java.time.ZoneId
import java.time.temporal.JulianFields
import kotlin.math.*

open class PrayerTime {
    /**
     * @author Helal Anwar
     * @see Prayers
     *
     * @see SalahTime
     *
     * @see Time
     *
     * @see TimeFormat
     */
    private var longitude = 0.0
    var latitude = 0.0
    var offSetTime = 0.0
    var date = LocalDate.now()
    var method = Method.Standard_Method
    var timeFormat = TimeFormat.TWELVE_HOURS
    var institution: Institution? = null

    constructor(latitude: Double, longitude: Double, timeZones: TimeZones, institution: Institution?) {
        this.longitude = longitude
        this.latitude = latitude
        date = LocalDate.now(ZoneId.of(timeZones.uTC_Value))
        offSetTime = zoneIdToOffSetTime(timeZones.uTC_Value)
        this.institution = institution
    }

    constructor()

    private fun zoneIdToOffSetTime(zoneId: String?): Double {
        val x = ZoneId.of(zoneId).normalized().toString()
        val hours = x.substring(0, x.indexOf(':')).toDouble()
        val minutes = x.substring(x.indexOf(':') + 1).toDouble() / 60
        return hours + minutes
    }

    private val eOT: Double get() {
            val day = (JulianFields.JULIAN_DAY.getFrom(date) - 2451545).toDouble()
            val angdeg = resetAngle(357.529 + 0.98560028 * day)
            val q = resetAngle(280.459 + 0.98564736 * day)
            val L = resetAngle(
                q + 1.915 * sin(Math.toRadians(angdeg))
                        + 0.020 * sin(Math.toRadians(2 * angdeg))
            )
            val e = 23.439 - 0.00000036 * day
            val RA = resetAngle(
                toDegrees(
                    atan2(
                        cos(Math.toRadians(e))
                                * sin(Math.toRadians(L)), cos(Math.toRadians(L))
                    )
                )
            )
            if (date.monthValue == 3) {
                if (date.dayOfMonth == 20) return -7.3666666666666666666666666666667 / 60
                if (date.dayOfMonth == 21 || date.dayOfMonth == 22) return -7.0666666666666666666666666666667 / 60
            }
            return (q - RA) / 15
        }

    private fun resetAngle(a: Double): Double {
        var b = a
        b -= 360 * floor(b / 360.0)
        b = if (b < 0) b + 360 else b
        return b
    }

    fun getHourAngle(angle: Double): Double {
        return toDegrees(
            acos(
                (sin(Math.toRadians(angle)) - sin(Math.toRadians(declination)) * sin(Math.toRadians(latitude))) /
                        (cos(Math.toRadians(declination)) * cos(
                            Math.toRadians(
                                latitude
                            )
                        ))
            )
        )
    }

    val duhurTime: Double
        get() = 12 + offSetTime - longitude / 15 - eOT
    val asrTime: Double
        get() = if (method == Method.Standard_Method) duhurTime + getHourAngle(
            toDegrees(atan(1 / (1 + tan(Math.toRadians(Math.abs(declination - latitude))))))
        ) / 15
        else duhurTime + getHourAngle(toDegrees(atan(1 / (2 + tan(Math.toRadians(Math.abs(declination - latitude))))))) / 15
    val maghribTime: Double
        get() = duhurTime + getHourAngle(-0.833) / 15
    private val declination: Double
        get() = -23.45 * Math.cos(Math.toRadians(360.toDouble() / 365 * (date.dayOfYear + 10)))
    val ishaTime: Double
        get() = if (institution == Institution.Umm_Al_Qura_University_Mecca) maghribTime + 92.toDouble() / 60 else duhurTime + getHourAngle(
            institution!!.ishaAngle
        ) / 15
    val fajirTime: Double get() = duhurTime - getHourAngle(institution!!.fajirAngle) / 15
}