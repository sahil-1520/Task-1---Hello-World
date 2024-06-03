package com.example.helloworld

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.Greenish
import com.example.helloworld.ui.theme.HelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWorldTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DisplayText(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DisplayText(modifier: Modifier = Modifier) {
    Scaffold(
        containerColor = Greenish,
        contentColor = Color.Cyan
    ) {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = null,
            modifier = Modifier.padding(top =150.dp, start = 32.dp).size(320.dp)

        )

        Text(
            text = "Hello World",
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(top = 380.dp, start = 105.dp),
            fontSize = 36.sp,
            fontStyle = FontStyle.Italic
            )
    }
    
}
