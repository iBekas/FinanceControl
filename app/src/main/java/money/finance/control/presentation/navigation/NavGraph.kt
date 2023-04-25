package money.finance.control.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import money.finance.control.presentation.screens.rate.RateScreen


@Composable
fun NavGraph (navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screens.RateScreen.route)
    {
        composable(route = Screens.RateScreen.route){
            RateScreen(navController)
        }
    }
}
