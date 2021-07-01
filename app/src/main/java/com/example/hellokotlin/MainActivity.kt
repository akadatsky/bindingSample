package com.example.hellokotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hellokotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myButon.setOnClickListener {
            binding.myTextView.text = "Andrey"
        }

    }
}