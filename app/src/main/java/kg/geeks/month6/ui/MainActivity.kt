package kg.geeks.month6.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import kg.geeks.month6.ui.navigation.Screen
import kg.geeks.month6.ui.screens.BookDetailScreen
import kg.geeks.month6.ui.screens.BookListScreen
import kg.geeks.month6.ui.viewModel.BookViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BookCatalogApp()
        }
    }
}

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

