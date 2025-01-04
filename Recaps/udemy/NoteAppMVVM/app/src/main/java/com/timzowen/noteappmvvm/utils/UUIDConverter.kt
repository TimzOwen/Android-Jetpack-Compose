package com.timzowen.noteappmvvm.utils

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import java.util.UUID

class UUIDConverter {

    @TypeConverter
    fun fromUUID(uuid: UUID): String?{
        return  uuid.toString()
    }

    @TypeConverter
    fun uuidFromString(string: String?): UUID?{
        return UUID.fromString(string)
    }
}