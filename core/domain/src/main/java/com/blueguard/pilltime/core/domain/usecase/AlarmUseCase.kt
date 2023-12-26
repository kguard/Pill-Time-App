package com.blueguard.pilltime.core.domain.usecase

import com.blueguard.pilltime.core.data.repository.AlarmRepository
import com.blueguard.pilltime.core.model.Alarm
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

// get 하는 부분만 추가
// insert, update, delete 는 repository 사용 -> nowinandroid
class AlarmUseCase @Inject constructor(
    private val alarmRepository: AlarmRepository
) {
    fun getAlarms(): Flow<List<Alarm>> = flow {
        emit(alarmRepository.getAlarms())
    }

    fun getAlarm(transactionId: Int): Flow<Alarm> = flow {
        emit(alarmRepository.getAlarm(transactionId))
    }
}