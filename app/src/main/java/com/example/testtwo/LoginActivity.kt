package com.example.testtwo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
            val inputEmail = binding.etEmail.text.toString()
            if (inputEmail == "ir@gmail.com") {
                Toast.makeText(applicationContext, "Berhasil Login", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(applicationContext, "Gagal Login", Toast.LENGTH_LONG).show()
            }
        }
    }
}