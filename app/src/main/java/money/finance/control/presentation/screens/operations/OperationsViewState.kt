package money.finance.control.presentation.screens.operations

import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationType


data class OperationsViewState(
    val operations: List<AccountOperation> = emptyList(),
    val isLoading: Boolean = false,
    val selectedOperationType: OperationType = OperationType.COST,
) {

    val filteredOperations = operations.filter { it.operationType == selectedOperationType }.sortedByDescending { it.score }

    fun totalSumma(): Float {
        var totalScore = 0f
        filteredOperations.map { it.score }.forEach { totalScore += it}
        return totalScore
    }

}
