package money.finance.control.presentation.model

/**
 * @property id ID операции
 * @property operationType расходы или доходы
 * @property score сумма операции
 * @property currency валюта операции
 * @property description описание операции
 * @property appointmentType назначение операции (Еда, Транспорт и т.п.)
 */

data class AccountOperation(
    val id: Long,
    val operationType: OperationType,
    val score: Float,
    val currency: String,
    val description: String,
    val appointmentType: OperationAppointment
)

enum class OperationType {
    COST,
    INCOME
}
