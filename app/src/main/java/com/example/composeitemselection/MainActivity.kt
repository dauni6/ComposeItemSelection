package com.example.composeitemselection

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeitemselection.ui.theme.ComposeItemSelectionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeItemSelectionTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ItemSelection()
                }
            }
        }
    }
}

@Composable
fun ItemSelection() {
    var selected1 by remember { mutableStateOf(false) }
    var selected2 by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SelectableItem(selected = selected1, title = "Make it Easy") {
            selected1 = !selected1
        }
        
        Spacer(modifier = Modifier.height(12.dp))
        
        SelectableItem(
            selected = selected2,
            title = "Make it Easy",
            subtitle = "Here, we will learn to Jetpack Compose using kotlin",
        ) {
            selected2 = !selected2
        }
    }

}
