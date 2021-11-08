package com.example.l01_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment


//interface IOnBackPressed {
//    fun onBackPressed(): Boolean
//}
//
//class MyFragment : Fragment(), IOnBackPressed {
//    override fun onBackPressed(): Boolean {
//
//    }
//}

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
//
//        val callback: OnBackPressedCallback = object : OnBackPressedCallback(
//            true // default to enabled
//        ) {
//            override fun handleOnBackPressed() {
//                makeToast()
//            }
//        }


    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "I am back", Toast.LENGTH_LONG).show()
    }

//    fun makeToast() {
//
//    }

//    override fun onBackPressed() {
//        val fragment =
//            this.supportFragmentManager.findFragmentById(R.id.main_container)
//        (fragment as? IOnBackPressed)?.onBackPressed()?.not()?.let {
//            super.onBackPressed()
//        }
//    }
//
//        val startForResult2 =
//        registerForActivityResult(ActivityResultContracts.StartActivityForResult())
//        { result: ActivityResult ->
//            if (result.resultCode == RESULT_OK)
//            {
//                val intent = result.data
//                val temp = intent?.getBooleanExtra("temp", false)
//                if (temp != null) {
//                    makeToast()
//                }
//            }
//        }
}