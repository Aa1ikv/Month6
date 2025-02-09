package kg.geeks.month6.ui.model

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import kg.geeks.month6.ui.navigation.Screen
import kg.geeks.month6.ui.screens.BookDetailScreen
import kg.geeks.month6.ui.screens.BookListScreen
import kg.geeks.month6.ui.viewModel.BookViewModel

@Composable
fun BookCatalogApp() {
    val viewModel: BookViewModel = viewModel()
    var currentScreen = remember { mutableStateOf<Screen>(Screen.BookList) }

    when (val screen = currentScreen.value) {
        is Screen.BookList -> BookListScreen(viewModel = viewModel, onBookClick = {
            currentScreen.value = Screen.BookDetail(it)
        })
        is Screen.BookDetail -> BookDetailScreen(book = screen.book, onBack = {
            currentScreen.value = Screen.BookList
        })
    }
}