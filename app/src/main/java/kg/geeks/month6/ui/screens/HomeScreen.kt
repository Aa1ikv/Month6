package kg.geeks.month6.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.geeks.month6.R
import kg.geeks.month6.ui.navigation.NavScreen
import kg.geeks.month6.ui.screens.detail.DetailBook1Screen

@Composable
fun HomeScreen(
){
    Scaffold{ paddingValue ->
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue)
        ) {
            item {
                bookItem(onNextScreen = {
                    NavScreen.DetailBook1
                })
                bookItem2(onNextScreen = {
                    NavScreen.DetailBook2
                })
                bookItem3(
                    onNextScreen = {
                        NavScreen.DetailBook3
                    }
                )
            }
        }
    }
}
@Composable
fun bookItem(onNextScreen: () -> Unit){
    Column(
        modifier = Modifier
            .clickable {
                onNextScreen()
            }
    ){
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


    }
}
@Composable
fun bookItem2(onNextScreen: () -> Unit){
    Column(
        modifier = Modifier
            .clickable {
                onNextScreen()
            }
    ) {
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
    }
}
@Composable
fun bookItem3(onNextScreen: () -> Unit){
    Column (
        modifier = Modifier
            .clickable {
                onNextScreen()
            }
    ){
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
    }
}
