package com.blueguard.pilltime.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.blueguard.pilltime.core.database.model.TimeEntity

@Dao
interface TimeDao {
    @Query("SELECT * FROM Time")
    suspend fun getTimes(): List<TimeEntity>
    @Query("SELECT * FROM Time WHERE timeId =:timeId ")
    suspend fun getTime(timeId: Int): TimeEntity
    @Insert
    suspend fun insertTime(vararg time: TimeEntity)
    @Update
    suspend fun updateTime(vararg time: TimeEntity)
    @Delete
    suspend fun deleteTime(vararg time: TimeEntity)
}