package com.example.servicedemo

import android.os.Bundle
import android.widget.ImageView
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
import com.example.servicedemo.ui.theme.ServiceDemoTheme

class MainActivity : ComponentActivity() {
    companion object{
        var fragNum = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<ImageView>(R.id.photo).setOnClickListener{
            if(fragNum!=1) fragNum=1
        }
        findViewById<ImageView>(R.id.music).setOnClickListener{
            if(fragNum!=2) fragNum=2
        }
        findViewById<ImageView>(R.id.video).setOnClickListener{
            if(fragNum!=3) fragNum=3
        }
    }
}
