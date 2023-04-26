package money.finance.control.presentation.screens.operations

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import money.finance.control.data.AccountOperationRepository
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

    fun submitUIEvent(event: OperationsEvent) {
        handleUIEvent(event)
    }

    private fun handleUIEvent(event: OperationsEvent) {
        when (event) {

            OperationsEvent.GetOperations -> getOperations()

        }
    }


    private fun getOperations() {
        viewModelScope.launch {
            viewState = viewState.copy(isLoading = true)
            delay(1500)
            viewState = viewState.copy(
                operations = accountOperationRepository.getAccountOperation(),
                isLoading = false
            )
        }
    }

}
