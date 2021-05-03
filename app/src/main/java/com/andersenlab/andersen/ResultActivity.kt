package com.andersenlab.andersen

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val arguments = intent.extras

        val textResult = findViewById<TextView>(R.id.text_result)
        textResult.text = arguments?.get("res").toString()
    }
}