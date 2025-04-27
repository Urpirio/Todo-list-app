package Screens


import Navegacion.Navegador
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun Comentarios(navController: NavController){
   Scaffold (
       topBar = {
           TopAppBar(
               title = { Text("Comentarios", style = TextStyle(color = Color.White, fontSize = 20.sp)) },
               colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black),
               actions = {
                   IconButton(
                       onClick = { navController.navigate(route = Navegador.Fotos.routes)}
                   ) {
                       Icon(
                           imageVector = Icons.Default.ArrowForward,
                           contentDescription = "Next Page"
                       )
                   }
               }
           )

       }
   ) {
       MainContentComentarios(navController)
   }
}


@Composable
fun MainContentComentarios(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 60.dp)
            .verticalScroll(rememberScrollState())

    ) {
        allComentarios()
    }
}