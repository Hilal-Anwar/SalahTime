package org.helal_anwar.prayer.prayer_Enums

enum class Institution(val fajirAngle: Double, val ishaAngle: Double) {
    /**
     * @author Helal Anwar
     *
     * https://en.wikipedia.org/wiki/Islamic_calendar
     */
    Egyptia_General_Authority_of_Survey(-19.5, -17.5), Institute_of_Geophysics_University_of_Tehran(
        -17.5,
        -14.0
    ),
    Islamic_Society_of_Northern_America(-15.0, -15.0), Muslim_World_League(
        -18.0,
        -17.0
    ),
    Shia_Ithna_Asharia_Leva_Research_Institute_Qum(-16.0, -14.0), Umm_Al_Qura_University_Mecca(
        -18.0,
        0.0
    ),
    University_of_Islamic_Science_Karachi(-18.0, -18.0);

}