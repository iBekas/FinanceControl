package money.finance.control.presentation.screens.rate

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme


@Composable
fun RateScreen(navController: NavHostController) {

    Column(modifier = Modifier.background(AppTheme.colors.background)) {

        Spacer(modifier = Modifier.weight(1f))

        BottomNavigation(onCostCLick = {}, onIncomeCLick = {}, onAddCLick = {})
    }
}

@Preview(name = "RateScreen", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun RateScreenPreview() {
    FinanceControlTheme {
        RateScreen(navController = rememberNavController())
    }
}
