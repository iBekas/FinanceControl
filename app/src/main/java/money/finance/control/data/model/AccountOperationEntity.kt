package money.finance.control.data.model


data class AccountOperationEntity(
    val id: Long,
    val operationType: String,
    val score: Float,
    val currency: String,
    val description: String,
    val iconId: Int,
    val color: Int,
    val appointmentName: String
)
