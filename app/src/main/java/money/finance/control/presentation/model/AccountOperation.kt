package money.finance.control.presentation.model

/**
 * @property id ID операции
 * @property isIncome является ли доходом
 * @property score сумма операции
 * @property currency валюта операции
 * @property description описание операции
 * @property type тип операции
 */

data class AccountOperation(
    val id: Long,
    val isIncome: Boolean,
    val score: Float,
    val currency: String,
    val description: String,
    val type: OperationType
)
