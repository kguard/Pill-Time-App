package com.blueguard.pilltime.core.model

data class Alarm(
    val transactionId: Int,
    val onOff: Boolean,
    val activeType: Int,
    val endType: Int,
    val alarmName: String,
    val isAgain: Boolean,
    val pills :  List<Pill>,
    val times : List<Time>
)