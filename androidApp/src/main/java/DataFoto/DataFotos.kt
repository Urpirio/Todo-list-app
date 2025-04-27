package DataFoto

data class DataFotos(val Name: String,val Image: Int,val Description: String);

public val Personajes = listOf(
    DataFotos(
        Name = "Kakashi",
        Description = "Es un shinobi de Konohagakure, conocido por ser un Jōnin, ex-ANBU, y el líder del Equipo 7.",
        Image = com.example.todo_list.android.R.drawable.kakashi
    ),
    DataFotos(
        Name = "Naruto",
        Description = "Es un joven ninja de la aldea ficticia de Konoha que sueña con convertirse en el Hokage, el líder de la aldea, y ganar el reconocimiento de sus compañeros.",
        Image = com.example.todo_list.android.R.drawable.naruto_uzumaki
    ),
    DataFotos(
        Name = "Goku",
        Description = "Es un guerrero saiyajin con una fuerza sobrehumana y un profundo amor por la lucha, siempre buscando nuevos desafíos y la posibilidad de mejorar su poder.",
        Image = com.example.todo_list.android.R.drawable.goku
    ),
    DataFotos(
        Name = "Gohan",
        Description = "Es el hijo mayor de Goku en Dragon Ball, mitad saiyajin y mitad humano",
        Image = com.example.todo_list.android.R.drawable.gohan
    )
);
