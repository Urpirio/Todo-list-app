

package Screens

import Navegacion.Navegador
import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ExperimentalMaterial3Api
@Composable
fun Fotos(navController: NavController){//Estamos trabajando en un top bar para manejar
    Scaffold (
        Modifier.background(Color.White),
        topBar = {
            TopAppBar(
                title = { Text("Personajes del Anime", style = TextStyle(color = Color.White, fontSize = 20.sp)) },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color.Black),
                navigationIcon = {
                    IconButton(
                        onClick = { navController.navigate(route = Navegador.Comentarios.routes)}
                    ) {
                        Icon(imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Arrow para regresar")
                    }
                }
                )
        }
    ) {
        MainContentFotos(navController)
    }
}

@Composable
fun MainContentFotos(navController: NavController){
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(state = rememberScrollState())
    ) {
        AllFotos()
    }
}

