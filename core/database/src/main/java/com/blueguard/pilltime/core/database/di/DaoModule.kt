package com.blueguard.pilltime.core.database.di

import com.blueguard.pilltime.core.database.PillTimeDatabase
import com.blueguard.pilltime.core.database.dao.AlarmDao
import com.blueguard.pilltime.core.database.dao.PillDao
import com.blueguard.pilltime.core.database.dao.TimeDao
import com.blueguard.pilltime.core.database.dao.TransactionDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {
    @Provides
    fun providePillDao(
        database: PillTimeDatabase,
    ): PillDao = database.pillDao()

    @Provides
    fun provideAlarmDao(
        database: PillTimeDatabase,
    ): AlarmDao = database.alarmDao()

    @Provides
    fun provideTimeDao(
        database: PillTimeDatabase,
    ): TimeDao = database.timeDao()

    @Provides
    fun provideTransactionDao(
        database: PillTimeDatabase,
    ): TransactionDao = database.transactionDao()

}