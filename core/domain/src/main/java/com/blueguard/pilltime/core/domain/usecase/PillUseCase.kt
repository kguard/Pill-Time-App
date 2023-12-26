package com.blueguard.pilltime.core.domain.usecase

import com.blueguard.pilltime.core.data.repository.PillRepository
import com.blueguard.pilltime.core.model.Pill
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// get 하는 부분만 추가
// insert, update, delete 는 repository 사용 -> nowinandroid
class PillUseCase @Inject constructor(
    private val pillRepository: PillRepository
) {
    fun getPills(): Flow<List<Pill>> = flow {
        emit(pillRepository.getPills())
    }
    fun getPill(pillId : Int) : Flow<Pill> = flow {
        emit(pillRepository.getPill(pillId))
    }
}