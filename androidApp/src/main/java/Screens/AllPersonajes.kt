package Screens

import DataFoto.Personajes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
public fun AllFotos(){
    Personajes.map {
        Row (
            modifier = Modifier
                .padding(10.dp)
        ) {
            Column (
                verticalArrangement = Arrangement.Center,
            ) {
                Image(painter = painterResource(it.Image),
                    contentDescription = "${it.Name}",
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                    )
                Box (
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Column (
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text("${it.Name}", style = TextStyle(
                            color = Color.Black, fontSize = 30.sp,
                            textAlign = TextAlign.Center,

                        ))
                        Text("${it.Description}", style = TextStyle(
                            color = Color.DarkGray,textAlign = TextAlign.Center,
                        )
                        )
                    }
                }
            }
        }
    }
}