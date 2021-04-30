package com.andersenlab.andersen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Hello World!")
        makeText(baseContext, "Hello", LENGTH_LONG).show()
    }
}