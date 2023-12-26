package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.model.Transaction

interface TransactionRepository {
    suspend fun getTransactions(): List<Transaction>
    suspend fun getTransaction(transactionId: Int): Transaction
    suspend fun insertTransaction(transaction: Transaction)
    suspend fun updateTransaction(transaction: Transaction)
    suspend fun deleteTransaction(transaction: Transaction)
}