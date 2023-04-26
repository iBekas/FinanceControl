package money.finance.control.presentation.screens.operations

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import money.finance.control.presentation.composecomponents.AppTheme
import money.finance.control.presentation.composecomponents.FinanceControlTheme
import money.finance.control.presentation.model.AccountOperation
import money.finance.control.presentation.model.OperationType


@Composable
fun OperationItem(modifier: Modifier = Modifier, operation: AccountOperation, totalSumma: Int) {

    Card(
        modifier = modifier
            .fillMaxWidth()
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
            .clip(RoundedCornerShape(AppTheme.dimens.cornerRadius)),
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
                text = operation.type.name,
                style = AppTheme.typography.body1
            )
            Text(
                modifier = Modifier.weight(1f),
                text = "${(totalSumma/operation.score).toInt()}%",
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

@Preview(name = "OperationItem", uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
private fun OperationItemPreview() {
    FinanceControlTheme {
        OperationItem(
            operation = AccountOperation(
                id = 1L,
                isIncome = false,
                description = "Первый",
                type = OperationType(name = "Еда", color = 0),
                score = 200.0F,
                currency = " р."
            ),
            totalSumma = 1000
        )
    }
}
