package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.diagram.CircleDiagram
import money.finance.control.presentation.composecomponents.diagram.CircleDiagramPart
import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationAppointment
import money.finance.control.presentation.model.OperationType
import java.util.Random
import android.graphics.Color as ClassicColor


@Composable
fun OperationsScreen(
    navController: NavHostController,
    state: OperationsViewState,
    onSubmitEvent: (OperationsEvent) -> Unit
) {

    val items = state.filteredOperations

    Column(modifier = Modifier.background(AppTheme.colors.background)) {

        val diagramMaxHeight =
            LocalConfiguration.current.screenHeightDp.dp / (2.8f) // 35% экрана


        if (items.isNotEmpty())
            CircleDiagram(
                modifier = Modifier
                    .heightIn(max = diagramMaxHeight),
                radius = 300f,
                innerRadius = 200f,
                transparentWidth = 30f,
                input = items.toDiagramPart(),
                centerText = state.totalSumma().toString()
            )
        else {
            CircleDiagram(
                modifier = Modifier
                    .heightIn(max = diagramMaxHeight),
                radius = 300f,
                innerRadius = 200f,
                transparentWidth = 30f,
                input = listOf(
                    CircleDiagramPart(
                        color = AppTheme.colors.darkGray,
                        value = 100,
                        description = "",
                        isTapped = false
                    )
                ),
                centerText = state.totalSumma().toString()
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(bottom = AppTheme.dimens.contentMargin)
        ) {
            items(
                items = items,
                itemContent = { item ->
                    OperationItem(operation = item, totalSumma = state.totalSumma().toInt())
                }
            )
        }

        BottomNavigation(
            selectedOperationType = state.selectedOperationType,
            onEvent = { event -> onSubmitEvent.invoke(event)},
            onAddCLick = {})
    }

}

private fun List<AccountOperation>.toDiagramPart(): List<CircleDiagramPart> {
    return map {
        val random = Random()
        val color: Int = ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
        CircleDiagramPart(
            color = Color(color),
            value = it.score.toInt(),
            description = it.description,
            isTapped = false
        )
    }
}

@Preview(name = "OperationsScreen", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun OperationsScreenPreview() {
    FinanceControlTheme {
        OperationsScreen(navController = rememberNavController(),
            state = OperationsViewState(
                operations = listOf(
                    AccountOperation(
                        id = 1L,
                        operationType = OperationType.COST,
                        description = "Первый",
                        appointmentType = OperationAppointment(name = "Еда", color = 0),
                        score = 200.0F,
                        currency = " р."
                    ),
                    AccountOperation(
                        id = 2L,
                        operationType = OperationType.COST,
                        description = "Второй",
                        appointmentType = OperationAppointment(name = "Лекарства", color = 0),
                        score = 300.0F,
                        currency = " р."
                    ),
                    AccountOperation(
                        id = 3L,
                        operationType = OperationType.COST,
                        description = "Третий",
                        appointmentType = OperationAppointment(name = "Спорт", color = 0),
                        score = 150.0F,
                        currency = " р."
                    ),
                    AccountOperation(
                        id = 4L,
                        operationType = OperationType.INCOME,
                        description = "Четверты",
                        appointmentType = OperationAppointment(name = "Зарплата", color = 0),
                        score = 700.0F,
                        currency = " р."
                    ),
                    AccountOperation(
                        id = 5L,
                        operationType = OperationType.INCOME,
                        description = "Пятый",
                        appointmentType = OperationAppointment(name = "Кэшбек", color = 0),
                        score = 450.0F,
                        currency = " р."
                    ),
                ),
                isLoading = false
            ), onSubmitEvent = {})
    }
}
