package com.keegan.android.itc362hw4ex3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

const val VALUE = "Value"
class MainActivity : AppCompatActivity() {

    private lateinit var mainButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButton = findViewById(R.id.main_button)

        //gather the value
        var num = Integer.parseInt(mainButton.text.toString())

        mainButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(VALUE, num)
            startActivity(intent)
        }
    }

    override fun onStart() {
        var sumNum = intent.getIntExtra(PASSBACK,0)
        mainButton.setText(sumNum.toString())
        super.onStart()

        //gather the value
        var num = Integer.parseInt(mainButton.text.toString())

        mainButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(VALUE, num)
            startActivity(intent)
        }
    }
}