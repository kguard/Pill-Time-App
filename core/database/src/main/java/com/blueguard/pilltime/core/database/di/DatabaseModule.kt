package com.blueguard.pilltime.core.database.di

import android.content.Context
import androidx.room.Room
import com.blueguard.pilltime.core.database.PillTimeDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun providePillTimeDatabase(
        @ApplicationContext context: Context
    ): PillTimeDatabase =
        Room.databaseBuilder(context, PillTimeDatabase::class.java, "pillTime-database").build()
}
