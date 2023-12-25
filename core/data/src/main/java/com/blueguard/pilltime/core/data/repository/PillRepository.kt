package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.model.Pill

interface PillRepository {
    suspend fun getPills(): List<Pill>
    suspend fun getPill(pillId: Int): Pill
    suspend fun insertPill(pill: Pill)
    suspend fun updatePill(pill: Pill)
    suspend fun deletePill(pill: Pill)
}