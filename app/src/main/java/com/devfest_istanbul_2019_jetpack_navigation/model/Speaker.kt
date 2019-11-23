package com.devfest_istanbul_2019_jetpack_navigation.model

import com.devfest_istanbul_2019_jetpack_navigation.R

/**
 *  Created by okan-aydin on 2019-11-23.
 */

data class Speaker(
    val id: String,
    val image: Int,
    val name: String,
    val title: String,
    val session: String
) {
    companion object {
        fun getOkanInfo(): Speaker = Speaker(
            "0",
            R.drawable.okan,
            "Okan Aydın",
            "Jr Android Developer @ citizenMe",
            "Manage UI Navigation with Jetpack Navigation Component"
        )

        fun getMertInfo(): Speaker = Speaker(
            "1",
            R.drawable.mert,
            "Cafer Mert Ceyhan",
            "Android Developer @ Dolap",
            "Manage UI Navigation with Jetpack Navigation Component"
        )
    }
}