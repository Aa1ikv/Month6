package kg.geeks.month6.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun EpisodesScreen(navController: NavHostController) {
    Text(text = "Список эпизодов", modifier = Modifier.padding(16.dp))
}