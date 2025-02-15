import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import kg.geeks.month6.ui.navigation.Screen

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    NavigationBar {
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Characters.route) },
            label = { Text("Персонажи") },
            icon = { Icon(Icons.Default.List, contentDescription = "Персонажи") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Locations.route) },
            label = { Text("Локации") },
            icon = { Icon(Icons.Default.LocationOn, contentDescription = "Локации") }
        )
        NavigationBarItem(
            selected = false,
            onClick = { navController.navigate(Screen.Episodes.route) },
            label = { Text("Эпизоды") },
            icon = { Icon(Icons.Default.PlayArrow, contentDescription = "Эпизоды") }
        )
    }
}
