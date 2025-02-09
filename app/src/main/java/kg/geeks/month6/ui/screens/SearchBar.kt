package kg.geeks.month6.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.month6.ui.viewModel.BookViewModel

@Composable
fun SearchBar(viewModel: BookViewModel) {
    val searchQuery = viewModel.searchQuery.value
    TextField(
        value = searchQuery,
        onValueChange = { viewModel.onSearch(it) },
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        label = { Text("Поиск по названию или автору") },
        singleLine = true,
        leadingIcon = {
            Icon(Icons.Default.Search, contentDescription = "Поиск")
        }
    )
}