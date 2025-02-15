package kg.geeks.month6.ui.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun CharactersScreen(navController: NavHostController) {
    val characters = listOf("Rick", "Morty", "Summer")
    LazyColumn {
        items(characters) { character ->
            Text(text = character, modifier = Modifier.padding(16.dp))
        }
    }
}