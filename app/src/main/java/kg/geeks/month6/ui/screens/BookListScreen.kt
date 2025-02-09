package kg.geeks.month6.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.month6.ui.model.Book
import kg.geeks.month6.ui.viewModel.BookViewModel


@Composable
fun BookListScreen(viewModel: BookViewModel, onBookClick: (Book) -> Unit) {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        SearchBar(viewModel)
        BookFilterRow(viewModel)
        LazyColumn {
            items(viewModel.books.value) { book ->
                BookItem(book, onBookClick)
            }
        }
    }
}