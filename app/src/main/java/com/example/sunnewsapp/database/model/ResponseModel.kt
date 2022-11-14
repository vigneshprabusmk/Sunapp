package com.example.sunnewsapp.database.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyData(
    var id: Int? = 0,
    var name: String? = null,
    var image: String? = null,
    var video: String? = null,
    var inputQuantity: Int = 0,
    var description: String? = null
):Parcelable

data class Heros(
    var id: Int? = 0,
    var name: String? = null,
    var image: String? = null
)


data class Heroins(
    var id: Int? = 0,
    var name: String? = null,
    var image: String? = null
)