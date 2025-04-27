package DataComentarios

import androidx.compose.runtime.ComposeCompilerApi
import com.example.todo_list.android.R


data class DataComentarios(val UserName: String,val Comentario: String,val Date: String,val LinkImage: Int);

@ComposeCompilerApi
var ListaComentarios = listOf(
        DataComentarios(
            UserName = "Nelson Javier",
            Comentario = "No Me gusta el aguacate lo odio",
            Date = "25/04/2025",
            LinkImage = R.drawable.javier
        ),
        DataComentarios(
            UserName = "Enmanuel Batuce",
            Comentario = "Siempre llego despues de urpirio",
            Date = "20/01/2025",
            LinkImage = R.drawable.enmanuelbatuce
        ),
        DataComentarios(
            UserName = "Nashla Sena",
            Comentario = "Amo el dembow y adio la musica de billie eilish",
            Date = "24/02/2025",
            LinkImage = com.example.todo_list.R.drawable.nashlasena

        ),
        DataComentarios(
            UserName = "Oliver09",
            Comentario = "No me gusta el anime",
            Date = "20/4/2025",
            LinkImage = R.drawable.olivern
        ),
        DataComentarios(
            UserName = "Trujillo ",
            Comentario = "Que mierda de pais es este",
            Date = "14/02/2025",
            LinkImage = R.drawable.trujillo
        ),
        DataComentarios(
            UserName = "Profe Diego",
            Comentario = "Sin querer le rompi el brazo a un alumno, que hago?",
            Date = "12/03/2025",
            LinkImage = R.drawable.diegoj
        ),
        DataComentarios(
            UserName = "Pedro Amin",
            Comentario = "Hoy me levante con ganas de salvar personas se su miseria",
            Date = "19/04/2025",
            LinkImage = R.drawable.pedroamin
        ),
        DataComentarios(
            UserName = "Pedro Miguel",
            Comentario = "Hoy me levante con ganas de salvar personas se su miseria",
            Date = "19/04/2025",
            LinkImage = R.drawable.pedromiguel
        )

);
