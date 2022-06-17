package com.njiruk.revenge

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.njiruk.revenge.databinding.ActivityHomePageBinding
import com.njiruk.revenge.databinding.ActivitySignUpBinding
import java.util.regex.Pattern

class Sign_UpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castView()
    }

    fun castView(){
        binding.btnsignup.setOnClickListener {
            validatesignup()
            startActivity(Intent(this,Sign_UpActivity::class.java))
        }

    }
    fun validatesignup(){
        var error = false
        binding.tilfirstname.error=null
        binding.tillastname.error=null
        binding.tilemail.error=null
        binding.tilpassword.error=null


        var firstname = binding.etfirstname.text.toString()
        if (firstname.isBlank()){
            binding.tilfirstname.error= "firstname is required"

        }
        var lastname = binding.etlastname.text.toString()
        if (lastname.isBlank()){
            binding.tillastname.error= "Lastname is required"

        }



        var email = binding.etemail.text.toString()
        if (email.isBlank()){
            binding.tilemail.error="Email is required"
            error = true

        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            binding.tilemail.error = "Not a valid email"
            error=true
        }
        var password = binding.etpassword.text.toString()
        if (password.isBlank()){
            binding.tilpassword.error= "Password is required"

        }
        var confirm = binding.etconfirm.text.toString()
        if (confirm.isBlank()){
            binding.tilconfirm.error= " Kindly confirm password"
        }

        var equals=binding.etpassword==binding.etconfirm
        if (binding.etpassword !=binding.etconfirm){
            binding.tilconfirm.error="invalid"
        }

    }

}