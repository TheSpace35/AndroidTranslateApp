package ru.thespace34.easyspeak.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import ru.thespace34.easyspeak.app.ui.theme.EasySpeakTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EasySpeakTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                }
            }
        }
    }

    @Composable
    fun BottomNavigationBar(){
        BottomNavigation(
            contentColor = MaterialTheme.colorScheme.primary,

            ) {
            BottomNavigationItem(
                icon = {
                    ImageVector.vectorResource(id = R.drawable.ic_mic),
                    contentDescription = 'Chat',
                },
                selected = false,
                onClick = {

                }

            )

        }


        BottomNavigation(
            contentColor = MaterialTheme.colorScheme.primary,

            ) {
            BottomNavigationItem(
                icon = {
                    ImageVector.vectorResource(id = R.drawable.ic_mic),
                    contentDescription = 'Chat',
                },
                selected = false,
                onClick = {

                }

            )

        }
    }
}



