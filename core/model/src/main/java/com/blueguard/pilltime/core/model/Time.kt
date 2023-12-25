package com.blueguard.pilltime.core.model

data class Time(
    val timeId: Int,
    val transactionId: Int,
    val day: String,
    val time: String
)