package Screens

import DataComentarios.ListaComentarios
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
public fun allComentarios(){


    ListaComentarios.map {
        Spacer(modifier = Modifier.height(5.dp))
        Box (
            modifier = Modifier
                .clip(shape = RoundedCornerShape(10.dp))
                .fillMaxWidth(0.95f)
                .height(120.dp)
                .border(width = 1.dp, Color.LightGray, RoundedCornerShape(10.dp))
        ) {
            Row () {
                    Image(
                        painter = painterResource(it.LinkImage),
                        contentDescription = "${it.UserName}",
                        modifier = Modifier
                            .fillMaxHeight()
                    )
                Column (
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.LightGray)
                        .padding(5.dp)

                ) {
                    Spacer(modifier = Modifier.height(10.dp))
                    Text("${it.UserName}", style = TextStyle(fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Bold))
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("${it.Comentario}", style = TextStyle(color = Color.DarkGray))
                    Spacer(modifier = Modifier.height(5.dp))
                    Text("${it.Date}",style = TextStyle(color = Color.DarkGray))
                    Spacer(modifier = Modifier.height(10.dp))

                }
            }
        }
        Spacer(modifier = Modifier.height(5.dp))
    }
}