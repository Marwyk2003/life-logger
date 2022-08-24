package com.example.lifelogger

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class EventData(
    val name: String,
    val date: String,
    val desc: String,
) : Parcelable
