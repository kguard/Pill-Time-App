package com.blueguard.pilltime.core.data.repository

import com.blueguard.pilltime.core.database.dao.TransactionDao
import com.blueguard.pilltime.core.database.model.TransactionEntity
import com.blueguard.pilltime.core.database.model.asExternalModel
import com.blueguard.pilltime.core.model.Transaction
import javax.inject.Inject

class TransactionRepositoryImpl @Inject constructor(
    private val transactionDao: TransactionDao
) : TransactionRepository {
    override suspend fun getTransactions(): List<Transaction> {
        return transactionDao.getTransactions().map { it.asExternalModel() }
    }

    override suspend fun getTransaction(transactionId: Int): Transaction {
        return transactionDao.getTransaction(transactionId).asExternalModel()
    }

    override suspend fun insertTransaction(transaction: Transaction) {
        transactionDao.insertTransaction(
            TransactionEntity(
                transactionId = transaction.transactionId,
                onOff = transaction.onOff,
                activeType = transaction.activeType,
                endType = transaction.endType,
                alarmName = transaction.alarmName,
                isAgain = transaction.isAgain
            )
        )
    }

    override suspend fun updateTransaction(transaction: Transaction) {
        transactionDao.updateTransaction(
            TransactionEntity(
                transactionId = transaction.transactionId,
                onOff = transaction.onOff,
                activeType = transaction.activeType,
                endType = transaction.endType,
                alarmName = transaction.alarmName,
                isAgain = transaction.isAgain
            )
        )
    }

    override suspend fun deleteTransaction(transaction: Transaction) {
        transactionDao.deleteTransaction(
            TransactionEntity(
                transactionId = transaction.transactionId,
                onOff = transaction.onOff,
                activeType = transaction.activeType,
                endType = transaction.endType,
                alarmName = transaction.alarmName,
                isAgain = transaction.isAgain
            )
        )
    }
}