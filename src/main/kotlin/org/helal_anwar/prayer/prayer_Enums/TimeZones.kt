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
package org.helal_anwar.prayer.prayer_Enums

enum class TimeZones(val uTC_Value: String) {
    Pacific_Apia("UTC+14:00"), Pacific_Kiritimati("UTC+14:00"), Etc_GMT_14("UTC+14:00"), NZ_CHAT("UTC+13:45"), Pacific_Chatham(
        "UTC+13:45"
    ),
    Pacific_Fakaofo("UTC+13:00"), Antarctica_McMurdo("UTC+13:00"), Pacific_Enderbury("UTC+13:00"), NZ("UTC+13:00"), Antarctica_South_Pole(
        "UTC+13:00"
    ),
    Pacific_Auckland("UTC+13:00"), Pacific_Tongatapu("UTC+13:00"), Etc_GMT_13("UTC+13:00"), Pacific_Kwajalein("UTC+12:00"), Pacific_Wallis(
        "UTC+12:00"
    ),
    Pacific_Fiji("UTC+12:00"), Pacific_Funafuti("UTC+12:00"), Pacific_Nauru("UTC+12:00"), Kwajalein("UTC+12:00"), Pacific_Wake(
        "UTC+12:00"
    ),
    Pacific_Norfolk("UTC+12:00"), Pacific_Tarawa("UTC+12:00"), Asia_Kamchatka("UTC+12:00"), Etc_GMT_12("UTC+12:00"), Asia_Anadyr(
        "UTC+12:00"
    ),
    Pacific_Majuro("UTC+12:00"), Australia_Hobart("UTC+11:00"), Australia_Tasmania("UTC+11:00"), Australia_ACT("UTC+11:00"), Pacific_Ponape(
        "UTC+11:00"
    ),
    Pacific_Bougainville("UTC+11:00"), Australia_Victoria("UTC+11:00"), Antarctica_Macquarie("UTC+11:00"), Antarctica_Casey(
        "UTC+11:00"
    ),
    Australia_Canberra("UTC+11:00"), Australia_Currie("UTC+11:00"), Australia_Lord_Howe("UTC+11:00"), Australia_NSW("UTC+11:00"), Pacific_Pohnpei(
        "UTC+11:00"
    ),
    Pacific_Efate("UTC+11:00"), Asia_Magadan("UTC+11:00"), Pacific_Kosrae("UTC+11:00"), Australia_Sydney("UTC+11:00"), Australia_LHI(
        "UTC+11:00"
    ),
    Asia_Sakhalin("UTC+11:00"), Pacific_Noumea("UTC+11:00"), Etc_GMT_11("UTC+11:00"), Asia_Srednekolymsk("UTC+11:00"), Australia_Melbourne(
        "UTC+11:00"
    ),
    Pacific_Guadalcanal("UTC+11:00"), Australia_Yancowinna("UTC+10:30"), Australia_Adelaide("UTC+10:30"), Australia_Broken_Hill(
        "UTC+10:30"
    ),
    Australia_South("UTC+10:30"), Pacific_Yap("UTC+10:00"), Pacific_Port_Moresby("UTC+10:00"), Pacific_Chuuk("UTC+10:00"), Australia_Queensland(
        "UTC+10:00"
    ),
    Pacific_Guam("UTC+10:00"), Pacific_Truk("UTC+10:00"), Asia_Vladivostok("UTC+10:00"), Pacific_Saipan("UTC+10:00"), Antarctica_DumontDUrville(
        "UTC+10:00"
    ),
    Australia_Brisbane("UTC+10:00"), Etc_GMT_10("UTC+10:00"), Asia_Ust_Nera("UTC+10:00"), Australia_Lindeman("UTC+10:00"), Australia_North(
        "UTC+09:30"
    ),
    Australia_Darwin("UTC+09:30"), Etc_GMT_9("UTC+09:00"), Pacific_Palau("UTC+09:00"), Asia_Chita("UTC+09:00"), Asia_Dili(
        "UTC+09:00"
    ),
    Asia_Jayapura("UTC+09:00"), Asia_Yakutsk("UTC+09:00"), Asia_Pyongyang("UTC+09:00"), ROK("UTC+09:00"), Asia_Seoul("UTC+09:00"), Asia_Khandyga(
        "UTC+09:00"
    ),
    Japan("UTC+09:00"), Asia_Tokyo("UTC+09:00"), Australia_Eucla("UTC+08:45"), Asia_Kuching("UTC+08:00"), Asia_Chungking(
        "UTC+08:00"
    ),
    Etc_GMT_8("UTC+08:00"), Australia_Perth("UTC+08:00"), Asia_Macao("UTC+08:00"), Asia_Macau("UTC+08:00"), Asia_Choibalsan(
        "UTC+08:00"
    ),
    Asia_Shanghai("UTC+08:00"), Asia_Ulan_Bator("UTC+08:00"), Asia_Chongqing("UTC+08:00"), Asia_Ulaanbaatar("UTC+08:00"), Asia_Taipei(
        "UTC+08:00"
    ),
    Asia_Manila("UTC+08:00"), PRC("UTC+08:00"), Asia_Ujung_Pandang("UTC+08:00"), Asia_Harbin("UTC+08:00"), Singapore("UTC+08:00"), Asia_Brunei(
        "UTC+08:00"
    ),
    Australia_West("UTC+08:00"), Asia_Hong_Kong("UTC+08:00"), Asia_Makassar("UTC+08:00"), Hongkong("UTC+08:00"), Asia_Kuala_Lumpur(
        "UTC+08:00"
    ),
    Asia_Irkutsk("UTC+08:00"), Asia_Singapore("UTC+08:00"), Asia_Pontianak("UTC+07:00"), Etc_GMT_7("UTC+07:00"), Asia_Phnom_Penh(
        "UTC+07:00"
    ),
    Asia_Novosibirsk("UTC+07:00"), Antarctica_Davis("UTC+07:00"), Asia_Tomsk("UTC+07:00"), Asia_Jakarta("UTC+07:00"), Asia_Barnaul(
        "UTC+07:00"
    ),
    Indian_Christmas("UTC+07:00"), Asia_Ho_Chi_Minh("UTC+07:00"), Asia_Hovd("UTC+07:00"), Asia_Bangkok("UTC+07:00"), Asia_Vientiane(
        "UTC+07:00"
    ),
    Asia_Novokuznetsk("UTC+07:00"), Asia_Krasnoyarsk("UTC+07:00"), Asia_Saigon("UTC+07:00"), Asia_Yangon("UTC+06:30"), Asia_Rangoon(
        "UTC+06:30"
    ),
    Indian_Cocos("UTC+06:30"), Asia_Kashgar("UTC+06:00"), Etc_GMT_6("UTC+06:00"), Asia_Almaty("UTC+06:00"), Asia_Dacca("UTC+06:00"), Asia_Omsk(
        "UTC+06:00"
    ),
    Asia_Dhaka("UTC+06:00"), Indian_Chagos("UTC+06:00"), Asia_Qostanay("UTC+06:00"), Asia_Bishkek("UTC+06:00"), Antarctica_Vostok(
        "UTC+06:00"
    ),
    Asia_Urumqi("UTC+06:00"), Asia_Thimbu("UTC+06:00"), Asia_Thimphu("UTC+06:00"), Asia_Kathmandu("UTC+05:45"), Asia_Katmandu(
        "UTC+05:45"
    ),
    Asia_Kolkata("UTC+05:30"), Asia_Colombo("UTC+05:30"), Asia_Calcutta("UTC+05:30"), Asia_Aqtau("UTC+05:00"), Etc_GMT_5(
        "UTC+05:00"
    ),
    Asia_Samarkand("UTC+05:00"), Asia_Karachi("UTC+05:00"), Asia_Yekaterinburg("UTC+05:00"), Asia_Dushanbe("UTC+05:00"), Indian_Maldives(
        "UTC+05:00"
    ),
    Asia_Oral("UTC+05:00"), Asia_Tashkent("UTC+05:00"), Antarctica_Mawson("UTC+05:00"), Asia_Qyzylorda("UTC+05:00"), Asia_Aqtobe(
        "UTC+05:00"
    ),
    Asia_Ashkhabad("UTC+05:00"), Asia_Ashgabat("UTC+05:00"), Asia_Atyrau("UTC+05:00"), Indian_Kerguelen("UTC+05:00"), Iran(
        "UTC+04:30"
    ),
    Asia_Tehran("UTC+04:30"), Asia_Kabul("UTC+04:30"), Asia_Yerevan("UTC+04:00"), Etc_GMT_4("UTC+04:00"), Asia_Dubai("UTC+04:00"), Indian_Reunion(
        "UTC+04:00"
    ),
    Indian_Mauritius("UTC+04:00"), Europe_Saratov("UTC+04:00"), Europe_Samara("UTC+04:00"), Indian_Mahe("UTC+04:00"), Asia_Baku(
        "UTC+04:00"
    ),
    Asia_Muscat("UTC+04:00"), Europe_Volgograd("UTC+04:00"), Europe_Astrakhan("UTC+04:00"), Asia_Tbilisi("UTC+04:00"), Europe_Ulyanovsk(
        "UTC+04:00"
    ),
    Asia_Aden("UTC+03:00"), Africa_Nairobi("UTC+03:00"), Europe_Istanbul("UTC+03:00"), Etc_GMT_3("UTC+03:00"), Indian_Comoro(
        "UTC+03:00"
    ),
    Antarctica_Syowa("UTC+03:00"), Africa_Mogadishu("UTC+03:00"), Africa_Asmera("UTC+03:00"), Asia_Istanbul("UTC+03:00"), Europe_Moscow(
        "UTC+03:00"
    ),
    Africa_Djibouti("UTC+03:00"), Europe_Simferopol("UTC+03:00"), Africa_Asmara("UTC+03:00"), Asia_Baghdad("UTC+03:00"), Africa_Dar_es_Salaam(
        "UTC+03:00"
    ),
    Africa_Addis_Ababa("UTC+03:00"), Asia_Riyadh("UTC+03:00"), Asia_Kuwait("UTC+03:00"), Europe_Kirov("UTC+03:00"), Africa_Kampala(
        "UTC+03:00"
    ),
    Europe_Minsk("UTC+03:00"), Asia_Qatar("UTC+03:00"), Asia_Bahrain("UTC+03:00"), Indian_Antananarivo("UTC+03:00"), Indian_Mayotte(
        "UTC+03:00"
    ),
    Turkey("UTC+03:00"), Africa_Juba("UTC+03:00"), W_SU("UTC+03:00"), Africa_Cairo("UTC+02:00"), Africa_Mbabane("UTC+02:00"), Etc_GMT_2(
        "UTC+02:00"
    ),
    Europe_Zaporozhye("UTC+02:00"), Libya("UTC+02:00"), Africa_Kigali("UTC+02:00"), Africa_Tripoli("UTC+02:00"), Israel(
        "UTC+02:00"
    ),
    Europe_Kaliningrad("UTC+02:00"), Africa_Windhoek("UTC+02:00"), Europe_Bucharest("UTC+02:00"), Europe_Mariehamn("UTC+02:00"), Africa_Lubumbashi(
        "UTC+02:00"
    ),
    Europe_Tiraspol("UTC+02:00"), Europe_Chisinau("UTC+02:00"), Europe_Helsinki("UTC+02:00"), Asia_Beirut("UTC+02:00"), Asia_Tel_Aviv(
        "UTC+02:00"
    ),
    Europe_Sofia("UTC+02:00"), Africa_Gaborone("UTC+02:00"), Asia_Gaza("UTC+02:00"), Europe_Riga("UTC+02:00"), Africa_Maputo(
        "UTC+02:00"
    ),
    Asia_Damascus("UTC+02:00"), Europe_Uzhgorod("UTC+02:00"), Asia_Jerusalem("UTC+02:00"), Africa_Bujumbura("UTC+02:00"), Europe_Kiev(
        "UTC+02:00"
    ),
    Europe_Vilnius("UTC+02:00"), Africa_Maseru("UTC+02:00"), Africa_Blantyre("UTC+02:00"), Africa_Lusaka("UTC+02:00"), Africa_Harare(
        "UTC+02:00"
    ),
    Europe_Tallinn("UTC+02:00"), Africa_Khartoum("UTC+02:00"), Africa_Johannesburg("UTC+02:00"), Asia_Nicosia("UTC+02:00"), Asia_Famagusta(
        "UTC+02:00"
    ),
    EET("UTC+02:00"), Asia_Hebron("UTC+02:00"), Egypt("UTC+02:00"), Asia_Amman("UTC+02:00"), Europe_Nicosia("UTC+02:00"), Europe_Athens(
        "UTC+02:00"
    ),
    Europe_Brussels("UTC+01:00"), Europe_Warsaw("UTC+01:00"), CET("UTC+01:00"), Etc_GMT_1("UTC+01:00"), Europe_Luxembourg(
        "UTC+01:00"
    ),
    Africa_Tunis("UTC+01:00"), Europe_Malta("UTC+01:00"), Europe_Busingen("UTC+01:00"), Africa_Malabo("UTC+01:00"), Europe_Skopje(
        "UTC+01:00"
    ),
    Europe_Sarajevo("UTC+01:00"), Africa_Lagos("UTC+01:00"), Europe_Rome("UTC+01:00"), Africa_Algiers("UTC+01:00"), Europe_Zurich(
        "UTC+01:00"
    ),
    Europe_Gibraltar("UTC+01:00"), Europe_Vaduz("UTC+01:00"), Europe_Ljubljana("UTC+01:00"), Europe_Berlin("UTC+01:00"), Europe_Stockholm(
        "UTC+01:00"
    ),
    Europe_Budapest("UTC+01:00"), Europe_Zagreb("UTC+01:00"), Europe_Paris("UTC+01:00"), Africa_Ndjamena("UTC+01:00"), Africa_Ceuta(
        "UTC+01:00"
    ),
    Europe_Prague("UTC+01:00"), Europe_Copenhagen("UTC+01:00"), Europe_Vienna("UTC+01:00"), Europe_Tirane("UTC+01:00"), MET(
        "UTC+01:00"
    ),
    Europe_Amsterdam("UTC+01:00"), Africa_Libreville("UTC+01:00"), Africa_El_Aaiun("UTC+01:00"), Europe_San_Marino("UTC+01:00"), Africa_Douala(
        "UTC+01:00"
    ),
    Africa_Brazzaville("UTC+01:00"), Africa_Porto_Novo("UTC+01:00"), Poland("UTC+01:00"), Europe_Andorra("UTC+01:00"), Europe_Oslo(
        "UTC+01:00"
    ),
    Europe_Podgorica("UTC+01:00"), Africa_Casablanca("UTC+01:00"), Africa_Luanda("UTC+01:00"), Atlantic_Jan_Mayen("UTC+01:00"), Africa_Kinshasa(
        "UTC+01:00"
    ),
    Europe_Madrid("UTC+01:00"), Africa_Bangui("UTC+01:00"), Europe_Belgrade("UTC+01:00"), Africa_Niamey("UTC+01:00"), Europe_Bratislava(
        "UTC+01:00"
    ),
    Arctic_Longyearbyen("UTC+01:00"), Europe_Vatican("UTC+01:00"), Europe_Monaco("UTC+01:00"), Europe_London("UTC+00:00"), GMT(
        "UTC+00:00"
    ),
    Etc_GMT_0("UTC+00:00"), Europe_Jersey("UTC+00:00"), Atlantic_St_Helena("UTC+00:00"), Europe_Guernsey("UTC+00:00"), Europe_Isle_of_Man(
        "UTC+00:00"
    ),
    Africa_Banjul("UTC+00:00"), Etc_GMT("UTC+00:00"), Africa_Freetown("UTC+00:00"), GB_Eire("UTC+00:00"), Africa_Bamako(
        "UTC+00:00"
    ),
    GB("UTC+00:00"), Africa_Conakry("UTC+00:00"), Portugal("UTC+00:00"), Universal("UTC+00:00"), Africa_Sao_Tome("UTC+00:00"), Africa_Nouakchott(
        "UTC+00:00"
    ),
    Antarctica_Troll("UTC+00:00"), UTC("UTC+00:00"), Etc_Universal("UTC+00:00"), Atlantic_Faeroe("UTC+00:00"), Africa_Abidjan(
        "UTC+00:00"
    ),
    Eire("UTC+00:00"), Africa_Accra("UTC+00:00"), Atlantic_Faroe("UTC+00:00"), Etc_UCT("UTC+00:00"), GMT0("UTC+00:00"), Europe_Dublin(
        "UTC+00:00"
    ),
    Zulu("UTC+00:00"), Africa_Ouagadougou("UTC+00:00"), Atlantic_Reykjavik("UTC+00:00"), Atlantic_Madeira("UTC+00:00"), Etc_Zulu(
        "UTC+00:00"
    ),
    Iceland("UTC+00:00"), Europe_Lisbon("UTC+00:00"), Atlantic_Canary("UTC+00:00"), Africa_Lome("UTC+00:00"), Greenwich(
        "UTC+00:00"
    ),
    Europe_Belfast("UTC+00:00"), Etc_GMT0("UTC+00:00"), America_Danmarkshavn("UTC+00:00"), Africa_Dakar("UTC+00:00"), Africa_Bissau(
        "UTC+00:00"
    ),
    WET("UTC+00:00"), Etc_Greenwich("UTC+00:00"), Africa_Timbuktu("UTC+00:00"), UCT("UTC+00:00"), Africa_Monrovia("UTC+00:00"), Etc_UTC(
        "UTC+00:00"
    ),
    Atlantic_Cape_Verde("UTC-01:00"), Atlantic_Azores("UTC-01:00"), America_Scoresbysund("UTC-01:00"), America_Miquelon(
        "UTC-02:00"
    ),
    America_Noronha("UTC-02:00"), Brazil_DeNoronha("UTC-02:00"), Atlantic_South_Georgia("UTC-02:00"), America_St_Johns("UTC-02:30"), Canada_Newfoundland(
        "UTC-02:30"
    ),
    Chile_Continental("UTC-03:00"), America_Argentina_Catamarca("UTC-03:00"), Canada_Atlantic("UTC-03:00"), America_Argentina_Cordoba(
        "UTC-03:00"
    ),
    America_Araguaina("UTC-03:00"), America_Argentina_Salta("UTC-03:00"), America_Montevideo("UTC-03:00"), Brazil_East("UTC-03:00"), America_Argentina_Mendoza(
        "UTC-03:00"
    ),
    America_Argentina_Rio_Gallegos("UTC-03:00"), America_Catamarca("UTC-03:00"), America_Godthab("UTC-03:00"), America_Cordoba(
        "UTC-03:00"
    ),
    America_Sao_Paulo("UTC-03:00"), America_Argentina_Jujuy("UTC-03:00"), America_Cayenne("UTC-03:00"), America_Recife("UTC-03:00"), America_Buenos_Aires(
        "UTC-03:00"
    ),
    America_Paramaribo("UTC-03:00"), America_Moncton("UTC-03:00"), America_Mendoza("UTC-03:00"), America_Santarem("UTC-03:00"), America_Asuncion(
        "UTC-03:00"
    ),
    Atlantic_Bermuda("UTC-03:00"), America_Maceio("UTC-03:00"), Atlantic_Stanley("UTC-03:00"), America_Halifax("UTC-03:00"), Antarctica_Rothera(
        "UTC-03:00"
    ),
    America_Argentina_San_Luis("UTC-03:00"), America_Santiago("UTC-03:00"), America_Argentina_Ushuaia("UTC-03:00"), Antarctica_Palmer(
        "UTC-03:00"
    ),
    America_Punta_Arenas("UTC-03:00"), America_Glace_Bay("UTC-03:00"), America_Fortaleza("UTC-03:00"), America_Thule("UTC-03:00"), America_Argentina_La_Rioja(
        "UTC-03:00"
    ),
    America_Belem("UTC-03:00"), America_Jujuy("UTC-03:00"), America_Bahia("UTC-03:00"), America_Goose_Bay("UTC-03:00"), America_Argentina_San_Juan(
        "UTC-03:00"
    ),
    America_Argentina_ComodRivadavia("UTC-03:00"), America_Argentina_Tucuman("UTC-03:00"), America_Nuuk("UTC-03:00"), America_Rosario(
        "UTC-03:00"
    ),
    America_Argentina_Buenos_Aires("UTC-03:00"), America_Cuiaba("UTC-04:00"), America_Marigot("UTC-04:00"), America_Indiana_Petersburg(
        "UTC-04:00"
    ),
    America_Grand_Turk("UTC-04:00"), Cuba("UTC-04:00"), America_Manaus("UTC-04:00"), America_Fort_Wayne("UTC-04:00"), America_St_Thomas(
        "UTC-04:00"
    ),
    America_Anguilla("UTC-04:00"), America_Havana("UTC-04:00"), US_Michigan("UTC-04:00"), America_Barbados("UTC-04:00"), America_Louisville(
        "UTC-04:00"
    ),
    America_Curacao("UTC-04:00"), America_Guyana("UTC-04:00"), America_Martinique("UTC-04:00"), America_Puerto_Rico("UTC-04:00"), America_Port_of_Spain(
        "UTC-04:00"
    ),
    SystemV_AST4("UTC-04:00"), America_Indiana_Vevay("UTC-04:00"), America_Indiana_Vincennes("UTC-04:00"), America_Kralendijk(
        "UTC-04:00"
    ),
    America_Antigua("UTC-04:00"), America_Indianapolis("UTC-04:00"), America_Iqaluit("UTC-04:00"), America_St_Vincent("UTC-04:00"), America_Kentucky_Louisville(
        "UTC-04:00"
    ),
    America_Dominica("UTC-04:00"), EST5EDT("UTC-04:00"), America_Nassau("UTC-04:00"), America_Kentucky_Monticello("UTC-04:00"), Brazil_West(
        "UTC-04:00"
    ),
    America_Aruba("UTC-04:00"), America_Indiana_Indianapolis("UTC-04:00"), America_La_Paz("UTC-04:00"), America_Thunder_Bay(
        "UTC-04:00"
    ),
    America_Indiana_Marengo("UTC-04:00"), America_Blanc_Sablon("UTC-04:00"), America_Santo_Domingo("UTC-04:00"), US_Eastern(
        "UTC-04:00"
    ),
    Canada_Eastern("UTC-04:00"), America_Port_au_Prince("UTC-04:00"), America_St_Barthelemy("UTC-04:00"), America_Nipigon(
        "UTC-04:00"
    ),
    US_East_Indiana("UTC-04:00"), America_St_Lucia("UTC-04:00"), America_Montserrat("UTC-04:00"), America_Lower_Princes(
        "UTC-04:00"
    ),
    America_Detroit("UTC-04:00"), America_Tortola("UTC-04:00"), America_Porto_Velho("UTC-04:00"), America_Campo_Grande("UTC-04:00"), America_Virgin(
        "UTC-04:00"
    ),
    America_Pangnirtung("UTC-04:00"), America_Montreal("UTC-04:00"), America_Indiana_Winamac("UTC-04:00"), America_Boa_Vista(
        "UTC-04:00"
    ),
    America_Grenada("UTC-04:00"), America_New_York("UTC-04:00"), America_St_Kitts("UTC-04:00"), America_Caracas("UTC-04:00"), America_Guadeloupe(
        "UTC-04:00"
    ),
    SystemV_AST4ADT("UTC-04:00"), America_Toronto("UTC-04:00"), America_Panama("UTC-05:00"), America_Chicago("UTC-05:00"), America_Eirunepe(
        "UTC-05:00"
    ),
    Pacific_Easter("UTC-05:00"), America_Porto_Acre("UTC-05:00"), America_Guayaquil("UTC-05:00"), America_Rankin_Inlet("UTC-05:00"), US_Central(
        "UTC-05:00"
    ),
    America_Rainy_River("UTC-05:00"), America_Indiana_Knox("UTC-05:00"), America_North_Dakota_Beulah("UTC-05:00"), America_Jamaica(
        "UTC-05:00"
    ),
    America_Atikokan("UTC-05:00"), America_Coral_Harbour("UTC-05:00"), America_North_Dakota_Center("UTC-05:00"), America_Cayman(
        "UTC-05:00"
    ),
    America_Indiana_Tell_City("UTC-05:00"), Chile_EasterIsland("UTC-05:00"), America_Matamoros("UTC-05:00"), CST6CDT("UTC-05:00"), America_Knox_IN(
        "UTC-05:00"
    ),
    America_Bogota("UTC-05:00"), America_Menominee("UTC-05:00"), America_Resolute("UTC-05:00"), SystemV_EST5("UTC-05:00"), Canada_Central(
        "UTC-05:00"
    ),
    Brazil_Acre("UTC-05:00"), America_Cancun("UTC-05:00"), America_Lima("UTC-05:00"), US_Indiana_Starke("UTC-05:00"), America_Rio_Branco(
        "UTC-05:00"
    ),
    Jamaica("UTC-05:00"), America_North_Dakota_New_Salem("UTC-05:00"), America_Winnipeg("UTC-05:00"), SystemV_EST5EDT("UTC-05:00"), America_El_Salvador(
        "UTC-06:00"
    ),
    America_Guatemala("UTC-06:00"), America_Belize("UTC-06:00"), America_Managua("UTC-06:00"), America_Tegucigalpa("UTC-06:00"), America_Regina(
        "UTC-06:00"
    ),
    America_Denver("UTC-06:00"), Mexico_General("UTC-06:00"), Pacific_Galapagos("UTC-06:00"), America_Yellowknife("UTC-06:00"), America_Swift_Current(
        "UTC-06:00"
    ),
    America_Inuvik("UTC-06:00"), America_Boise("UTC-06:00"), America_Costa_Rica("UTC-06:00"), MST7MDT("UTC-06:00"), America_Monterrey(
        "UTC-06:00"
    ),
    SystemV_CST6("UTC-06:00"), America_Ojinaga("UTC-06:00"), US_Mountain("UTC-06:00"), America_Mexico_City("UTC-06:00"), America_Edmonton(
        "UTC-06:00"
    ),
    America_Bahia_Banderas("UTC-06:00"), Canada_Mountain("UTC-06:00"), America_Cambridge_Bay("UTC-06:00"), SystemV_CST6CDT(
        "UTC-06:00"
    ),
    Navajo("UTC-06:00"), America_Merida("UTC-06:00"), Canada_Saskatchewan("UTC-06:00"), America_Shiprock("UTC-06:00"), Canada_Yukon(
        "UTC-07:00"
    ),
    US_Arizona("UTC-07:00"), Mexico_BajaSur("UTC-07:00"), America_Dawson_Creek("UTC-07:00"), Canada_Pacific("UTC-07:00"), PST8PDT(
        "UTC-07:00"
    ),
    America_Mazatlan("UTC-07:00"), SystemV_MST7("UTC-07:00"), America_Dawson("UTC-07:00"), Mexico_BajaNorte("UTC-07:00"), America_Tijuana(
        "UTC-07:00"
    ),
    America_Chihuahua("UTC-07:00"), America_Creston("UTC-07:00"), America_Hermosillo("UTC-07:00"), America_Santa_Isabel(
        "UTC-07:00"
    ),
    America_Vancouver("UTC-07:00"), America_Ensenada("UTC-07:00"), America_Phoenix("UTC-07:00"), America_Whitehorse("UTC-07:00"), SystemV_MST7MDT(
        "UTC-07:00"
    ),
    America_Fort_Nelson("UTC-07:00"), America_Los_Angeles("UTC-07:00"), US_Pacific("UTC-07:00"), US_Alaska("UTC-08:00"), America_Juneau(
        "UTC-08:00"
    ),
    America_Metlakatla("UTC-08:00"), America_Yakutat("UTC-08:00"), Pacific_Pitcairn("UTC-08:00"), America_Sitka("UTC-08:00"), America_Anchorage(
        "UTC-08:00"
    ),
    SystemV_PST8("UTC-08:00"), America_Nome("UTC-08:00"), SystemV_PST8PDT("UTC-08:00"), Pacific_Gambier("UTC-09:00"), America_Atka(
        "UTC-09:00"
    ),
    SystemV_YST9("UTC-09:00"), America_Adak("UTC-09:00"), US_Aleutian("UTC-09:00"), SystemV_YST9YDT("UTC-09:00"), Pacific_Marquesas(
        "UTC-09:30"
    ),
    Pacific_Honolulu("UTC-10:00"), Pacific_Rarotonga("UTC-10:00"), Pacific_Tahiti("UTC-10:00"), Pacific_Johnston("UTC-10:00"), US_Hawaii(
        "UTC-10:00"
    ),
    SystemV_HST10("UTC-10:00"), Pacific_Pago_Pago("UTC-11:00"), Pacific_Samoa("UTC-11:00"), Pacific_Niue("UTC-11:00"), US_Samoa(
        "UTC-11:00"
    ),
    Pacific_Midway("UTC-11:00");

}