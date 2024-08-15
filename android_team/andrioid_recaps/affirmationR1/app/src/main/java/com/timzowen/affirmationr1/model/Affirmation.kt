package com.timzowen.affirmationr1.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId : Int
)
