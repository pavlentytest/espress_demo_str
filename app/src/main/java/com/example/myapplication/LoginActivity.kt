package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private  lateinit var loginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginBinding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(loginBinding.root)
        loginBinding.enter.setOnClickListener {
            if(loginBinding.login.text.toString() == "login"
                && loginBinding.password.text.toString() == "12345") {
                loginBinding.result.text = "Success!"
            } else {
                loginBinding.result.text = "Failure!"
            }

        }
    }
}