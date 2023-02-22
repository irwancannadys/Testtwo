package com.example.testtwo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.databinding.ActivityBiodataBinding

class BiodataActivity : AppCompatActivity() {

    private lateinit var binding : ActivityBiodataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBiodataBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}