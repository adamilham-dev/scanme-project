package com.development.cancerdetection.domain.model

import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    val id: Int = 0,
    val imageUri: Uri,
    val label: String,
    val score: String,
    val date: String = "",
): Parcelable
