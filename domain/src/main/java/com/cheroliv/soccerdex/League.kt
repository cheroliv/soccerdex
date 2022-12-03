@file:Suppress("unused")

package com.cheroliv.soccerdex

data class League(
    val idLeague: Long,
    val strLeague: String,
    val strSport: String,
    val strLeagueAlternate: String,
)

const val leagueSample = """
     {
            "idLeague": "4328",
            "strLeague": "English Premier League",
            "strSport": "Soccer",
            "strLeagueAlternate": "Premier League"
        }
"""