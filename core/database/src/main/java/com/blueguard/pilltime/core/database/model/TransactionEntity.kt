package com.blueguard.pilltime.core.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
    tableName = "Transaction"
)
data class TransactionEntity(
    @PrimaryKey(autoGenerate = true)
    val transactionId : Int = 0,
    @ColumnInfo(name = "OnOff")
    val onOff: Boolean,
    @ColumnInfo(name = "ActiveType")
    val activeType : Int,
    @ColumnInfo(name = "EndType")
    val endType :Int,
    @ColumnInfo(name = "AlarmName")
    val alarmName: String,
    @ColumnInfo(name = "IsLogin")
    val isLogin: Boolean
)