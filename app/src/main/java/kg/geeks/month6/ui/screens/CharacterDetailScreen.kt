package kg.geeks.month6.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CharacterDetailScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Image(painter = painterResource(id = android.R.drawable.ic_menu_gallery), contentDescription = "Character Image")
        Text(text = "Имя: Rick")
        Text(text = "Статус: Жив")
        Text(text = "Вид: Человек")
        Text(text = "Пол: Мужской")
        Text(text = "Местоположение: Земля")
    }
}
