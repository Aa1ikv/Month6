package kg.geeks.month6.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.geeks.month6.R
import kg.geeks.month6.ui.navigation.NavScreen
import kg.geeks.month6.ui.screens.HomeScreen
import kg.geeks.month6.ui.screens.detail.DetailBook1Screen
import kg.geeks.month6.ui.screens.detail.DetailBook2Screen
import kg.geeks.month6.ui.screens.detail.DetailBook3Screen
import kg.geeks.month6.ui.theme.Month6Theme
import kotlinx.coroutines.MainScope

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                Scaffold{ paddingValue ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValue),
                    ){
                        HomeScreen()
                    }
                    setUpNavigationScreen()
                }
        }
    }
}

@Composable
fun bookItem(){
    Column {
        Image(
           modifier = Modifier
               .padding(start = 40.dp, top = 30.dp)
               .size(350.dp, 400.dp),
            contentDescription = "Book number 1",
            painter = painterResource(R.drawable.iv_book_nymber1)
        )
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
        Button(
            modifier = Modifier
                .size(width = 300.dp, height = 70.dp)
                .padding(start = 80.dp, top = 20.dp),
            onClick = {

            }
        ) {
            Text(
                text = "Подробнее",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
        }

    }
}
@Composable
fun bookItem2(){
    Column {
        Image(
            modifier = Modifier
                .padding(start = 40.dp, top = 30.dp)
                .size(350.dp, 400.dp),
            contentDescription = "Book number 1",
            painter = painterResource(R.drawable.ic_book_number2)
        )
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
        Button(
            modifier = Modifier
                .size(width = 300.dp, height = 70.dp)
                .padding(start = 80.dp, top = 20.dp),
            onClick = {

            }
        ) {
            Text(
                text = "Подробнее",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
        }

    }
}
@Composable
fun bookItem3(){
    Column {
        Image(
            modifier = Modifier
                .padding(start = 40.dp, top = 30.dp)
                .size(350.dp, 400.dp),
            contentDescription = "Book number 1",
            painter = painterResource(R.drawable.iv_book_number3)
        )
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
        Button(
            modifier = Modifier
                .size(width = 300.dp, height = 70.dp)
                .padding(start = 80.dp, top = 20.dp),
            onClick = {

            }
        ) {
            Text(
                text = "Подробнее",
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.unbounded_medium))
            )
        }

    }
}
@Composable
fun setUpNavigationScreen(){
    val navScreen by remember { mutableStateOf<NavScreen>(NavScreen.Home) }

    when(navScreen){
        is NavScreen.Home -> {
            HomeScreen()
        }
        is NavScreen.DetailBook1 -> {
            DetailBook1Screen()
        }
        is NavScreen.DetailBook2 -> {
            DetailBook2Screen()
        }
        is NavScreen.DetailBook3 -> {
            DetailBook3Screen()
        }
    }

}
