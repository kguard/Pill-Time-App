package com.blueguard.pilltime.core.model

data class Transaction(
    val transactionId: Int,
    val onOff: Boolean,
    val activeType: Int,
    val endType: Int,
    val alarmName: String,
    val isAgain: Boolean
)