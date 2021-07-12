package com.example.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_synthetic.*

class SyntheticActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_synthetic)

        myButton.setOnClickListener {
            Toast.makeText(this, "test", Toast.LENGTH_SHORT).show()
        }

        textView.text = "some text"
    }
}