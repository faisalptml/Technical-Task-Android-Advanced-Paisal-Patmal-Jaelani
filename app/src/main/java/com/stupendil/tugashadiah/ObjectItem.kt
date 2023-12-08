package com.stupendil.tugashadiah

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ObjectItem(
    val imgObjectItem: Int,
    val nameObject: String,
    val desctItem: String
) : Parcelable
