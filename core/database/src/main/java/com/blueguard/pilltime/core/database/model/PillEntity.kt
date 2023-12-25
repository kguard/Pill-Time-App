package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.blueguard.pilltime.core.model.Pill

@Entity(
    tableName = "Pill",
    foreignKeys = [
        ForeignKey(
            entity = TransactionEntity::class,
            parentColumns = ["transactionId"],
            childColumns = ["transactionId"],
            onDelete = ForeignKey.CASCADE
        ),
    ]
)
data class PillEntity(
    @PrimaryKey(autoGenerate = true)
    val pillId: Int = 0,
    @ColumnInfo(name = "transactionId")
    val transactionId: Int,
    @ColumnInfo(name = "PillName")
    val pillName: String,

)

fun PillEntity.asExternalModel() = Pill(
    pillId = pillId,
    transactionId = transactionId,
    pillName = pillName
)