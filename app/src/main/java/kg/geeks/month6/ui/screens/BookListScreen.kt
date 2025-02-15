package kg.geeks.month6.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import kg.geeks.month6.ui.model.Book
import kg.geeks.month6.ui.viewModel.BookViewModel

@Composable
fun BookListScreen(viewModel: BookViewModel, onBookClick: (Book) -> Unit) {
    val books = viewModel.books

    Column(modifier = Modifier.padding(16.dp)) {
        books.forEach { book ->
            BookCard(book = book, onBookClick = onBookClick)
        }
    }
}

@Composable
fun BookCard(book: Book, onBookClick: (Book) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { onBookClick(book) }
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = rememberImagePainter(book.coverUrl),
                contentDescription = null,
                modifier = Modifier.size(80.dp),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.fillMaxHeight()) {
                Text(
                    text = book.title,
                    style = MaterialTheme.typography.titleMedium
                )
                Text(
                    text = "by ${book.author}",
                    style = MaterialTheme.typography.bodyMedium
                )
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = { onBookClick(book) }) {
                    Text(text = "View Details")
                }
            }
        }
    }
}
