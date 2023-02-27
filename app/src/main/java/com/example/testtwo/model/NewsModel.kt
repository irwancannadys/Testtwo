package com.example.testtwo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NewsModel(
    val image: Int?,
    val title: String?,
    val subTitle: String?
) : Parcelable
