package com.example.greetingscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class BirthdayGreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name=intent.getStringExtra("name")
        val textBirthdayGreeting=findViewById<TextView>(R.id.birthdayGreeting)
        textBirthdayGreeting.text="Happy Birthday $name"
    }
}