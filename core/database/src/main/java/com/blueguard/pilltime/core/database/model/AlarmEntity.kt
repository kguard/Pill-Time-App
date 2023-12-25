package com.blueguard.pilltime.core.database.model

import androidx.room.Embedded
import androidx.room.Relation
import com.blueguard.pilltime.core.model.Alarm

data class AlarmEntity(
    @Embedded val transaction: TransactionEntity,
    @Relation(
        parentColumn = "transactionId",
        entityColumn = "pillId"
    )
    val pills: List<PillEntity>,
    @Relation(
        parentColumn = "transactionId",
        entityColumn = "timeId"
    )
    val times: List<TimeEntity>
)

fun AlarmEntity.asExternalModel() = Alarm(
    transactionId = transaction.transactionId,
    onOff = transaction.onOff,
    activeType = transaction.activeType,
    endType = transaction.endType,
    alarmName = transaction.alarmName,
    isAgain = transaction.isAgain,
    pills = pills.map { it.asExternalModel() },
    times = times.map { it.asExternalModel() }
)