package com.example.loginactivity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserLogin(
    val username:String
):Parcelable
