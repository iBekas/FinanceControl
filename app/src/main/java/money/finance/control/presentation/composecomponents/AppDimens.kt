package money.finance.control.presentation.composecomponents

import androidx.compose.runtime.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Stable
class AppDimens(
    sideMargin: Dp,
    inputsMargin: Dp,
    contentMargin: Dp,
    halfContentMargin: Dp,
    cornerRadius: Dp,
    buttonSideMargin: Dp,
    cardContentCompositeMargin: Dp,
    cardMargin: Dp,
    bigCardMargin: Dp,
    dialogMargin: Dp,
    cardPadding: Dp,
    tilPadding: Dp,
    textPadding: Dp,
    compoundDrawablePadding: Dp,
    cardElevation: Dp,
    cardBigElevation: Dp,
    toolbarElevation: Dp,
    bottomNavigationElevation: Dp,
    controlInsetVertical: Dp,
    controlInsetHorizontal: Dp,
    controlPaddingVertical: Dp,
    controlPaddingHorizontal: Dp,
    controlCornerRadius: Dp,
    cardBtnHeight: Dp,
    bigBtnHeight: Dp,
    bigBtnWidth: Dp,
    btnSize: Dp,
    bottomSheetPeakHeight: Dp,
    barSize: Dp,
    bigBarSize: Dp,
    touchTargetSize: Dp,
    fieldMediumSize: Dp,
    iconSize: Dp,
    badgeDrawerSize: Dp,
    badgeCardSize: Dp,
    bottomNavigationSize: Dp,
    colorIndicatorSize: Dp,
    navHeaderHeight: Dp,
    navHeaderPadding: Dp,
    navHeaderPaddingTop: Dp,
    reportFieldMinHeight: Dp,
    btnCornerRadius: Dp,
    btnMinWidth: Dp,
    mainBtnMinWidth: Dp,
    attachmentPreviewSize: Dp,
    textInputSize: Dp,
    gridCellMinSize: Dp,
    counterCardWidth: Dp,
    counterCardHeight: Dp,
    textBigTitle: TextUnit,
) {
    var sideMargin by mutableStateOf(sideMargin, structuralEqualityPolicy())
        internal set
    var inputsMargin by mutableStateOf(inputsMargin, structuralEqualityPolicy())
        internal set
    var contentMargin by mutableStateOf(contentMargin, structuralEqualityPolicy())
        internal set
    var halfContentMargin by mutableStateOf(halfContentMargin, structuralEqualityPolicy())
        internal set
    var cornerRadius by mutableStateOf(cornerRadius, structuralEqualityPolicy())
        internal set
    var buttonSideMargin by mutableStateOf(buttonSideMargin, structuralEqualityPolicy())
        internal set
    var cardContentCompositeMargin by mutableStateOf(cardContentCompositeMargin, structuralEqualityPolicy())
        internal set
    var cardMargin by mutableStateOf(cardMargin, structuralEqualityPolicy())
        internal set
    var bigCardMargin by mutableStateOf(bigCardMargin, structuralEqualityPolicy())
        internal set
    var dialogMargin by mutableStateOf(dialogMargin, structuralEqualityPolicy())
        internal set
    var cardPadding by mutableStateOf(cardPadding, structuralEqualityPolicy())
        internal set
    var tilPadding by mutableStateOf(tilPadding, structuralEqualityPolicy())
        internal set
    var textPadding by mutableStateOf(textPadding, structuralEqualityPolicy())
        internal set
    var compoundDrawablePadding by mutableStateOf(compoundDrawablePadding, structuralEqualityPolicy())
        internal set
    var cardElevation by mutableStateOf(cardElevation, structuralEqualityPolicy())
        internal set
    var cardBigElevation by mutableStateOf(cardBigElevation, structuralEqualityPolicy())
        internal set
    var toolbarElevation by mutableStateOf(toolbarElevation, structuralEqualityPolicy())
        internal set
    var bottomNavigationElevation by mutableStateOf(bottomNavigationElevation, structuralEqualityPolicy())
        internal set
    var controlInsetVertical by mutableStateOf(controlInsetVertical, structuralEqualityPolicy())
        internal set
    var controlInsetHorizontal by mutableStateOf(controlInsetHorizontal, structuralEqualityPolicy())
        internal set
    var controlPaddingVertical by mutableStateOf(controlPaddingVertical, structuralEqualityPolicy())
        internal set
    var controlPaddingHorizontal by mutableStateOf(controlPaddingHorizontal, structuralEqualityPolicy())
        internal set
    var controlCornerRadius by mutableStateOf(controlCornerRadius, structuralEqualityPolicy())
        internal set
    var cardBtnHeight by mutableStateOf(cardBtnHeight, structuralEqualityPolicy())
        internal set
    var bigBtnHeight by mutableStateOf(bigBtnHeight, structuralEqualityPolicy())
        internal set
    var bigBtnWidth by mutableStateOf(bigBtnWidth, structuralEqualityPolicy())
        internal set
    var btnSize by mutableStateOf(btnSize, structuralEqualityPolicy())
        internal set
    var bottomSheetPeakHeight by mutableStateOf(bottomSheetPeakHeight, structuralEqualityPolicy())
        internal set
    var barSize by mutableStateOf(barSize, structuralEqualityPolicy())
        internal set
    var bigBarSize by mutableStateOf(bigBarSize, structuralEqualityPolicy())
        internal set
    var touchTargetSize by mutableStateOf(touchTargetSize, structuralEqualityPolicy())
        internal set
    var fieldMediumSize by mutableStateOf(fieldMediumSize, structuralEqualityPolicy())
        internal set
    var iconSize by mutableStateOf(iconSize, structuralEqualityPolicy())
        internal set
    var badgeDrawerSize by mutableStateOf(badgeDrawerSize, structuralEqualityPolicy())
        internal set
    var badgeCardSize by mutableStateOf(badgeCardSize, structuralEqualityPolicy())
        internal set
    var bottomNavigationSize by mutableStateOf(bottomNavigationSize, structuralEqualityPolicy())
        internal set
    var colorIndicatorSize by mutableStateOf(colorIndicatorSize, structuralEqualityPolicy())
        internal set
    var navHeaderHeight by mutableStateOf(navHeaderHeight, structuralEqualityPolicy())
        internal set
    var navHeaderPadding by mutableStateOf(navHeaderPadding, structuralEqualityPolicy())
        internal set
    var navHeaderPaddingTop by mutableStateOf(navHeaderPaddingTop, structuralEqualityPolicy())
        internal set
    var reportFieldMinHeight by mutableStateOf(reportFieldMinHeight, structuralEqualityPolicy())
        internal set
    var btnCornerRadius by mutableStateOf(btnCornerRadius, structuralEqualityPolicy())
        internal set
    var btnMinWidth by mutableStateOf(btnMinWidth, structuralEqualityPolicy())
        internal set
    var mainBtnMinWidth by mutableStateOf(mainBtnMinWidth, structuralEqualityPolicy())
        internal set
    var attachmentPreviewSize by mutableStateOf(attachmentPreviewSize, structuralEqualityPolicy())
        internal set
    var textInputSize by mutableStateOf(textInputSize, structuralEqualityPolicy())
        internal set
    var textBigTitle by mutableStateOf(textBigTitle, structuralEqualityPolicy())
        internal set
    var gridCellMinSize by mutableStateOf(gridCellMinSize, structuralEqualityPolicy())
        internal set
    var counterCardWidth by mutableStateOf(counterCardWidth, structuralEqualityPolicy())
        internal set
    var counterCardHeight by mutableStateOf(counterCardHeight, structuralEqualityPolicy())
        internal set


}

fun normalDimensions(
    sideMargin: Dp = 16.dp,
    inputsMargin: Dp = 24.dp,
    contentMargin: Dp = 8.dp,
    halfContentMargin: Dp = 4.dp,
    cornerRadius: Dp = 16.dp, // неизменный для всех размеров
    buttonSideMargin: Dp = 8.dp,

    cardContentCompositeMargin: Dp = 24.dp,
    cardMargin: Dp = 8.dp,
    bigCardMargin: Dp = 16.dp,
    dialogMargin: Dp = 24.dp,
    cardPadding: Dp = 8.dp,
    tilPadding: Dp = 12.dp,
    textPadding: Dp = 4.dp,
    compoundDrawablePadding: Dp = 8.dp,

    cardElevation: Dp = 2.dp,
    cardBigElevation: Dp = 12.dp,
    toolbarElevation: Dp = 4.dp,
    bottomNavigationElevation: Dp = 8.dp,

    controlInsetVertical: Dp = 5.dp,
    controlInsetHorizontal: Dp = 4.dp,
    controlPaddingVertical: Dp = 4.dp,
    controlPaddingHorizontal: Dp = 8.dp,
    controlCornerRadius: Dp = 4.dp,

    cardBtnHeight: Dp = 48.dp,
    bigBtnHeight: Dp = 48.dp,
    bigBtnWidth: Dp = 180.dp,
    btnSize: Dp = 36.dp,

    bottomSheetPeakHeight: Dp = 50.dp,

    barSize: Dp = 48.dp,
    bigBarSize: Dp = 72.dp,

    touchTargetSize: Dp = 48.dp,
    fieldMediumSize: Dp = 160.dp,
    iconSize: Dp = 24.dp,
    badgeDrawerSize: Dp = 30.dp,
    badgeCardSize: Dp = 16.dp,

    bottomNavigationSize: Dp = 56.dp,

    colorIndicatorSize: Dp = 2.dp,

    navHeaderHeight: Dp = 120.dp,
    navHeaderPadding: Dp = 24.dp,
    navHeaderPaddingTop: Dp = 48.dp,

    reportFieldMinHeight: Dp = 36.dp,

    btnCornerRadius: Dp = 12.dp, // неизменный для всех размеров

    btnMinWidth: Dp = 50.dp,

    mainBtnMinWidth: Dp = 90.dp,

    attachmentPreviewSize: Dp = 48.dp,

    textInputSize: Dp = 40.dp,

    textBigTitle: TextUnit = 20.sp,

    gridCellMinSize: Dp = 128.dp,
    counterCardWidth: Dp = 100.dp,
    counterCardHeight: Dp = 150.dp
): AppDimens = AppDimens(
    sideMargin = sideMargin,
    inputsMargin = inputsMargin,
    contentMargin = contentMargin,
    halfContentMargin = halfContentMargin,
    cornerRadius = cornerRadius,
    buttonSideMargin = buttonSideMargin,
    cardContentCompositeMargin = cardContentCompositeMargin,
    cardMargin = cardMargin,
    bigCardMargin = bigCardMargin,
    dialogMargin = dialogMargin,
    cardPadding = cardPadding,
    tilPadding = tilPadding,
    textPadding = textPadding,
    compoundDrawablePadding = compoundDrawablePadding,
    cardElevation = cardElevation,
    cardBigElevation = cardBigElevation,
    toolbarElevation = toolbarElevation,
    bottomNavigationElevation = bottomNavigationElevation,
    controlInsetVertical = controlInsetVertical,
    controlInsetHorizontal = controlInsetHorizontal,
    controlPaddingVertical = controlPaddingVertical,
    controlPaddingHorizontal = controlPaddingHorizontal,
    controlCornerRadius = controlCornerRadius,
    cardBtnHeight = cardBtnHeight,
    bigBtnHeight = bigBtnHeight,
    bigBtnWidth = bigBtnWidth,
    btnSize = btnSize,
    bottomSheetPeakHeight = bottomSheetPeakHeight,
    barSize = barSize,
    bigBarSize = bigBarSize,
    touchTargetSize = touchTargetSize,
    fieldMediumSize = fieldMediumSize,
    iconSize = iconSize,
    badgeDrawerSize = badgeDrawerSize,
    badgeCardSize = badgeCardSize,
    bottomNavigationSize = bottomNavigationSize,
    colorIndicatorSize = colorIndicatorSize,
    navHeaderHeight = navHeaderHeight,
    navHeaderPadding = navHeaderPadding,
    navHeaderPaddingTop = navHeaderPaddingTop,
    reportFieldMinHeight = reportFieldMinHeight,
    btnCornerRadius = btnCornerRadius,
    btnMinWidth = btnMinWidth,
    mainBtnMinWidth = mainBtnMinWidth,
    attachmentPreviewSize = attachmentPreviewSize,
    textInputSize = textInputSize,
    textBigTitle = textBigTitle,
    gridCellMinSize = gridCellMinSize,
    counterCardWidth = counterCardWidth,
    counterCardHeight = counterCardHeight
)

fun sw360Dimensions(
    sideMargin: Dp = 12.dp,
    inputsMargin: Dp = 20.dp,
    contentMargin: Dp = 6.dp,
    halfContentMargin: Dp = 3.dp,
    cornerRadius: Dp = 16.dp, // неизменный для всех размеров
    buttonSideMargin: Dp = 6.dp,

    cardContentCompositeMargin: Dp = 24.dp,
    cardMargin: Dp = 8.dp,
    bigCardMargin: Dp = 16.dp,
    dialogMargin: Dp = 24.dp,
    cardPadding: Dp = 8.dp,
    tilPadding: Dp = 12.dp,
    textPadding: Dp = 4.dp,
    compoundDrawablePadding: Dp = 8.dp,

    cardElevation: Dp = 2.dp,
    cardBigElevation: Dp = 12.dp,
    toolbarElevation: Dp = 4.dp,
    bottomNavigationElevation: Dp = 8.dp,

    controlInsetVertical: Dp = 5.dp,
    controlInsetHorizontal: Dp = 4.dp,
    controlPaddingVertical: Dp = 4.dp,
    controlPaddingHorizontal: Dp = 8.dp,
    controlCornerRadius: Dp = 4.dp,

    cardBtnHeight: Dp = 36.dp,
    bigBtnHeight: Dp = 40.dp,
    bigBtnWidth: Dp = 170.dp,
    btnSize: Dp = 36.dp,

    bottomSheetPeakHeight: Dp = 50.dp,

    barSize: Dp = 40.dp,
    bigBarSize: Dp = 72.dp,

    touchTargetSize: Dp = 48.dp,
    fieldMediumSize: Dp = 160.dp,
    iconSize: Dp = 24.dp,
    badgeDrawerSize: Dp = 25.dp,
    badgeCardSize: Dp = 16.dp,

    bottomNavigationSize: Dp = 56.dp,

    colorIndicatorSize: Dp = 2.dp,

    navHeaderHeight: Dp = 120.dp,
    navHeaderPadding: Dp = 24.dp,
    navHeaderPaddingTop: Dp = 48.dp,

    reportFieldMinHeight: Dp = 36.dp,

    btnCornerRadius: Dp = 12.dp,

    btnMinWidth: Dp = 50.dp,

    mainBtnMinWidth: Dp = 90.dp,

    attachmentPreviewSize: Dp = 40.dp,

    textInputSize: Dp = 35.dp,

    textBigTitle: TextUnit = 20.sp,

    gridCellMinSize: Dp = 108.dp,
    counterCardWidth: Dp = 80.dp,
    counterCardHeight: Dp = 140.dp
): AppDimens = AppDimens(
    sideMargin = sideMargin,
    inputsMargin = inputsMargin,
    contentMargin = contentMargin,
    halfContentMargin = halfContentMargin,
    cornerRadius = cornerRadius,
    buttonSideMargin = buttonSideMargin,
    cardContentCompositeMargin = cardContentCompositeMargin,
    cardMargin = cardMargin,
    bigCardMargin = bigCardMargin,
    dialogMargin = dialogMargin,
    cardPadding = cardPadding,
    tilPadding = tilPadding,
    textPadding = textPadding,
    compoundDrawablePadding = compoundDrawablePadding,
    cardElevation = cardElevation,
    cardBigElevation = cardBigElevation,
    toolbarElevation = toolbarElevation,
    bottomNavigationElevation = bottomNavigationElevation,
    controlInsetVertical = controlInsetVertical,
    controlInsetHorizontal = controlInsetHorizontal,
    controlPaddingVertical = controlPaddingVertical,
    controlPaddingHorizontal = controlPaddingHorizontal,
    controlCornerRadius = controlCornerRadius,
    cardBtnHeight = cardBtnHeight,
    bigBtnHeight = bigBtnHeight,
    bigBtnWidth = bigBtnWidth,
    btnSize = btnSize,
    bottomSheetPeakHeight = bottomSheetPeakHeight,
    barSize = barSize,
    bigBarSize = bigBarSize,
    touchTargetSize = touchTargetSize,
    fieldMediumSize = fieldMediumSize,
    iconSize = iconSize,
    badgeDrawerSize = badgeDrawerSize,
    badgeCardSize = badgeCardSize,
    bottomNavigationSize = bottomNavigationSize,
    colorIndicatorSize = colorIndicatorSize,
    navHeaderHeight = navHeaderHeight,
    navHeaderPadding = navHeaderPadding,
    navHeaderPaddingTop = navHeaderPaddingTop,
    reportFieldMinHeight = reportFieldMinHeight,
    btnCornerRadius = btnCornerRadius,
    btnMinWidth = btnMinWidth,
    mainBtnMinWidth = mainBtnMinWidth,
    attachmentPreviewSize = attachmentPreviewSize,
    textInputSize = textInputSize,
    textBigTitle = textBigTitle,
    gridCellMinSize = gridCellMinSize,
    counterCardWidth = counterCardWidth,
    counterCardHeight = counterCardHeight
)
