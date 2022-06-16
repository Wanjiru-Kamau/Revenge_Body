package com.njiruk.revenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
    lateinit var btnlogin: Button
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var tilPassword: TextInputLayout
    lateinit var etPassword: TextInputEditText
    lateinit var tvsignup: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        castView()
    }




        fun castView(){
            btnlogin = findViewById(R.id.btnlogin)
            tilEmail = findViewById(R.id.tilEmail)
            etEmail = findViewById(R.id.etEmail)
            tilPassword = findViewById(R.id.tilPassword)
            etPassword= findViewById(R.id.etPassword)
            tvsignup=findViewById(R.id.tvsignup)

            //btnlogin.setOnClickListener { validateLogin() }
            tvsignup.setOnClickListener {
                val intent=Intent(this,Sign_UpActivity::class.java)
                startActivity(intent)}
                btnlogin.setOnClickListener { validateLogin()

                    startActivity(Intent(this,HomePage::class.java))
                }





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