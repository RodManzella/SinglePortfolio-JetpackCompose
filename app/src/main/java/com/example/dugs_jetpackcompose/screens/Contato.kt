package com.example.dugs_jetpackcompose.screens

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun Contato(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Minhas Redes Sociais",
            modifier = Modifier
                .padding(15.dp)

        )
        MyButton("Linkedin", "https://www.linkedin.com/in/rodrigo-manzella-7b8b0a23b/")
        Spacer(modifier = Modifier.height(16.dp))
        MyButton("GitHub", "https://github.com/RodManzella")
        Spacer(modifier = Modifier.height(16.dp))
        MyButton("Instagram", "https://www.instagram.com/rodrigo_manzella/?hl=en")
    }
}

@Composable
fun MyButton(label: String, url: String) {
    val context = LocalContext.current

    Button(
        onClick = {

            openUrlInBrowser(context, url)
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        Text(text = label)
    }
}

fun openUrlInBrowser(context: android.content.Context, url: String) {
    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
    context.startActivity(intent)
}
