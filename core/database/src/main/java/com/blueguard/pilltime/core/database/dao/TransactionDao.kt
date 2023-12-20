package com.blueguard.pilltime.core.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.blueguard.pilltime.core.database.model.TransactionEntity

@Dao
interface TransactionDao {
    @Query("SELECT * FROM `Transaction`")
    suspend fun getTransactions(): List<TransactionEntity>
    @Query("SELECT * FROM `Transaction` WHERE transactionId =:transactionId ")
    suspend fun getTransaction(transactionId: Int): TransactionEntity
    @Insert
    suspend fun insertTransaction(vararg transaction: TransactionEntity)
    @Update
    suspend fun updateTransaction(vararg transaction: TransactionEntity)
    @Delete
    suspend fun deleteTransaction(vararg transaction: TransactionEntity)
}