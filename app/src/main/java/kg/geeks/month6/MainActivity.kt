package kg.geeks.month6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.geeks.month6.ui.theme.DefaultBlueColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { paddingValues ->
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(paddingValues),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Image(
                        modifier = Modifier
                            .padding(top = 16.dp)
                            .size(350.dp, 350.dp),
                        painter = painterResource(R.drawable.ic_profile_photo),
                        contentDescription = "Profile_Photo"
                    )

                    Spacer(
                        modifier = Modifier
                            .height(24.dp)
                    )

                    OutlinedTextFieldExample()
                }
            }
        }
    }
}

@Composable
fun OutlinedTextFieldExample() {
    var name by remember { mutableStateOf("") }
    var secondName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var isEditing by remember { mutableStateOf(true) }
    var isVisibility by remember { mutableStateOf(true) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        if (isEditing) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = name,
                onValueChange = { name = it },
                placeholder = { Text("Введите ваше имя") }
            )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = secondName,
                onValueChange = { secondName = it },
                placeholder = { Text("Введите вашу фамилию") }
            )

            Spacer(modifier = Modifier.height(14.dp))

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                value = email,
                onValueChange = { email = it },
                placeholder = { Text("Ваш Email") }
            )
        } else {
            Text(
                text = "Имя: $name",
                fontSize = 20.sp,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Фамилия: $secondName",
                fontSize = 20.sp,
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Email: $email",
                fontSize = 20.sp,
                modifier = Modifier.padding(8.dp)
            )
        }

        Spacer(
            modifier = Modifier
                .height(14.dp)
        )

        if (isVisibility) {
            Button(
                modifier = Modifier
                    .size(150.dp, 60.dp)
                    .background(DefaultBlueColor, shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)),
                onClick = {
                    isEditing = !isEditing
                    isVisibility = !isVisibility
                },
                colors = ButtonDefaults.buttonColors(containerColor = DefaultBlueColor)
            ) {
                Text(
                    modifier = Modifier,
                    fontSize = 20.sp,
                    text = "Сохранить",
                    color = Color.White
                )
            }
        } else {
            Button(
                modifier = Modifier
                    .size(150.dp, 60.dp)
                    .background(DefaultBlueColor, shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp)),
                onClick = {
                    isEditing = true
                    isVisibility = true
                },
                colors = ButtonDefaults.buttonColors(containerColor = DefaultBlueColor)
            ) {
                Text(
                    modifier = Modifier,
                    fontSize = 20.sp,
                    text = "Изменить",
                    color = Color.White
                )
            }
        }
    }
}
