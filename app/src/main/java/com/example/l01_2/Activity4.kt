package com.example.l01_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import android.widget.TextView

class Activity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_4)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        seekBar.setOnSeekBarChangeListener(seekBarListenerobject)
    }

    val seekBarListenerobject = object: SeekBar.OnSeekBarChangeListener {
        override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
            val textView = findViewById<TextView>(R.id.act4_textview)
            textView.text = "${getResources().getString(R.string.act4_progress_to_fill)} $i"
        }

        override fun onStartTrackingTouch(seekBar: SeekBar) {
            // Do something
        }

        override fun onStopTrackingTouch(seekBar: SeekBar) {
            // Do something
        }
    }

    // closing activity: requires setting android:onClick in xml and android::parentActivityName in
    // AndroidManifest
    fun finishActivity4(view: View?) {
        onBackPressed()
    }
}