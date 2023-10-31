package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("tag", "Started Activity")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submitButton = findViewById<Button>(R.id.btSubmit)
        val name = findViewById<EditText>(R.id.eTName)
        val greetingView = findViewById<TextView>(R.id.textsize)
        submitButton.setOnClickListener {
            Log.i("tag", "Submit Button is Clicked")
            if(name.text.toString().isEmpty())
                Toast.makeText(this, "Name is empty, please input your name!", Toast.LENGTH_SHORT).show()
            else {
                greetingView.text = "Hello ${name.text.toString()}"
                name.setText("")

            }
        }
    }
}