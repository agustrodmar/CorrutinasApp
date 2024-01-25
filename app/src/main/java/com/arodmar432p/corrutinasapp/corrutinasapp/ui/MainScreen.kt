package com.arodmar432p.corrutinasapp.corrutinasapp.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


/**
 * A composable function that displays the main screen of the application.
 *
 * This function displays a screen with two buttons and a text field. The first button changes its color
 * between red and blue each time it's clicked. The second button calls an API and updates the text field
 * with the response from the API. While the API call is in progress, a CircularProgressIndicator is displayed.
 *
 * @param viewModel an instance of [MainViewModel] that this function will use to interact with the rest of the application.
 */
@Composable
fun MainScreen(viewModel: MainViewModel) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Button(
                onClick = { viewModel.changeColor() },
                colors = ButtonDefaults.buttonColors(containerColor = viewModel.color)
            ) {
                Text("Cambiar color")
            }

            if (viewModel.isLoading) {
                CircularProgressIndicator()
            } else {
                Text(viewModel.apiResponse)
            }

            Button(onClick = { viewModel.callApi() }) {
                Text("Llamar API")
            }
        }
    }
}

/**
 * A preview composable function that displays a preview of the main screen of the application.
 *
 * This function is annotated with @Preview, so it will be displayed in the Android Studio preview.
 */
@Preview
@Composable
fun PreviewMainScreen(){

}