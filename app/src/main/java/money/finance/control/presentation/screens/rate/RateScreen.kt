package money.finance.control.presentation.screens.rate

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.heightIn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.diagram.CircleDiagram
import money.finance.control.presentation.composecomponents.diagram.CircleDiagramPart


@Composable
fun RateScreen(navController: NavHostController) {

    Column(modifier = Modifier.background(AppTheme.colors.background)) {

        val diagramMaxHeight =
            LocalConfiguration.current.screenHeightDp.dp / (2f) // 50% экрана

        val parts = listOf(
            CircleDiagramPart(color = AppTheme.colors.secondary, value = 40, description = "Еда", isTapped = false),
            CircleDiagramPart(color = AppTheme.colors.secondaryVariant, value = 30, description = "Такси", isTapped = false),
            CircleDiagramPart(color = AppTheme.colors.darkGray, value = 30, description = "Лекарства аптека", isTapped = false),
            CircleDiagramPart(color = AppTheme.colors.secondary, value = 40, description = "Еда", isTapped = false),
            CircleDiagramPart(color = AppTheme.colors.secondaryVariant, value = 30, description = "Такси", isTapped = false),
            CircleDiagramPart(color = AppTheme.colors.darkGray, value = 30, description = "Лекарства", isTapped = false),
        )

        CircleDiagram(
            modifier = Modifier
                .heightIn(max = diagramMaxHeight),
            radius = 400f,
            innerRadius = 200f,
            transparentWidth = 0f,
            input = parts,
            centerText = "300 р."
        )

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
