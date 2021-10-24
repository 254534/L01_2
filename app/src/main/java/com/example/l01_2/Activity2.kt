package com.example.l01_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        val button1: Button = findViewById(R.id.button1_2)
        val button2: Button = findViewById(R.id.button2_2)
        button1.setOnClickListener(act2Listener)
        button2.setOnClickListener(act2Listener)
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
        }
    }
}