package com.example.asl1_rosas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Greeting(name: String) {
    Surface(color = Color.Magenta) {
        Text(text = "hello androidddd soy $name y es mi primer print en android studio")
    }
}

@Preview(showBackground = true)
@Composable
fun HelloWorldPreview() {
    Greeting(name = "Rosario")
}
