package kg.geeks.month6.ui.activity

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kg.geeks.month6.ui.app.App

@Composable
fun Main() {
    MaterialTheme {
        App()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Main()
}