package com.blueguard.pilltime.core.domain.usecase

import com.blueguard.pilltime.core.data.repository.TransactionRepository
import com.blueguard.pilltime.core.model.Transaction
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// get 하는 부분만 추가
// insert, update, delete 는 repository 사용 -> nowinandroid
class TransactionUseCase @Inject constructor(
    private val transactionRepository: TransactionRepository
) {
    fun getTransactions(): Flow<List<Transaction>> = flow {
        emit(transactionRepository.getTransactions())
    }

    fun getTransaction(transactionId: Int): Flow<Transaction> = flow {
        emit(transactionRepository.getTransaction(transactionId))
    }
}