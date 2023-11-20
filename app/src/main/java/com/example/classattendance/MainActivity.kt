package com.example.classattendance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val username=findViewById<EditText>(R.id.txtUsername).text.toString()
        val password=findViewById<EditText>(R.id.txtPassword).text.toString()
        val login:Button=findViewById(R.id.btnLogin)
        login.setOnClickListener {
            Toast.makeText(this,"Your username is ${username} and password is ${password}",Toast.LENGTH_LONG).show()
        }
    }
}