package com.example.l01_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1_m)
        val button3: Button = findViewById(R.id.button3_m)

        // activity set inside method onClickListener, must be in onCreate
        button1.setOnClickListener { view ->
            val myIntent = Intent(this, Activity2::class.java)
            startActivity(myIntent)
        }
        button3.setOnClickListener(mainListener)
    }

    // this method requires adding android:onClick to xml file
    fun runActivity3(view: View) {
        val myIntent = Intent(this, Activity3::class.java)
        startActivity(myIntent)
    }

    // this is a handler for multiple events, requires setting onClickListener to object beforehand
    val mainListener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.button3_m -> {
                val myIntent = Intent(this, Activity4::class.java)
                startActivity(myIntent)
            }
        }

    }
}