package com.example.greetingscard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCreateBirthday=findViewById<Button>(R.id.btnCreateBirthday)
        val inputNameInput=findViewById<EditText>(R.id.nameInput)

        buttonCreateBirthday.setOnClickListener {
            Toast.makeText(this,"Button was Clicked",Toast.LENGTH_SHORT).show()
            val name=inputNameInput.editableText.toString()
            val intent = Intent(this,BirthdayGreetingActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
        }
    }
}