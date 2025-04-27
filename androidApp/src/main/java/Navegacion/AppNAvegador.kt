package Navegacion

import Screens.Comentarios
import Screens.Fotos
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@ExperimentalMaterial3Api
@Composable
public fun AppNavegador(){
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = Navegador.Comentarios.routes) {
        composable(route = Navegador.Comentarios.routes){
            Comentarios(navController)
        }
        composable(route = Navegador.Fotos.routes){
            Fotos(navController)
        }
    }
}