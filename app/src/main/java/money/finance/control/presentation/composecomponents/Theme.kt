package money.finance.control.presentation.composecomponents

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration


private val LightColorPalette = lightColors()
private val DarkColorPalette = darkColors()

@Composable
fun FinanceControlTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    val configuration = LocalConfiguration.current

    val dimensions: AppDimens
    val typography: AppTypography

    when {
        configuration.screenWidthDp <= 360 -> {
            dimensions = sw360Dimensions()
            typography = sw360Typography()
        }
        else -> {
            dimensions = normalDimensions()
            typography = normalTypography()
        }
    }

    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppTypography provides typography,
        LocalAppShapes provides AppTheme.shapes,
        LocalRippleTheme provides WrsRippleTheme,
        LocalAppDimens provides dimensions,
        content = content,
    )
}
