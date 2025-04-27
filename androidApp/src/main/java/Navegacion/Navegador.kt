package Navegacion

//Esto es una clase sellada
sealed class Navegador(val routes: String) {
    object Comentarios: Navegador(routes = "Comentarios");
    object Fotos: Navegador(routes = "Fotos");


}