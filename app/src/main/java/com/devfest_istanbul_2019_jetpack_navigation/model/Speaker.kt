package com.devfest_istanbul_2019_jetpack_navigation.model

import android.os.Parcelable
import com.devfest_istanbul_2019_jetpack_navigation.R
import kotlinx.android.parcel.Parcelize

/**
 *  Created by okan-aydin on 2019-11-23.
 */

@Parcelize
data class Speaker(
    val id: String,
    val image: Int,
    val name: String,
    val title: String,
    val session: String,
    val description: String,
    val location: String
) : Parcelable {
    companion object {
        fun getOkanInfo(): Speaker = Speaker(
            "0",
            R.drawable.okan,
            "Okan Aydın",
            "Jr Android Developer @ citizenMe",
            "Manage UI Navigation with Jetpack Navigation Component",
            "Okan is an Android developer at citizenMe. He's studying Computer Engineering at Isik University. He tries to improve himself on Android development and try to learn as much as he can and also He has been a volunteer organizer of the GDG Istanbul community for 4 years.",
            "Istanbul"

        )

        fun getMertInfo(): Speaker = Speaker(
            "1",
            R.drawable.mert,
            "Cafer Mert Ceyhan",
            "Android Developer @ Dolap",
            "Manage UI Navigation with Jetpack Navigation Component",
            "Mert is an Android Developer at dolap.com. He mainly focuses writing clean, readable and maintainable code. He improves himself by reading blog posts, following new technologies and attending to tech events. Also, Mert has been a user group member at Google Developers Groups (GDG) Istanbul. He believes and supports community spirit, learning and sharing.",
            "Istanbul"
        )
    }
}