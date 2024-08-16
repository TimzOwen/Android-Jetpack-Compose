package com.timzowen.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @DrawableRes val drawableResourceId: Int,
    val courseNumber: Int,
    @StringRes val stringCourseResourceId: Int

)
