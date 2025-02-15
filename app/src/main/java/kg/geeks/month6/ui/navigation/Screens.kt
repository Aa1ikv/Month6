package kg.geeks.month6.ui.navigation

import kg.geeks.month6.ui.model.Book


sealed class Screen(val route: String, val title: String) {
    object Characters : Screen("characters", "Персонажи")
    object Locations : Screen("locations", "Локации")
    object Episodes : Screen("episodes", "Эпизоды")
    object CharacterDetail : Screen("characterDetail", "")
    object LocationDetail : Screen("locationDetail", "")
    object EpisodeDetail : Screen("episodeDetail", "")
    object Detail : Screen("detail", "")
}
