package com.blueguard.pilltime.core.domain.usecase

import com.blueguard.pilltime.core.data.repository.TimeRepository
import com.blueguard.pilltime.core.model.Time
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// get 하는 부분만 추가
// insert, update, delete 는 repository 사용 -> nowinandroid
class TimeUseCase @Inject constructor(
    private val timeRepository: TimeRepository
) {
    fun getTimes(): Flow<List<Time>> = flow {
        emit(timeRepository.getTimes())
    }

    fun getTime(timeId: Int): Flow<Time> = flow {
        emit(timeRepository.getTime(timeId))
    }
}