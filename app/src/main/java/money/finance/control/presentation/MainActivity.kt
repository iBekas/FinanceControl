package money.finance.control.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.navigation.NavGraph

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

                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {

                    val navController = rememberNavController()
                    NavGraph(navController = navController)

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
