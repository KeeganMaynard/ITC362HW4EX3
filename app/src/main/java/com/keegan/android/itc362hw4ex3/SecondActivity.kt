package com.keegan.android.itc362hw4ex3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

const val PASSBACK = "passBack"
class SecondActivity : AppCompatActivity() {

    private lateinit var backButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        backButton = findViewById(R.id.back_button)

        //set new value
        var newNum = intent.getIntExtra(VALUE, 0)
        newNum += 1

        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(PASSBACK,newNum)
            startActivity(intent)
        }
    }
}