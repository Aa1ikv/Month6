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
fun DetailBook3Screen(){
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
                text = "Совершенный код",
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
                text = "В. Г. Вшивцев",
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
                text = "«БХВ», 2017 год, 896 с.",
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
                text = "Code Complete by Steve McConnell",
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
                text = "Грамотное конструирование — это секрет успеха. Вот основная идея автора книги. Причём в конструирование входит и планирование, и кодирование, и тестирование готовой программы.\n" +
                        "\n" +
                        "Из книги вы узнаете:\n" +
                        "\n" +
                        "какие бывают методики проектирования;\n" +
                        "как повысить качество методов в коде;\n" +
                        "как отлаживать код и как его улучшать (рефакторить);\n" +
                        "и даже зачем программисту любопытство.",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )

        }
    }
}