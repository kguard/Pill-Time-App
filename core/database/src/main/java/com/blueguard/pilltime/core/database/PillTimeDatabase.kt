package com.blueguard.pilltime.core.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.blueguard.pilltime.core.database.dao.AlarmDao
import com.blueguard.pilltime.core.database.dao.PillDao
import com.blueguard.pilltime.core.database.dao.TimeDao
import com.blueguard.pilltime.core.database.dao.TransactionDao
import com.blueguard.pilltime.core.database.model.AlarmEntity
import com.blueguard.pilltime.core.database.model.PillEntity
import com.blueguard.pilltime.core.database.model.TimeEntity
import com.blueguard.pilltime.core.database.model.TransactionEntity

@Database(
    entities = [
        PillEntity::class,
        AlarmEntity::class,
        TimeEntity::class,
        TransactionEntity::class
    ],
    version = 1,
    exportSchema = false
)
abstract class PillTimeDatabase : RoomDatabase() {
    abstract fun pillDao(): PillDao
    abstract fun alarmDao(): AlarmDao
    abstract fun timeDao(): TimeDao
    abstract fun transactionDao(): TransactionDao
}