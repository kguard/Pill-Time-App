package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Time")
data class TimeEntity(
    @PrimaryKey(autoGenerate = true)
    val timeId: Int = 0,
    @ColumnInfo(name = "Day")
    val day: String,
    @ColumnInfo(name = "Time")
    val time: String
)