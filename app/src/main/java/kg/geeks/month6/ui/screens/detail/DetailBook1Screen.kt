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
fun DetailBook1Screen(
){
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
                text = "Программист-прагматик",
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
                text = "И. В. Берштейн",
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
                text = "«Вильямс», 2020 год, 368 с.",
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
                text = "The Pragmatic Programmer: Your Journey To Mastery, 20th Anniversary Edition (2nd Edition) by David Thomas & Andrew Hunt",
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
                text = "Кажется, в этой книге есть всё, что пригодится программисту: от того, как стать ответственным, до анализа ошибок в алгоритмах и шифрования данных.\n" +
                        "\n" +
                        "Если разбирать все эти темы от и до, получился бы неподъёмный труд на 100500 томов, а не 300 страниц «Программиста-прагматика». Так что книга даёт лишь общее представление — как карта без детализации.",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )

        }
    }


}
