package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.blueguard.pilltime.core.model.Time

@Entity(tableName = "Time",
    foreignKeys = [
        ForeignKey(
            entity = TransactionEntity::class,
            parentColumns = ["transactionId"],
            childColumns = ["transactionId"],
            onDelete = ForeignKey.CASCADE
        ),
    ])
data class TimeEntity(
    @PrimaryKey(autoGenerate = true)
    val timeId: Int = 0,
    @ColumnInfo(name = "transactionId")
    val transactionId: Int,
    @ColumnInfo(name = "Day")
    val day: String,
    @ColumnInfo(name = "Time")
    val time: String,
)

fun TimeEntity.asExternalModel() = Time(
    timeId = timeId,
    transactionId = transactionId,
    day = day,
    time = time
)