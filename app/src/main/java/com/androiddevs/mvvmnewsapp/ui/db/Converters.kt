package com.androiddevs.mvvmnewsapp.ui.db

import androidx.room.TypeConverter
import com.androiddevs.mvvmnewsapp.ui.models.Source

class Converters {

    @TypeConverter
    fun fromSourceToString(source: Source) : String {
            return source.name
    }

    @TypeConverter
    fun toSourceFromString(name: String) : Source {
        return Source(name, name)
    }
}