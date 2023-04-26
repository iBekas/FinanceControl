package money.finance.control.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.navigation.Screens
import money.finance.control.presentation.screens.operations.OperationsScreen
import money.finance.control.presentation.screens.operations.OperationsViewModel


@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FinanceControlTheme {

                val systemUiController = rememberSystemUiController()
                systemUiController.setSystemBarsColor(
                    color = AppTheme.colors.secondary,
                    isNavigationBarContrastEnforced = false
                )

                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Screens.OperationsScreen.route
                )
                {

                    composable(route = Screens.OperationsScreen.route) {
                        val viewModel = hiltViewModel<OperationsViewModel>()
                        val state = viewModel.viewStateObs.observeAsState().value ?: return@composable
                        OperationsScreen(
                            navController,
                            state = state,
                            onSubmitEvent = { event -> viewModel.submitUIEvent(event) })
                    }

                }

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FinanceControlTheme {

    }
}
