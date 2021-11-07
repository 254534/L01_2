package com.example.l01_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bnNavView = findViewById<View>(R.id.bottom_nav) as BottomNavigationView
        bnNavView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.button1_m -> startActivity(
                    Intent(this, Activity2::class.java)
                )
                R.id.button2_m -> startActivity(
                    Intent(this, Activity3::class.java)
                )
                R.id.button3_m -> startActivity(
                    Intent(this, Activity4::class.java)
                )
            }
            true
        }
    }
}