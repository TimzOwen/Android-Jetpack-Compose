package com.timzowen.birthdayapp.courseApp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val courseName: Int,
    val courseEnrolment: Int,
    @DrawableRes val coursePreview: Int
)
