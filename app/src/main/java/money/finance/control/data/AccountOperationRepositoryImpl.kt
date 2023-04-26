package money.finance.control.data

import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationType
import javax.inject.Inject


class AccountOperationRepositoryImpl @Inject constructor() : AccountOperationRepository {

    override fun getAccountOperation(): List<AccountOperation> {
        return listOf(
            AccountOperation(
                id = 1L,
                isIncome = false,
                description = "Первый",
                type = OperationType(name = "Еда", color = 0),
                score = 200.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 2L,
                isIncome = false,
                description = "Второй",
                type = OperationType(name = "Лекарства", color = 0),
                score = 300.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 3L,
                isIncome = false,
                description = "Третий",
                type = OperationType(name = "Спорт", color = 0),
                score = 150.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 4L,
                isIncome = false,
                description = "Четвертый",
                type = OperationType(name = "ЖКХ", color = 0),
                score = 250.0F,
                currency = " р."
            ),
            AccountOperation(
                id = 5L,
                isIncome = false,
                description = "Пятый",
                type = OperationType(name = "Транспорт", color = 0),
                score = 350.0F,
                currency = " р."
            ),

        )
    }

}
