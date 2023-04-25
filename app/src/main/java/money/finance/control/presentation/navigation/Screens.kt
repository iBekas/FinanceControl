package money.finance.control.presentation.navigation


sealed class Screens(val route: String) {

    object RateScreen: Screens("rate_screen")

}
