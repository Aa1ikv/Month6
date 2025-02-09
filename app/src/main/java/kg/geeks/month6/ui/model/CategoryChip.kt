package kg.geeks.month6.ui.model

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.month6.ui.viewModel.BookViewModel


@Composable
fun CategoryChip(category: String, viewModel: BookViewModel) {
    val isSelected = viewModel.selectedCategory.value == category
    FilterChip(
        selected = isSelected,
        onClick = { viewModel.onCategorySelected(if (isSelected) null else category) },
        label = { Text(category) },
        modifier = Modifier.padding(end = 8.dp)
    )
}