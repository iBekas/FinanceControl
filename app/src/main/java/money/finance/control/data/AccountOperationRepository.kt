package money.finance.control.data

import money.finance.control.data.model.AccountOperationEntity


interface AccountOperationRepository {

    fun getAccountOperation(): List<AccountOperationEntity>
}
