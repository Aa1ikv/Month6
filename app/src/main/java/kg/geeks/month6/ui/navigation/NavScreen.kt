package kg.geeks.month6.ui.navigation

sealed class NavScreen {
    data object Home : NavScreen()
    data object DetailBook1 : NavScreen()
    data object DetailBook2 : NavScreen()
    data object DetailBook3 : NavScreen()

}