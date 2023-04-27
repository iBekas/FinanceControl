package money.finance.control.presentation.composecomponents.animationbox

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.MutableTransitionState
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun AnimationBox(
    enter: EnterTransition = scaleIn(),
    exit: ExitTransition = scaleOut(),
    content: @Composable () -> Unit
) {
    val state = remember {
        MutableTransitionState(false).apply {
            targetState = true
        }
    }

    AnimatedVisibility(
        visibleState = state,
        enter = enter,
        exit = exit
    ) { content() }
}
