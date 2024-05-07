package com.oneotrix.eisenhowermatrix

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.oneotrix.eisenhowermatrix.ui.theme.EisenhowerMatrixTheme
import com.oneotrix.eisenhowermatrix.ui.theme.backgroundColor
import com.oneotrix.eisenhowermatrix.ui.theme.cardTitleColor
import com.oneotrix.eisenhowermatrix.ui.theme.yourTaskNameColor
import com.oneotrix.eisenhowermatrix.view.components.CardGreed

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EisenhowerMatrixTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = backgroundColor
                ) {
                    

                    
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 15.dp),
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        color = yourTaskNameColor,
                        text = "Твои Дела"
                    )
                    
                    CardGreed()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    EisenhowerMatrixTheme {
        Greeting("Android")
    }
}