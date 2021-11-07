package com.example.l01_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)
    }

    // closing activity: requires setting android:onClick in xml and android::parentActivityName in
    // AndroidManifest
    fun finishActivity4(view: View?) {
        finish()
    }
}