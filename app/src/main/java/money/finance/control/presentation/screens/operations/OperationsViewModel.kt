package money.finance.control.presentation.screens.operations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import money.finance.control.data.AccountOperationRepository
import money.finance.control.presentation.model.OperationType
import javax.inject.Inject


@HiltViewModel
class OperationsViewModel @Inject constructor(
    private val accountOperationRepository: AccountOperationRepository
) : ViewModel() {


    private val _viewState = MutableLiveData(OperationsViewState())
    val viewStateObs: LiveData<OperationsViewState> get() = _viewState
    private var viewState: OperationsViewState
        get() = _viewState.value!!
        set(value) {
            _viewState.value = value
        }

    init {
        getOperations()
    }

    fun submitUIEvent(event: OperationsEvent) {
        handleUIEvent(event)
    }

    private fun handleUIEvent(event: OperationsEvent) {
        when (event) {

            is OperationsEvent.SetSelectedOperationType -> setSelectedOperationType(event.selectedOperationType)
            OperationsEvent.GetOperations -> getOperations()

        }
    }


    private fun getOperations() {
        viewModelScope.launch {
            viewState = viewState.copy(isLoading = true)
            viewState = viewState.copy(
                operations = accountOperationRepository.getAccountOperation(),
                isLoading = false
            )
        }
    }

    private fun setSelectedOperationType(selectedOperationType: OperationType) {
        val operations = viewState.operations
        viewModelScope.launch {
            viewState = viewState.copy(operations = emptyList())
            delay(10)
            viewState = viewState.copy(operations = operations, selectedOperationType = selectedOperationType)
        }
    }

}
