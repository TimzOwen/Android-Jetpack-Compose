package com.timzowen.noteappmvvm.utils

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.Date

class DateTimeConverter {

    @TypeConverter
    fun timeStampFromDate(date: Date): Long{
        return date.time
    }

    @TypeConverter
    fun dateFromTimeStamp(timeStamp: Long): Date?{
        return Date(timeStamp)
    }
}