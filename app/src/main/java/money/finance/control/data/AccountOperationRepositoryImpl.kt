package money.finance.control.data

import money.finance.control.data.model.AccountOperationEntity
import javax.inject.Inject


class AccountOperationRepositoryImpl @Inject constructor() : AccountOperationRepository {

    override fun getAccountOperation(): List<AccountOperationEntity> {
        return listOf(
            AccountOperationEntity(
                id = 1L,
                operationType = "COST",
                description = "Первый",
                appointmentName = "Еда",
                score = 200.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 2L,
                operationType = "COST",
                description = "Второй",
                appointmentName = "Лекарства",
                score = 300.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 3L,
                operationType = "COST",
                description = "Третий",
                appointmentName = "Спорт",
                score = 150.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 6L,
                operationType = "COST",
                description = "Первый",
                appointmentName = "Еда",
                score = 200.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 7L,
                operationType = "COST",
                description = "Второй",
                appointmentName = "Лекарства",
                score = 300.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 8L,
                operationType = "COST",
                description = "Третий",
                appointmentName = "Спорт",
                score = 150.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 9L,
                operationType = "COST",
                description = "Первый",
                appointmentName = "Еда",
                score = 200.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 10L,
                operationType = "COST",
                description = "Второй",
                appointmentName = "Лекарства",
                score = 300.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 11L,
                operationType = "COST",
                description = "Третий",
                appointmentName = "Спорт",
                score = 150.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 4L,
                operationType = "INCOME",
                description = "Четвертый",
                appointmentName = "Зарплата",
                score = 700.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),
            AccountOperationEntity(
                id = 5L,
                operationType = "INCOME",
                description = "Пятый",
                appointmentName = "Кэшбек",
                score = 350.0F,
                currency = " р.",
                iconId = 0,
                color = 0,
            ),

        )
    }

}
