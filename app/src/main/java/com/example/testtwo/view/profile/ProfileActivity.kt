package com.example.testtwo.view.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.databinding.ActivityProfileBinding
import com.example.testtwo.view.login.LoginActivity.Companion.KEY_ADDRESS
import com.example.testtwo.view.login.LoginActivity.Companion.KEY_INPUT
import com.example.testtwo.view.login.LoginActivity.Companion.KEY_NAME

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra(KEY_NAME)
        val address = intent.getStringExtra(KEY_ADDRESS)
        val valueInput = intent.getStringExtra(KEY_INPUT)

        binding.tvName.text = valueInput
        binding.tvAddress.text = address

    }
}