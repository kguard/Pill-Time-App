package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Alarm",
    foreignKeys = [
        ForeignKey(
            entity = PillEntity::class,
            parentColumns = ["pillId"],
            childColumns = ["pillId"]
        ),
        ForeignKey(
            entity = TimeEntity::class,
            parentColumns = ["timeId"],
            childColumns = ["timeId"]
        ),
        ForeignKey(
            entity = TransactionEntity::class,
            parentColumns = ["transactionId"],
            childColumns = ["transactionId"]
        )
    ]
)
data class AlarmEntity(
    @PrimaryKey(autoGenerate = true)
    val alarmId : Int = 0,
    @ColumnInfo(name = "pillId")
    val pillId : Int,
    @ColumnInfo(name = "timeId")
    val timeId : Int,
    @ColumnInfo(name = "transactionId")
    val transactionId : Int,
)