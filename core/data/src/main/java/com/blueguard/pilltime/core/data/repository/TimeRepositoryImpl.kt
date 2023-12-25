package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.database.dao.TimeDao
import com.blueguard.pilltime.core.database.model.TimeEntity
import com.blueguard.pilltime.core.database.model.asExternalModel
import com.blueguard.pilltime.core.model.Time
import javax.inject.Inject

class TimeRepositoryImpl @Inject constructor(
    private val timeDao: TimeDao
) : TimeRepository {
    override suspend fun getTimes(): List<Time> {
        return timeDao.getTimes().map { it.asExternalModel() }
    }

    override suspend fun getTime(timeId: Int): Time {
        return timeDao.getTime(timeId).asExternalModel()
    }

    override suspend fun insertTime(time: Time) {
        timeDao.insertTime(
            TimeEntity(
                timeId = time.timeId,
                transactionId = time.transactionId,
                time = time.time,
                day = time.day
            )
        )
    }

    override suspend fun updateTime(time: Time) {
        timeDao.updateTime(
            TimeEntity(
                timeId = time.timeId,
                transactionId = time.transactionId,
                time = time.time,
                day = time.day
            )
        )
    }

    override suspend fun deleteTime(time: Time) {
        timeDao.deleteTime(
            TimeEntity(
                timeId = time.timeId,
                transactionId = time.transactionId,
                time = time.time,
                day = time.day
            )
        )
    }
}