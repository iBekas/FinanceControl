package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.composecomponents.animationbox.AnimationBox
import money.finance.control.presentation.composecomponents.trackclick.track
import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationAppointment
import money.finance.control.presentation.model.OperationType
import java.text.DecimalFormat


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun OperationItem(modifier: Modifier = Modifier, operation: AccountOperation, totalSumma: Int) {

    val formatter = DecimalFormat("#.#")
    val selectedCard = remember { mutableStateOf(false) }
    val scaleCard = animateFloatAsState(if (selectedCard.value) 0.9f else 1f)

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
                            onCLick = {}
                        )
                    true
                },
            elevation = CardDefaults.cardElevation(defaultElevation = AppTheme.dimens.halfContentMargin)
        ) {

            Row(
                modifier = Modifier
                    .background(color = AppTheme.colors.background)
                    .padding(AppTheme.dimens.contentMargin),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = operation.appointmentType.name,
                    style = AppTheme.typography.body1
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "${formatter.format(operation.score*100/totalSumma)}%",
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
                appointmentType = OperationAppointment(name = "Еда", color = 0),
                score = 200.0F,
                currency = " р."
            ),
            totalSumma = 1000
        )
    }
}
