package com.timzowen.woofapp.module

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Woof(
    @DrawableRes val imageResourceId: Int,
    @StringRes val nameStringResourceId: Int,
    @StringRes val dogDescriptionResourceId: Int,
    val ageResource: Int
)
