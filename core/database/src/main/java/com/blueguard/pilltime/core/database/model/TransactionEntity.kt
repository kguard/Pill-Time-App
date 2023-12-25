package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blueguard.pilltime.core.model.Transaction


@Entity(
    tableName = "Transaction"
)
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val transactionId: Int = 0,
    @ColumnInfo(name = "OnOff")
    val onOff: Boolean,
    @ColumnInfo(name = "ActiveType",)
    val activeType: Int,
    @ColumnInfo(name = "EndType")
    val endType: Int,
    @ColumnInfo(name = "AlarmName")
    val alarmName: String,
    @ColumnInfo(name = "IsAgain")
    val isAgain: Boolean
)

fun TransactionEntity.asExternalModel() = Transaction(
    transactionId = transactionId,
    onOff = onOff,
    activeType = activeType,
    endType = endType,
    alarmName = alarmName,
    isAgain = isAgain
)