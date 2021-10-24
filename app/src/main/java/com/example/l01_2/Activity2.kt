package com.example.l01_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button1: Button = findViewById(R.id.button1_2)
        val button2: Button = findViewById(R.id.button2_2)
        val radiobutton1: RadioButton = findViewById(R.id.radioButton1_2)
        val radiobutton2: RadioButton = findViewById(R.id.radioButton2_2)
        val toggleButton1: ToggleButton = findViewById(R.id.toggleButton1_2)
        button1.setOnClickListener(act2Listener)
        button2.setOnClickListener(act2Listener)
        radiobutton1.setOnClickListener(act2Listener)
        radiobutton2.setOnClickListener(act2Listener)
        toggleButton1.setOnClickListener(act2Listener)
    }

    val act2Listener = View.OnClickListener { view ->
        when(view.getId()) {
            R.id.button1_2 -> {
                // notification popup
                val toast: Toast = Toast.makeText(this,
                    "This is my notification",
                    Toast.LENGTH_LONG)
                toast.setGravity(Gravity.CENTER, 0, 0)
                toast.show()
            }
            R.id.button2_2 -> onBackPressed()
            R.id.radioButton1_2 -> {
                val textView: TextView = findViewById(R.id.textView1_2)
                textView.visibility = View.VISIBLE
            }
            R.id.radioButton2_2 -> {
                val textView: TextView = findViewById(R.id.textView1_2)
                textView.visibility = View.INVISIBLE
            }
            R.id.toggleButton1_2 -> {

            }
        }
    }
}