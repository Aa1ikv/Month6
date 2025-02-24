package kg.geeks.month6.ui.app.character

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CharacterDetailScreen(characterId: Int) {
    Text(text = "Character Details for Character #$characterId")
}