package kg.geeks.month6.ui.app.character

data class Character(
    val id: Int,
    val name: String,
    val status: String,
    val image: String
)
data class Location(
    val id: Int,
    val name: String
)
data class Episode(
    val id: Int,
    val title: String
)
