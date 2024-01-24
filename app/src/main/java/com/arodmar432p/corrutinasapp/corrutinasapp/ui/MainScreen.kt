package com.arodmar432p.corrutinasapp.corrutinasapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MainScreen(viewModel: MainViewModel) {
    var color by remember { mutableStateOf(Color.Red) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { color = if (color == Color.Red) Color.Blue else Color.Red },
                colors = ButtonDefaults.buttonColors(containerColor = color)
            ) {
                Text("Cambiar color")
            }

            Text(viewModel.apiResponse.value)

            Button(onClick = { viewModel.callApi() }) {
                Text("Llamar API")
            }
        }
    }
}

@Preview
@Composable
fun PreviewMainScreen(){

}