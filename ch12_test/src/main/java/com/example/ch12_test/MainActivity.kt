package com.example.ch12_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.ch12_test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.extendedFab.setOnClickListener {
            when (binding.extendedFab.isExtended) {
                true -> binding.extendedFab.shrink()
                false -> binding.extendedFab.extend()
            }
        }
    }
}