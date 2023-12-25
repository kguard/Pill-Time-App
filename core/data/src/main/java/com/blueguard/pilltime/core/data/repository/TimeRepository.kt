package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.model.Time

interface TimeRepository {
    suspend fun getTimes(): List<Time>
    suspend fun getTime(timeId: Int): Time
    suspend fun insertTime(time: Time)
    suspend fun updateTime(time: Time)
    suspend fun deleteTime(time: Time)
}