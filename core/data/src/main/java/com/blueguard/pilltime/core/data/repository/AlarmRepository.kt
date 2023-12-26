package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.model.Alarm

interface AlarmRepository {
    suspend fun getAlarms(): List<Alarm>
    suspend fun getAlarm(transactionId : Int): Alarm
}