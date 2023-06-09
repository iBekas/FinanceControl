package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.diagram.CircleDiagram
import money.finance.control.presentation.composecomponents.diagram.CircleDiagramPart
import money.finance.control.presentation.model.AccountOperation
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
    val lazyColumnState = rememberLazyListState()
    val scope = rememberCoroutineScope()

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
                centerText = state.totalSumma().toString(),
                onClickPart = { operationId ->
                    scope.launch {
                        val index = items.indexOfFirst { it.id == operationId}
                        lazyColumnState.scrollToItem(index)
                    }
                }
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
                        id = 0,
                        color = AppTheme.colors.darkGray,
                        value = 100,
                        description = "",
                        isTapped = false
                    )
                ),
                centerText = state.totalSumma().toString(),
                onClickPart = {}
            )
        }

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
                .padding(bottom = AppTheme.dimens.contentMargin),
            state = lazyColumnState
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
        CircleDiagramPart(
            id = it.id,
            color = it.color,
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
        val random = Random()
        OperationsScreen(navController = rememberNavController(),
            state = OperationsViewState(
                operations = listOf(
                    AccountOperation(
                        id = 1L,
                        operationType = OperationType.COST,
                        description = "Первый",
                        appointmentName = "Еда",
                        score = 200.0F,
                        currency = " р.",
                        iconId = 0,
                        color = Color(ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
                    ),
                    AccountOperation(
                        id = 2L,
                        operationType = OperationType.COST,
                        description = "Второй",
                        appointmentName = "Лекарства",
                        score = 300.0F,
                        currency = " р.",
                        iconId = 0,
                        color = Color(ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
                    ),
                    AccountOperation(
                        id = 3L,
                        operationType = OperationType.COST,
                        description = "Третий",
                        appointmentName = "Спорт",
                        score = 150.0F,
                        currency = " р.",
                        iconId = 0,
                        color = Color(ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
                    ),
                    AccountOperation(
                        id = 4L,
                        operationType = OperationType.INCOME,
                        description = "Четверты",
                        appointmentName = "Зарплата",
                        score = 700.0F,
                        currency = " р.",
                        iconId = 0,
                        color = Color(ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
                    ),
                    AccountOperation(
                        id = 5L,
                        operationType = OperationType.INCOME,
                        description = "Пятый",
                        appointmentName = "Кэшбек",
                        score = 450.0F,
                        currency = " р.",
                        iconId = 0,
                        color = Color(ClassicColor.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))),
                    ),
                ),
                isLoading = false
            ), onSubmitEvent = {})
    }
}
