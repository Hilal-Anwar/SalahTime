/*
    Copyright (C) 2021-22 Helal Anwar

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
import org.helal_anwar.prayer.prayer_Enums.IslamicMonths
import org.helal_anwar.prayer.prayer_Enums.IslamicWeek
import org.helal_anwar.prayer.prayer_Enums.TimeZones
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.LocalTime
import java.time.chrono.HijrahDate
import java.util.*
import java.util.stream.Collectors
import java.util.stream.IntStream
import kotlin.math.abs
import kotlin.math.floor

class SalahTime : PrayerTime {
    /**
     * @author Helal Anwar
     * @see Prayers
     *
     * @see SalahTime
     *
     * @see HijrahDate
     *
     * @see Time
     *
     * @see TimeFormat
     *
     * @see Institution
     *
     * @see IslamicMonths
     *
     * @see IslamicWeek
     *
     * @see org.helal_anwar.prayer.prayer_Enums.Method
     */
    constructor(latitude: Double, longitude: Double, timeZones: TimeZones, institution: Institution?) :
            super(latitude, longitude, timeZones, institution)

    constructor() : super() {

    }

    fun FajirTime(): String {
        return Time.formatTime(fajirTime, timeFormat)
    }

    fun DuhurTime(): String {
        return Time.formatTime(duhurTime, timeFormat)
    }

    fun AsrTime(): String {
        return Time.formatTime(asrTime, timeFormat)
    }

    fun IshaTime(): String {
        return if (institution == Institution.Umm_Al_Qura_University_Mecca && islamicMonth == IslamicMonths.Ramadan) Time.formatTime(
            maghribTime + 120.toDouble() / 60, timeFormat
        ) else Time.formatTime(
            ishaTime,
            timeFormat
        )
    }

    fun MaghribTime(): String {
        return Time.formatTime(maghribTime, timeFormat)
    }

    fun JummahTime(): String {
        return Time.add(Time.formatTime(duhurTime, TimeFormat.TWENTY_FOUR_HOURS), 1, 0, timeFormat)
    }

    fun TahajjudTime(): String {
        val k = Time.TimeDifference(
            Time.formatTime(maghribTime, TimeFormat.TWENTY_FOUR_HOURS),
            Time.formatTime(fajirTime, TimeFormat.TWENTY_FOUR_HOURS)
        )
        var x = abs(k[0]).toDouble() / 2
        x = (x - floor(x)) * 60
        val m = (abs(k[1]) + x.toInt()).toInt()
        return Time.add(
            Time.formatTime(maghribTime, TimeFormat.TWENTY_FOUR_HOURS), abs(
                k[0] / 2
            ),
            abs(m).toLong(), timeFormat
        )
    }

    fun allFivePrayers(): TreeMap<Prayers, String> {
        return if (date.dayOfWeek == DayOfWeek.FRIDAY) TreeMap(
            java.util.Map.of(
                Prayers.Fajir, FajirTime(),
                Prayers.Duhur, DuhurTime(), Prayers.Jummah, JummahTime(), Prayers.Asr, AsrTime(),
                Prayers.Maghrib, MaghribTime(), Prayers.Isha, IshaTime(), Prayers.Tahajjud, TahajjudTime()
            )
        ) else TreeMap(
            java.util.Map.of(
                Prayers.Fajir, FajirTime(),
                Prayers.Duhur, DuhurTime(), Prayers.Asr, AsrTime(),
                Prayers.Maghrib, MaghribTime(), Prayers.Isha, IshaTime(),
                Prayers.Tahajjud, TahajjudTime()
            )
        )
    }

    fun allFivePrayersHours(): TreeMap<Prayers, Double> {
        return TreeMap(
            java.util.Map.of(
                Prayers.Fajir, super.fajirTime,
                Prayers.Duhur, super.duhurTime, Prayers.Asr, super.asrTime,
                Prayers.Maghrib, super.maghribTime, Prayers.Isha, super.ishaTime
            )
        )
    }

    fun getPrayerFrom(from: LocalDate, till: LocalDate): TreeMap<LocalDate, Map<Prayers, String>> {
        var from = from
        val `val` = TreeMap<LocalDate, Map<Prayers, String>>()
        while (from.plusDays(1) != till) {
            date = from
            `val`[from] = allFivePrayers()
            from = from.plusDays(1)
        }
        return `val`
    }

    fun getPrayerFromInHours(from: LocalDate, till: LocalDate): TreeMap<LocalDate, Map<Prayers, Double>> {
        var from = from
        val `val` = TreeMap<LocalDate, Map<Prayers, Double>>()
        while (from.plusDays(1) != till) {
            date = from
            `val`[from] = allFivePrayersHours()
            from = from.plusDays(1)
        }
        return `val`
    }

    fun getPrayerTimeDifference(prayer1: Prayers, prayer2: Prayers): Map<String, Long> {
        val diff_time = Time.TimeDifference(getT(prayer1), getT(prayer2))
        return java.util.Map.of(
            "Hours", Math.abs(diff_time[0]), "Minutes", Math.abs(
                diff_time[1]
            )
        )
    }

    val islamicWeekDays: IslamicWeek?
        get() {
            val x: TreeMap<Int, IslamicWeek> = IntStream.range(0, 7).boxed()
                .collect(Collectors.toMap({ i: Int -> i + 1 },
                    { i: Int? -> IslamicWeek.values()[i!!] },
                    { a: IslamicWeek?, b: IslamicWeek? -> b }) { TreeMap() })
            return x[date.dayOfWeek.value]
        }
    val islamicMonth: IslamicMonths?
        get() {
            val x: TreeMap<Int, IslamicMonths> = IntStream.range(0, 12).boxed()
                .collect(Collectors.toMap({ i: Int -> i + 1 },
                    { i: Int? -> IslamicMonths.values()[i!!] },
                    { a: IslamicMonths?, b: IslamicMonths? -> b }) { TreeMap() })
            return x[islamicMonthValue]
        }

    private fun getT(p1: Prayers): String {
        return when (p1) {
            Prayers.Fajir -> FajirTime()
            Prayers.Duhur -> DuhurTime()
            Prayers.Asr -> AsrTime()
            Prayers.Maghrib -> MaghribTime()
            Prayers.Isha -> IshaTime()
            else -> throw IllegalStateException("Unexpected value: $p1")
        }
    }

    val islamicDateNow: HijrahDate
        get() = if (LocalTime.now().hour > Math.floor(maghribTime)) HijrahDate.from(date.plusDays(1)) else HijrahDate.from(
            date
        )
    val islamicDate: HijrahDate
        get() = HijrahDate.from(date)
    val islamicYear: String
        get() {
            val x = HijrahDate.from(date).toString()
            return x.substring(x.lastIndexOf(' ') + 1)
        }
    val islamicMonthValue: Int
        get() = islamicYear.substring(islamicYear.indexOf('-') + 1, islamicYear.lastIndexOf('-')).toInt()
}