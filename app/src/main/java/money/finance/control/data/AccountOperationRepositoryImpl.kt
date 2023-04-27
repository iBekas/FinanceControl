package money.finance.control.data

import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationAppointment
import money.finance.control.presentation.model.OperationType
import javax.inject.Inject


class AccountOperationRepositoryImpl @Inject constructor() : AccountOperationRepository {

    override fun getAccountOperation(): List<AccountOperation> {
        return listOf(
            AccountOperation(
                id = 1L,
                operationType = OperationType.COST,
                description = "Первый",
                appointmentType = OperationAppointment(name = "Еда", color = 0),
                score = 200.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 2L,
                operationType = OperationType.COST,
                description = "Второй",
                appointmentType = OperationAppointment(name = "Лекарства", color = 0),
                score = 300.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 3L,
                operationType = OperationType.COST,
                description = "Третий",
                appointmentType = OperationAppointment(name = "Спорт", color = 0),
                score = 150.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 4L,
                operationType = OperationType.INCOME,
                description = "Четвертый",
                appointmentType = OperationAppointment(name = "Зарплата", color = 0),
                score = 700.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 5L,
                operationType = OperationType.INCOME,
                description = "Пятый",
                appointmentType = OperationAppointment(name = "Кэшбек", color = 0),
                score = 350.0F,
                currency = " р."
            ),

        )
    }

}
