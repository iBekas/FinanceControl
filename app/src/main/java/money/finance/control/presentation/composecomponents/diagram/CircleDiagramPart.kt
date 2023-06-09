package money.finance.control.presentation.composecomponents.diagram

import androidx.compose.ui.graphics.Color


data class CircleDiagramPart(
    val id: Long,
    val color: Color,
    val value: Int,
    val description:String,
    val isTapped:Boolean = false
)
