package kg.geeks.month6.ui.navigation

import BottomNavigationBar
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kg.geeks.month6.ui.screens.*

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val currentScreen = remember { mutableStateOf<Screen>(Screen.Characters) }

    Scaffold(
        topBar = {
            if (currentScreen.value !is Screen.Detail) {
                TopAppBar(title = { Text(currentScreen.value.title) })
            }
        },
        bottomBar = {
            if (currentScreen.value !is Screen.Detail) {
                BottomNavigationBar(navController)
            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = Screen.Characters.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(Screen.Characters.route) { CharactersScreen(navController) }
            composable(Screen.Locations.route) { LocationsScreen(navController) }
            composable(Screen.Episodes.route) { EpisodesScreen(navController) }
            composable(Screen.CharacterDetail.route) { CharacterDetailScreen() }
            composable(Screen.LocationDetail.route) { LocationDetailScreen() }
            composable(Screen.EpisodeDetail.route) { EpisodeDetailScreen() }
        }
    }
}



