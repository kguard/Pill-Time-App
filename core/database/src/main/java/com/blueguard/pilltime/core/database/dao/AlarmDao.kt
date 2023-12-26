package com.blueguard.pilltime.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import androidx.room.Update
import com.blueguard.pilltime.core.database.model.AlarmEntity

@Dao
interface AlarmDao {
    @Transaction
    @Query("SELECT * FROM `Transaction`")
    suspend fun getAlarms():List<AlarmEntity>

    @Transaction
    @Query("SELECT * FROM `Transaction` WHERE transactionId =:transactionId ")
    suspend fun getAlarm(transactionId: Int) : AlarmEntity
}