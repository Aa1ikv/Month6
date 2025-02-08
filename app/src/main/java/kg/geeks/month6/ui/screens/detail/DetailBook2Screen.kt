package kg.geeks.month6.ui.screens.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.geeks.month6.R

@Composable
fun DetailBook2Screen(){
    Scaffold { paddingValue ->
        Column(
            modifier = Modifier
                .padding(paddingValue)
                .fillMaxSize()
        ){
            Text(
                modifier = Modifier
                    .padding(top = 20.dp, start = 20.dp),
                text = "Название:",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_bold))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp),
                text = "Чистый код",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
                text = "Перевод с англ.:",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_bold))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp),
                text = "Е. А. Матвеев",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
                text = "Издательство:",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_bold))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp),
                text = "«Питер», 2021 год, 464 с.",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
                text = "Ориг. название:",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_bold))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp),
                text = "Clean Code: A Handbook of Agile Software Craftsmanship by Robert C. Martin",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 20.dp),
                text = "Сложность:",
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_bold))
            )
            Text(
                modifier = Modifier
                    .padding(start = 20.dp, top = 10.dp),
                text = "Начинающим программистам иногда кажется, что раз программа заработала, то и ладно. Ни к чему с ней дальше возиться: незачем тщательно продумывать структуру классов, обрабатывать все граничные условия и уж тем более заботиться о говорящих именах переменных, полезных комментариях и других «мелочах».\n" +
                        "\n" +
                        "Дядюшка Боб считает, что внимание к деталям, умение отличать хороший код от плохого и привычки чистюли сделают из кодера настоящего программиста.\n" +
                        "\n" +
                        "Мартин и соавторы на примерах показывают, как грамотно проектировать архитектуру приложения и писать чистый код, а в конце перечисляют признаки «дурно пахнущего кода» — типичные ошибки.\n" +
                        "\n" +
                        "В общем, для создания хорошего приложения нужно потрудиться — самим же потом легче будет его сопровождать.",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )

        }
    }
}