package com.example.testtwo.view.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testtwo.databinding.ActivityLoginBinding
import com.example.testtwo.view.profile.ProfileActivity

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    private val email = "ir@gmail.com"
    private val name = "Irwan Cannady"
    private val address = "Jl Madiun 3 Jakarta Pusat, kec Bandung provinsi Jawa Barat"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmit.setOnClickListener {
//            val inputEmail = binding.etEmail.text.toString()
//            navigateScreen(ProfileActivity::class.java)
//            navigateScreenWithInput(ProfileActivity::class.java, inputEmail)

//            if (inputEmail == email) {
//                Toast.makeText(applicationContext, "Berhasil Login", Toast.LENGTH_LONG).show()
//            } else {
//                Toast.makeText(applicationContext, "Gagal Login", Toast.LENGTH_LONG).show()
//            }

            showLoading()
        }

        binding.pbLoading.setOnClickListener {
            hideLoading()
        }
    }

    private fun showLoading() {
        binding.pbLoading.visibility = View.VISIBLE
        binding.btnSubmit.visibility = View.GONE
    }

    private fun hideLoading() {
        binding.pbLoading.visibility = View.GONE
        binding.btnSubmit.visibility = View.VISIBLE
    }

    private fun navigateScreen(screen: Class<*>) {
        val intent = Intent(applicationContext, screen)
        intent.putExtra(KEY_NAME, name)
        intent.putExtra(KEY_ADDRESS, address)
        startActivity(intent)
    }

    private fun navigateScreenWithInput(screen: Class<*>, input: String) {
        val intent = Intent(applicationContext, screen)
        intent.putExtra(KEY_INPUT, input)
        startActivity(intent)
    }

    companion object {
        const val KEY_NAME = "name"
        const val KEY_ADDRESS = "address"
        const val KEY_INPUT = "input"
    }
}