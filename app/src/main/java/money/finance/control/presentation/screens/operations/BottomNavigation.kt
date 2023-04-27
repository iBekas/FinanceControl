package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import money.finance.control.R
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.trackclick.track
import money.finance.control.presentation.model.OperationType


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    selectedOperationType: OperationType,
    onEvent: (OperationsEvent) -> Unit,
    onAddCLick: () -> Unit,
) {

    val selectedIncome = remember { mutableStateOf(selectedOperationType == OperationType.INCOME) }
    val selectedCost = remember { mutableStateOf(selectedOperationType == OperationType.COST) }

    Box(
        modifier
            .height(120.dp)
            .fillMaxWidth()
            .padding(bottom = AppTheme.dimens.contentMargin),
        contentAlignment = Alignment.BottomCenter
    ) {

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .height(80.dp)
                .paint(
                    painter = painterResource(R.drawable.bottom_bar),
                    contentScale = ContentScale.FillHeight,
                    colorFilter = ColorFilter.tint(color = AppTheme.colors.secondary)
                )
                .padding(horizontal = 40.dp)
        ) {

            val selectedCostPress = remember { mutableStateOf(false) }
            val scaleCostPress = animateFloatAsState(if (selectedCostPress.value) 0.9f else 1f)

            val selectedIncomePress = remember { mutableStateOf(false) }
            val scaleIncomePress = animateFloatAsState(if (selectedIncomePress.value) 0.9f else 1f)


            //Расходы
            IconButton(
                onClick = {},
                modifier = Modifier
                    .width(60.dp)
                    .scale(scaleCostPress.value)
                    .pointerInteropFilter { motionEvent ->
                        motionEvent
                            .track(
                                onSelected = { isSelected -> selectedCostPress.value = isSelected },
                                onCLick = {
                                    selectedCost.value = true
                                    selectedIncome.value = false
                                    onEvent.invoke(OperationsEvent.SetSelectedOperationType(OperationType.COST))
                                }
                            )
                        true
                    }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_cost),
                        contentDescription = "cost",
                        tint =
                        if (selectedCost.value) AppTheme.colors.primaryVariant
                        else AppTheme.colors.primary
                    )
                    Text(
                        text = stringResource(id = R.string.cost),
                        textAlign = TextAlign.Center,
                        style = AppTheme.typography.body2,
                        color =
                        if (selectedCost.value) AppTheme.colors.primaryVariant
                        else AppTheme.colors.primary
                    )
                }
            }

            //Доходы
            IconButton(
                onClick = {},
                modifier = Modifier
                    .width(60.dp)
                    .scale(scaleIncomePress.value)
                    .pointerInteropFilter { motionEvent ->
                        motionEvent.track(
                            onSelected = { isSelected -> selectedIncomePress.value = isSelected },
                            onCLick = {
                                selectedIncome.value = true
                                selectedCost.value = false
                                onEvent.invoke(OperationsEvent.SetSelectedOperationType(OperationType.INCOME))
                            }
                        )
                        true
                    }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_income),
                        contentDescription = stringResource(id = R.string.cost),
                        tint =
                        if (selectedIncome.value) AppTheme.colors.primaryVariant
                        else AppTheme.colors.primary
                    )
                    Text(
                        text = stringResource(id = R.string.income),
                        textAlign = TextAlign.Center,
                        style = AppTheme.typography.body2,
                        color =
                        if (selectedIncome.value) AppTheme.colors.primaryVariant
                        else AppTheme.colors.primary
                    )
                }
            }

        }

        val selectedAdd = remember { mutableStateOf(false) }
        val scaleAdd = animateFloatAsState(if (selectedAdd.value) 0.9f else 1f)


        //Добавить
        FloatingActionButton(
            modifier = Modifier
                .scale(1.25f)
                .padding(22.dp)
                .offset(y = (-20).dp)
                .scale(scaleAdd.value)
                .pointerInteropFilter { motionEvent ->
                    motionEvent.track(
                        onSelected = { isSelected -> selectedAdd.value = isSelected },
                        onCLick = { onAddCLick.invoke() }
                    )
                    true
                },
            onClick = {},
            elevation = FloatingActionButtonDefaults.elevation(0.dp, 0.dp, 0.dp, 0.dp),
            contentColor = AppTheme.colors.secondary,
            containerColor = AppTheme.colors.secondaryVariant,
            shape = CircleShape,
        ) {
            Icon(
                modifier = Modifier.scale(1.5f),
                painter = painterResource(id = R.drawable.ic_plus),
                contentDescription = "add",
                tint = AppTheme.colors.primary
            )
        }

    }
}

@Preview(name = "BottomNavigation", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun BottomNavigationPreview() {
    FinanceControlTheme {
        BottomNavigation(Modifier, selectedOperationType = OperationType.COST, {}, {})
    }
}
