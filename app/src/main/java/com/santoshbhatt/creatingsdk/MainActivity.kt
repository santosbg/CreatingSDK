package com.santoshbhatt.creatingsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.santoshbhatt.santoshsdk.RandomNumber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv = findViewById<TextView>(R.id.tv_random)
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            tv.text = "Random Number is ${generateRandomNum()}"
        }
    }

    private fun generateRandomNum() = RandomNumber.generateRandomNum()
}