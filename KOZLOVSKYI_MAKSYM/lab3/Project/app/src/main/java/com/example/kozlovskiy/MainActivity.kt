package com.example.kozlovskiy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kozlovskiy.ui.theme.KozlovskiyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val line = "Kozlovskiy"
        Log.d("MainActivity", "Line to reverse: $line")
        Log.d("MainActivity", "Reversed line: ${ReverseString(line)}")
        OutputTaskInLog()
    }
}

fun ReverseString(str: String):String{
    return str.reversed()
}

fun OutputTaskInLog(){
    Log.d("MainActivity", "Написати функцію, яка повертає зворотний рядок")
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