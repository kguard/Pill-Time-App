package com.blueguard.pilltime.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.blueguard.pilltime.core.database.model.PillEntity


@Dao
interface PillDao {
    @Query("SELECT * FROM Pill")
    suspend fun getPills(): List<PillEntity>
    @Query("SELECT * FROM Pill WHERE pillId =:pillId ")
    suspend fun getPill(pillId: Int): PillEntity
    @Insert
    suspend fun insertPill(vararg pill: PillEntity)
    @Update
    suspend fun updatePill(vararg pill: PillEntity)
    @Delete
    suspend fun deletePill(vararg pill: PillEntity)
}