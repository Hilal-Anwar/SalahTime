package org.helal_anwar

import org.helal_anwar.prayer.SalahTime
import org.helal_anwar.prayer.prayer_Enums.Institution
import org.helal_anwar.prayer.prayer_Enums.TimeZones
import java.time.LocalDate

fun main() {
    println("Namaz time for jamshedpur/Jharkhand/India/Asia lat:22.805618 , long:86.2029 and offsetTime/timezone:5.5 hours")
    println("Timing form date 2021-01-01 to 2022-01-01 ")
    println()
    val salahTime =
        SalahTime(22.805618, 86.2029, TimeZones.Asia_Kolkata, Institution.University_of_Islamic_Science_Karachi)
    val x = salahTime.getPrayerFrom(LocalDate.parse("2021-01-01"), LocalDate.parse("2022-01-01"))
    for (d in x.keys) {
        salahTime.date = d
        println(d.toString() + "," + salahTime.islamicYear + "," + salahTime.islamicMonth + "," + salahTime.islamicWeekDays + "," + x[d])
    }
}