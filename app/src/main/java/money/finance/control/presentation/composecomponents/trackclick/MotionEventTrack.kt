package money.finance.control.presentation.composecomponents.trackclick

import android.view.MotionEvent

fun MotionEvent.track (onSelected: (Boolean) -> Unit, onCLick: () -> Unit) {
    when (this.action) {
        MotionEvent.ACTION_DOWN -> {
            onSelected.invoke(true)
        }
        MotionEvent.ACTION_UP -> {
            onSelected.invoke(false)
            onCLick.invoke()
        }
        MotionEvent.ACTION_CANCEL -> {
            onSelected.invoke(false)
        }
        MotionEvent.ACTION_POINTER_UP-> {
            onSelected.invoke(false)
        }
    }
}
