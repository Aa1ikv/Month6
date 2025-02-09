package kg.geeks.month6.ui.navigation

import kg.geeks.month6.ui.model.Book


sealed class Screen {
    object BookList : Screen()
    data class BookDetail(val book: Book) : Screen()
}
