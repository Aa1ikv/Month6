package kg.geeks.month6.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookCatalogApp() {
    val navController = rememberNavController()
    val viewModel: BookViewModel = viewModel()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Book Catalog") })
        },
        content = { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = Screen.BookList.route,
                modifier = Modifier.padding(paddingValues)
            ) {
                composable(Screen.BookList.route) {
                    BookListScreen(viewModel = viewModel, onBookClick = {
                        navController.navigate(Screen.BookDetail.createRoute(it))
                    })
                }
                composable(Screen.BookDetail.route) { backStackEntry ->
                    val bookId = backStackEntry.arguments?.getString("bookId")
                    val book = viewModel.getBookById(bookId)
                    BookDetailScreen(book = book, onBack = {
                        navController.popBackStack()
                    })
                }
            }
        }
    )
}
