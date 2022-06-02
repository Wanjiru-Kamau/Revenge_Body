package com.njiruk.revenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnlogin: Button
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnlogin = findViewById(R.id.btnlogin)
        tilEmail = findViewById(R.id.tilEmail)
        etEmail = findViewById(R.id.etEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etPassword= findViewById(R.id.etPassword)
        btnlogin.setOnClickListener { validateLogin() }

    }
    fun validateLogin(){
        var error = false
        tilEmail.error=null
        tilPassword.error=null
        var email = etEmail.text.toString()
        if (email.isBlank()){
            tilEmail.error="Email is required"
            error = true

        }
        var password = etPassword.text.toString()
        if (password.isBlank()){
            tilPassword.error= "Password is required"
            return
        }

    }
}