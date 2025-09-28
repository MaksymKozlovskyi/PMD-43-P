package com.example.kozlovskiy


import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kozlovskiy.ui.theme.KozlovskiyTheme
import kotlin.math.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a = 0.5
        val b = 0.75
        val l = 8.375
        val pi = 4 * atan(l)
        val r = l / (2 * pi)
        val s = pi * (r * r)
        val y1 = cos(l-a).pow(2)+sqrt(s)
        val y2 = log10(sqrt(s)) + 4.75 * b
        val y = y1 / y2;
        val message = "Виконав студент групи 43-п"
        Log.d("MainActivity", "SUM: $y")
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
    KozlovskiyTheme {
        Greeting("Android")
    }
}