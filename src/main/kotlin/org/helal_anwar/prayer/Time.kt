package org.helal_anwar.prayer

import java.text.DateFormat
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalTime
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.math.floor
import kotlin.math.roundToInt

internal object Time {
    /**
     * @author Helal Anwar
     * @see Prayers
     *
     * @see SalahTime
     *
     * @see TimeFormat
     */
    fun formatTime(time: Double, format: TimeFormat?): String {
        var time = time
        time -= 24 * floor(time / 24)
        var hours = floor(time).toInt()
        var minutes = ((time - floor(time)) * 60).roundToInt()
        hours += minutes / 60
        minutes %= 60
        val value = (if (hours > 9) hours else "0$hours").toString() + ":" + if (minutes > 9) minutes else "0$minutes"
        return if (format == TimeFormat.TWELVE_HOURS) {
            to_12_hoursTimeZone(value)
        } else value
    }

    fun TimeDifference(time1: String?, time2: String?): LongArray {
        var difference_In_Minutes: Long = 0
        var difference_In_Hours: Long = 0
        val simpleDateFormat = SimpleDateFormat("HH:mm")
        try {
            val date1 = simpleDateFormat.parse(time1)
            val date2 = simpleDateFormat.parse(time2)
            val difference_In_Time = date2.time - date1.time
            difference_In_Minutes = TimeUnit.MILLISECONDS.toMinutes(difference_In_Time) % 60
            difference_In_Hours = TimeUnit.MILLISECONDS.toHours(difference_In_Time) % 24
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return longArrayOf(difference_In_Hours, difference_In_Minutes)
    }

    fun add(timing: String?, hours: Long, minutes: Long, timeFormat: TimeFormat?): String {
        val localTime = LocalTime.parse(timing)
        return if (timeFormat == TimeFormat.TWELVE_HOURS) to_12_hoursTimeZone(
            localTime.plusHours(
                hours
            ).plusMinutes(minutes).toString()
        ) else localTime.plusHours(hours).plusMinutes(minutes).toString()
    }

    private fun to_12_hoursTimeZone(timing: String): String {
        val dateFormat: DateFormat = SimpleDateFormat("HH:mm")
        val format: DateFormat = SimpleDateFormat("hh:mm aa")
        var time: Date? = null
        try {
            time = dateFormat.parse(timing)
        } catch (e: ParseException) {
            e.printStackTrace()
        }
        return format.format(time)
    }
}