package money.finance.control.data

import money.finance.control.presentation.model.AccountOperation


interface AccountOperationRepository {

    fun getAccountOperation(): List<AccountOperation>
}
