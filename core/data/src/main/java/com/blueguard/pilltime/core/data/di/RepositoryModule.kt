package com.blueguard.pilltime.core.data.di

import com.blueguard.pilltime.core.data.repository.AlarmRepository
import com.blueguard.pilltime.core.data.repository.AlarmRepositoryImpl
import com.blueguard.pilltime.core.data.repository.PillRepository
import com.blueguard.pilltime.core.data.repository.PillRepositoryImpl
import com.blueguard.pilltime.core.data.repository.TimeRepository
import com.blueguard.pilltime.core.data.repository.TimeRepositoryImpl
import com.blueguard.pilltime.core.data.repository.TransactionRepository
import com.blueguard.pilltime.core.data.repository.TransactionRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

// todo: hilt 문제 생길시 여기 가능성 았음
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindsAlarmRepository(
        alarmRepositoryImpl: AlarmRepositoryImpl
    ): AlarmRepository
    @Binds
    abstract fun bindsPillRepository(
       pillRepositoryImpl: PillRepositoryImpl
    ): PillRepository
    @Binds
    abstract fun bindsTimeRepository(
        timeRepositoryImpl: TimeRepositoryImpl
    ): TimeRepository
    @Binds
    abstract fun bindsTransactionRepository(
        transactionRepositoryImpl: TransactionRepositoryImpl
    ): TransactionRepository
}