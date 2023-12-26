package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.database.dao.PillDao
import com.blueguard.pilltime.core.database.model.PillEntity
import com.blueguard.pilltime.core.database.model.asExternalModel
import com.blueguard.pilltime.core.model.Pill
import javax.inject.Inject

class PillRepositoryImpl @Inject constructor(
    private val pillDao: PillDao
) : PillRepository {
    override suspend fun getPills(): List<Pill> {
        return pillDao.getPills().map { it.asExternalModel() }
    }

    override suspend fun getPill(pillId: Int): Pill {
        return pillDao.getPill(pillId).asExternalModel()
    }

    override suspend fun insertPill(pill: Pill) {
        pillDao.insertPill(
            PillEntity(
                pillId = pill.pillId,
                transactionId = pill.transactionId,
                pillName = pill.pillName
            )
        )
    }

    override suspend fun updatePill(pill: Pill) {
        pillDao.updatePill(
            PillEntity(
                pillId = pill.pillId,
                transactionId = pill.transactionId,
                pillName = pill.pillName
            )
        )
    }

    override suspend fun deletePill(pill: Pill) {
        pillDao.deletePill(
            PillEntity(
                pillId = pill.pillId,
                transactionId = pill.transactionId,
                pillName = pill.pillName
            )
        )
    }
}