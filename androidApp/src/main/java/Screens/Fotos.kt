

package Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
//import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@ExperimentalMaterial3Api
@Composable
fun Fotos(navController: NavController){//Estamos trabajando en un top bar para manejar
    Scaffold (
        Modifier.background(Color.White),
        topBar = { TopAppBar(
            title = { Text("Fotos", style = TextStyle(color = Color.White, fontSize = 20.sp)) },
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Black),
        )}
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
    ) {
        Text("Fotos")
    }
}

