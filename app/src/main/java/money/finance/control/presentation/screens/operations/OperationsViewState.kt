package money.finance.control.presentation.screens.operations

import money.finance.control.presentation.model.AccountOperation


data class OperationsViewState(
    val operations: List<AccountOperation> = emptyList(),
    val isLoading: Boolean = false,
)
