package com.mahakal.mobilehub.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mahakal.mobilehub.R
import com.mahakal.mobilehub.utils.ShippingLogic

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pincodeInput = findViewById<EditText>(R.id.pincodeInput)
        val checkBtn = findViewById<Button>(R.id.checkBtn)
        val resultText = findViewById<TextView>(R.id.resultText)
        checkBtn.setOnClickListener {
            val option = ShippingLogic.getShippingOption(pincodeInput.text.toString())
            resultText.text = option.deliveryMessage
        }
    }
}
