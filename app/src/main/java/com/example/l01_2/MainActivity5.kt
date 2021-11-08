package com.example.l01_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val iii: Intent = intent
        val bundle = iii.extras
        var valW:Double? = bundle?.getDouble("valW",0.0)
        var valH:Double? = bundle?.getDouble("valH",0.0)

        val editTextW = findViewById<EditText>(R.id.act5_edittextW)
        val editTextH = findViewById<EditText>(R.id.act5_edittextH)
        val editTextBMI = findViewById<TextView>(R.id.act5_textView_bmi)

        editTextW.text = Editable.Factory.getInstance().newEditable(valW.toString())
        editTextH.text = Editable.Factory.getInstance().newEditable(valH.toString())

        val buttonCalculate = findViewById<Button>(R.id.act5_button_calculate)
        buttonCalculate.setOnClickListener{ _ ->
            valW = editTextW.text.toString().toDouble()
            valH = editTextH.text.toString().toDouble()

            val bmi: Double? = valH?.let { valW?.div(it*it) }
            fun Double.round(decimals: Int = 2): Double = "%.${decimals}f".format(this).toDouble()
            var bmid: Double = 0.0
            if (bmi != null) {
                bmid = bmi.round(2)
            }
            editTextBMI.text = bmid.toString()
        }

        val buttonAdd = findViewById<Button>(R.id.act5_button_back)
        buttonAdd.setOnClickListener { _ ->
            valW = editTextW.text.toString().toDouble()
            valH = editTextH.text.toString().toDouble()
            val bmi: Double = editTextBMI.text.toString().toDouble()

            iii.putExtra("valW",valW)
            iii.putExtra("valH",valH)
            iii.putExtra("bmi",bmi)
            setResult(RESULT_OK, iii)
            onBackPressed()
        }
    }
}