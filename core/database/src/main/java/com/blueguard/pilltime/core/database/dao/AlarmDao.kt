package com.blueguard.pilltime.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.blueguard.pilltime.core.database.model.AlarmEntity

@Dao
interface AlarmDao {
    @Query("SELECT * FROM Alarm")
    suspend fun getAlarms(): List<AlarmEntity>
    @Query("SELECT * FROM Alarm WHERE alarmId =:alarmId ")
    suspend fun getAlarm(alarmId: Int): AlarmEntity
    @Insert
    suspend fun insertAlarm(vararg alarm: AlarmEntity)
    @Update
    suspend fun updateAlarm(vararg alarm: AlarmEntity)
    @Delete
    suspend fun deleteAlarm(vararg alarm: AlarmEntity)
}