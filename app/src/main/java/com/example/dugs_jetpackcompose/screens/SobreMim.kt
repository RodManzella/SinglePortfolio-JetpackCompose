package com.example.dugs_jetpackcompose.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.dugs_jetpackcompose.R

@Composable
fun SobreMim(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter){
        Column(
            modifier = Modifier
                .background(Color(0xFF2e2e2d))
                .fillMaxSize()
        ){
            Image(
                painter = painterResource(id = R.drawable.euuu),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(200.dp)
                    .padding(15.dp)
                    .clip(CircleShape)
                    .align(Alignment.CenterHorizontally)
                    .border(
                        BorderStroke(4.dp, Color(0xFFc218d9)),
                        CircleShape
                    ),

                )
            Text(text = "Olá! me chamo Rodrigo Manzella!",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally),
                fontSize = 22.sp
            )

            Text(text = "Atualmente sou estudante de Ciência da Computação na Universidade Católica de Pernambuco e tenho 20 anos.",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.Start),
                fontSize = 15.sp
            )

            Text(text = "Me interesso particularmente pelas áreas de redes de computadores e cybersegurança(Blue Teaming).",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.Start),
                fontSize = 15.sp
            )

            Text(text = "Gosto muito de gatinhos e de colecionar perfumes!.",
                color = Color.White,
                fontFamily = FontFamily.SansSerif,
                modifier = Modifier
                    .padding(10.dp)
                    .align(Alignment.Start),
                fontSize = 15.sp
            )

        }
    }
}