package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "Pill"
)
data class PillEntity(
    @PrimaryKey(autoGenerate = true)
    val pillId: Int = 0,
    @ColumnInfo(name = "PillName")
    val pillName: String
)