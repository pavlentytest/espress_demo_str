package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySplashBinding
import android.content.Intent

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            login()
        }
    }

    fun login() {
        val intent = Intent(applicationContext, LoginActivity::class.java)
        startActivity(intent)
    }
}