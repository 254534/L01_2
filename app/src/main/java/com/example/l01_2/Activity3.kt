package com.example.l01_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_3)

        val buttonBMI = findViewById<Button>(R.id.button_bmi)
        val weight: EditText = findViewById<EditText>(R.id.act3_edittext4)
        val height: EditText = findViewById<EditText>(R.id.act3_edittext5)
        buttonBMI.setOnClickListener { _ ->
            val valW: Double = weight.text.toString().toDouble()
            val valH: Double = height.text.toString().toDouble()
            val bundle = Bundle()
            bundle.putDouble("valW", valW)
            bundle.putDouble("valH", valH)
            val intent = Intent(this, MainActivity5::class.java)
            intent.putExtras(bundle)
            startForResult.launch(intent)
        }
    }

    val startForResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
        { result: ActivityResult ->
            if (result.resultCode == RESULT_OK)
            {
                val intent = result.data
                val valW = intent?.getDoubleExtra("valW",0.0)
                val valH = intent?.getDoubleExtra("valH",0.0)
                val valBmi = intent?.getDoubleExtra("bmi",0.0)
                if (valBmi != null) {
                    val weight: EditText = findViewById<EditText>(R.id.act3_edittext4)
                    val height: EditText = findViewById<EditText>(R.id.act3_edittext5)
                    val bmi: TextView = findViewById<EditText>(R.id.act3_text_bmi)

                    weight.text = Editable.Factory.getInstance().newEditable(valW.toString())
                    height.text = Editable.Factory.getInstance().newEditable(valH.toString())
                    bmi.text = Editable.Factory.getInstance().newEditable(valBmi.toString())
                }
            }
        }

    fun finishActivity3(view: View?) {
        onBackPressed()
    }
}