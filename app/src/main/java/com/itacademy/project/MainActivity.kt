package com.itacademy.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.itacademy.project.R

class MainActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var button2: Button

    var array = arrayListOf("A","B","C","D","E")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.editText)
        button = findViewById(R.id.button)
        button2 = findViewById(R.id.button2)
        setBtnListener()
    }

    private fun setBtnListener() {
        button.setOnClickListener{
            //1-variant
            val text = editText.text.toString()
            val result = getValueUsingWhile(text)
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("RESULT", result)
            startActivity(intent)
        }

        button2.setOnClickListener {
            val text = editText.text.toString()
            getValueUsingFor(text)
        }
    }

    //обе
    fun getValueUsingWhile(text: String) : String? {
        var index = 0
        while (index < array.size){
            if(text == array[index])
            {
                return "$text : $index"
            }
            ++index
        }
        return null
    }
    fun getValueUsingFor(text: String){
        val intent = Intent(this, ResultActivity::class.java)
        for (item in array){
            if (text == item){
                val result = "$text : $item"
                intent.putExtra("RESULT2",result)
                startActivity(intent)
            }
        }
    }
}