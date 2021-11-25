package com.itacademy.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        button = findViewById(R.id.btn)
        textView = findViewById(R.id.text)

        if (intent.getStringExtra("RESULT") != null) {
            val text = intent.getStringExtra("RESULT")
            textView.text = text.toString()
        } else {
            val text2 = intent.getStringExtra("RESULT2")
            textView.text = text2.toString()
        }

        button.setOnClickListener {
            onBackPressed()
        }
    }
}