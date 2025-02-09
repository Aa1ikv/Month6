package kg.geeks.month6.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.month6.ui.model.CategoryChip
import kg.geeks.month6.ui.viewModel.BookViewModel


@Composable
fun BookFilterRow(viewModel: BookViewModel) {
    val categories = listOf("Фэнтези", "Фантастика", "Классика")
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        LazyRow {
            items(categories) { category ->
                CategoryChip(category = category, viewModel = viewModel)
            }
        }
    }
}
