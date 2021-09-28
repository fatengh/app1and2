package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ed1 = findViewById<EditText>(R.id.edNum1)
        val ed2 = findViewById<EditText>(R.id.edNum2)
        val sumButt = findViewById<Button>(R.id.sumButton)
        val resultText = findViewById<TextView>(R.id.resultText)





        sumButt.setOnClickListener {
            val num1 = ed1.text.toString().toInt()
            val num2 = ed2.text.toString().toInt()
            val result = sum(num1, num2)
            resultText.text = "The Result: $result"

        }
    }

    private fun sum(num1: Int, num2: Int): Int {
        return num1 + num2
    }


}

