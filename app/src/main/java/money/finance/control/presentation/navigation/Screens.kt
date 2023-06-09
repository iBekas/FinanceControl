package money.finance.control.presentation.navigation


sealed class Screens(val route: String) {

    object OperationsScreen: Screens("rate_screen")

}
