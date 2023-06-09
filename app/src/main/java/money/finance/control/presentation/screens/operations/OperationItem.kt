package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import money.finance.control.R
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.animationbox.AnimationBox
import money.finance.control.presentation.composecomponents.trackclick.track
import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationType
import java.text.DecimalFormat


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun OperationItem(modifier: Modifier = Modifier, operation: AccountOperation, totalSumma: Int) {

    val formatter = DecimalFormat("#.#")
    val selectedCard = remember { mutableStateOf(false) }
    val scaleCard = animateFloatAsState(if (selectedCard.value) 0.9f else 1f)
    val showDescription = remember { mutableStateOf(false) }

    AnimationBox {
        Card(
            modifier = modifier
                .fillMaxWidth()
                .scale(scaleCard.value)
                .padding(
                    start = AppTheme.dimens.sideMargin,
                    end = AppTheme.dimens.sideMargin,
                    bottom = AppTheme.dimens.sideMargin,
                    top = 2.dp
                )
                .shadow(
                    elevation = AppTheme.dimens.halfContentMargin,
                    shape = RoundedCornerShape(AppTheme.dimens.cornerRadius)
                )
                .clip(RoundedCornerShape(AppTheme.dimens.cornerRadius))
                .pointerInteropFilter { motionEvent ->
                    motionEvent
                        .track(
                            onSelected = { isSelected -> selectedCard.value = isSelected },
                            onCLick = { showDescription.value = !showDescription.value  }
                        )
                    true
                }
            ,
            elevation = CardDefaults.cardElevation(defaultElevation = AppTheme.dimens.halfContentMargin)
        ) {

            Column(
                modifier = Modifier
                    .background(color = AppTheme.colors.background)
                    .padding(AppTheme.dimens.contentMargin)
                    .animateContentSize(),
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Box(
                        modifier = Modifier
                            .padding(end = AppTheme.dimens.halfContentMargin)
                            .size(30.dp)
                            .background(
                                color = operation.color,
                                shape = RoundedCornerShape(
                                    topStart = AppTheme.dimens.halfContentMargin,
                                    topEnd = AppTheme.dimens.halfContentMargin,
                                    bottomStart = AppTheme.dimens.halfContentMargin,
                                    bottomEnd = AppTheme.dimens.halfContentMargin
                                )
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
//                            painter = painterResource(operation.iconId),
                            //Временно
                            painter = painterResource(id = R.drawable.ic_flash),
                            tint = AppTheme.colors.background,
                            contentDescription = "type icon"
                        )
                    }
                    Text(
                        modifier = Modifier.weight(1f),
                        text = operation.appointmentName,
                        style = AppTheme.typography.body1
                    )
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "${formatter.format(operation.score * 100 / totalSumma)}%",
                        style = AppTheme.typography.body1,
                        textAlign = TextAlign.End
                    )
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "${operation.score.toInt()}${operation.currency}",
                        style = AppTheme.typography.body1,
                        textAlign = TextAlign.End
                    )
                }

                if (showDescription.value) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = AppTheme.dimens.halfContentMargin,
                                end = AppTheme.dimens.halfContentMargin,
                                bottom = AppTheme.dimens.halfContentMargin,
                                top = AppTheme.dimens.contentMargin
                            ),
                        text = operation.description,
                        style = AppTheme.typography.body1,
                        textAlign = TextAlign.Start
                    )
                }
            }

        }
    }

}

@Preview(name = "OperationItem", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun OperationItemPreview() {
    FinanceControlTheme {
        OperationItem(
            operation = AccountOperation(
                id = 1L,
                operationType = OperationType.COST,
                description = "Первый",
                appointmentName = "Еда",
                score = 200.0F,
                currency = " р.",
                iconId = 0,
                color = AppTheme.colors.primaryVariant,

                ),
            totalSumma = 1000
        )
    }
}
