package Screens


import DataComentarios.User
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@ExperimentalMaterial3Api
@Composable
fun Comentarios(navController: NavController){
   Scaffold (
       topBar = {
           TopAppBar(
               title = { Text("Comentarios", style = TextStyle(color = Color.White, fontSize = 20.sp)) },
               colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black)//Esto sirve para darle color al TopBar
           )
       }
   ) {
       MainContentComentarios(navController)
   }
}


@Composable
fun MainContentComentarios(navController: NavController){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Text("Comentarios",
            style = TextStyle(
                color = Color.Black
            )
            )
        Row {
//            Image(painter = painterResource(R.drawable.))
            Text("${User.UserName}")
            Text("${User.Comentario}")
            Text("${User.Date}")
        }
//        Button(De esta manera puedes conectar diversas pantallas
//            onClick = {
//                navController.navigate(route = Navegador.Fotos.routes)
//            }
//        ) {
//            Text("Fotos")
//        }
    }
}