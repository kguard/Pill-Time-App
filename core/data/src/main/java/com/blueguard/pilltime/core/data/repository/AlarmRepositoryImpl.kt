package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.database.dao.AlarmDao
import com.blueguard.pilltime.core.database.model.AlarmEntity
import com.blueguard.pilltime.core.database.model.asExternalModel
import com.blueguard.pilltime.core.model.Alarm
import javax.inject.Inject

class AlarmRepositoryImpl @Inject constructor(
    private val alarmDao: AlarmDao
) : AlarmRepository {
    override suspend fun getAlarms(): List<Alarm> {
        return alarmDao.getAlarms().map { it.asExternalModel() }
    }

    override suspend fun getAlarm(transactionId: Int): Alarm {
        return alarmDao.getAlarm(transactionId).asExternalModel()
    }
}