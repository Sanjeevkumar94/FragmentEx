package com.example.fragmentex.ParacebleDataSendToFragment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Employee(
    var name:String?=null,
    var password:String?=null
):Parcelable