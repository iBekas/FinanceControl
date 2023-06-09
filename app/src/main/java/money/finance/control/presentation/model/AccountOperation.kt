package money.finance.control.presentation.model

import androidx.compose.ui.graphics.Color

/**
 * @property id ID операции
 * @property operationType расходы или доходы
 * @property score сумма операции
 * @property currency валюта операции
 * @property description описание операции
 * @property iconId id иконки
 * @property color цвет иконки и диаграммы
 * @property appointmentName название операции (Еда, Транспорт и т.п.)
 */

data class AccountOperation(
    val id: Long,
    val operationType: OperationType,
    val score: Float,
    val currency: String,
    val description: String,
    val iconId: Int = 2131099652,
    val color: Color,
    val appointmentName: String
)

enum class OperationType {
    COST,
    INCOME
}
