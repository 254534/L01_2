package com.example.l01_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)
    }

    fun finishActivity3(view: View?) {
        finish()
    }
}