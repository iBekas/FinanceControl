package money.finance.control.presentation.model

import androidx.compose.ui.graphics.Color
import money.finance.control.data.model.AccountOperationEntity
import java.util.Random


object Mapper {

    private fun transformToPresentation(model: AccountOperationEntity): AccountOperation {
        //Временно
        val random = Random()
        return AccountOperation(
            id = model.id,
            operationType = transformOperationType(model.operationType),
            score = model.score,
            currency = model.currency,
            description = model.description,
            iconId = model.iconId,
        //Временно
            color = Color(android.graphics.Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
//            color = Color(model.color),
            appointmentName = model.appointmentName

        )
    }

    private fun transformOperationType(type: String): OperationType {
        return when(type) {
            "COST" -> OperationType.COST
            else -> OperationType.INCOME
        }
    }

    fun transformToPresentation(task: List<AccountOperationEntity>): List<AccountOperation> {
        return task.map { transformToPresentation(it) }
    }

}
