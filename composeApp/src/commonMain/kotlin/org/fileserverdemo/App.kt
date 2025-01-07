package org.fileserverdemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import fileserverdemo.composeapp.generated.resources.Res
import fileserverdemo.composeapp.generated.resources.compose_multiplatform
import fileserverdemo.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.DrawableResource

@Composable
@Preview
fun App() {
    WelcomeScreen()
}

@Composable
fun WelcomeScreen() {

    Surface(color = Color(0xFF2D3D4D) , modifier = Modifier.fillMaxSize()){


    // Получаем ресурс изображения для логотипа
    val logo: Painter = painterResource(Res.drawable.logo) // Путь к логотипу

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Логотип проекта
        Image(
            painter = logo,
            contentDescription = "File Server Logo",
            modifier = Modifier.size(200.dp) // Устанавливаем размер логотипа
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Приветственное сообщение
        Text(
            text = "Wellcome to the File Server!",
            style = TextStyle(
                fontSize = 20.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
        )

        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {}, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White) ){
            Text(text = "START",
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF2D3D4D),
                )
            )
        }
    }
        }
}




//MaterialTheme {
//
//    Surface(color = Color(0xFF87CEFA), modifier = androidx.compose.ui.Modifier.fillMaxSize()) {
//
//
//        var showContent by remember { mutableStateOf(false) }
//        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
//
//            Text(text = "Glad to see You in our file server app!", modifier = Modifier.padding(top = 100.dp),
//                style = TextStyle(
//                    fontSize = 24.sp,
//                    fontWeight = FontWeight.Bold
//                ) )
//            Text(text = "Press START to start XD",
//                style = TextStyle(
//                    fontSize = 20.sp,
//                    fontWeight = FontWeight.Bold,
//                    color = Color.Gray
//                ) )
//
//            Button(onClick = { showContent = !showContent },
//                modifier = Modifier.padding(top = 100.dp),
//
//                ) {
//                Text("Start!")
//            }
//
//
////                Button(onClick = { showContent = !showContent }) {
////                    Text("Click me!")
////                }
////                AnimatedVisibility(showContent) {
////                    val greeting = remember { Greeting().greet() }
////                    Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
////                        Image(painterResource(Res.drawable.compose_multiplatform), null)
////                        Text("Compose: $greeting")
////                    }
////                }
//        }
//    }
//}