package money.finance.control.presentation.screens.operations

import money.finance.control.presentation.model.OperationType


sealed class OperationsEvent {

    object GetOperations: OperationsEvent()

    class SetSelectedOperationType(val selectedOperationType: OperationType): OperationsEvent()
}
