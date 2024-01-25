package com.arodmar432p.corrutinasapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.arodmar432p.corrutinasapp.corrutinasapp.data.MyApi
import com.arodmar432p.corrutinasapp.corrutinasapp.domain.LockUseCase
import com.arodmar432p.corrutinasapp.corrutinasapp.ui.MainScreen
import com.arodmar432p.corrutinasapp.corrutinasapp.ui.MainViewModel
import com.arodmar432p.corrutinasapp.ui.theme.CorrutinasAppTheme


/**
 * This class represents the main activity of the application.
 *
 * This activity sets the content view to the main screen of the application when it's created.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CorrutinasAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen(MainViewModel(lockUseCase = LockUseCase(MyApi())))
                }
            }
        }
    }
}
