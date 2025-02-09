package kg.geeks.month6.ui.viewModel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kg.geeks.month6.ui.model.Book
class BookViewModel : ViewModel() {
    private val allBooks = listOf(
        Book(1, "Гарри Поттер", "Дж. К. Роулинг", "Фэнтези о волшебнике", "Фэнтези"),
        Book(2, "Властелин колец", "Дж. Р. Р. Толкин", "Эпическое фэнтези", "Фэнтези"),
        Book(3, "1984", "Джордж Оруэлл", "Антиутопия о тоталитарном мире", "Фантастика"),
        Book(4, "Преступление и наказание", "Ф. Достоевский", "Психологический роман", "Классика"),
        Book(5, "Мастер и Маргарита", "М. Булгаков", "Мистика и сатира", "Классика")
    )

    var books = mutableStateOf(allBooks)
        private set

    var searchQuery = mutableStateOf("")
        private set

    var selectedCategory = mutableStateOf<String?>(null)
        private set

    fun onSearch(query: String) {
        searchQuery.value = query
        filterBooks()
    }

    fun onCategorySelected(category: String?) {
        selectedCategory.value = category
        filterBooks()
    }

    private fun filterBooks() {
        books.value = allBooks.filter {
            (selectedCategory.value == null || it.category == selectedCategory.value) &&
                    (searchQuery.value.isEmpty() || it.title.contains(searchQuery.value, ignoreCase = true) || it.author.contains(searchQuery.value, ignoreCase = true))
        }
    }
}
