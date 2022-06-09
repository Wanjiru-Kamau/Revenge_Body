package com.njiruk.revenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EdgeEffect
import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class Sign_UpActivity : AppCompatActivity() {
    lateinit var btnsignup: Button
    lateinit var tilfirstname: TextInputLayout
    lateinit var etfirstname: TextInputEditText
    lateinit var tillastname: TextInputLayout
    lateinit var etlastname: TextInputEditText
    lateinit var tilemail: TextInputLayout
    lateinit var etemail: TextInputEditText
    lateinit var tilpassword: TextInputLayout
    lateinit var etpassword: TextInputEditText
    lateinit var tilconfirm:TextInputLayout
    lateinit var etconfirm:TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        castView()
    }

    fun castView(){
        btnsignup = findViewById(R.id.btnsignup)
        tilfirstname = findViewById(R.id.tilfirstname)
        etfirstname = findViewById(R.id.etfirstname)
        tillastname = findViewById(R.id.tillastname)
        etlastname = findViewById(R.id.etlastname)
        tilemail = findViewById(R.id.tilemail)
        etemail = findViewById(R.id.etemail)
        tilpassword= findViewById(R.id.tilpassword)
        etpassword = findViewById(R.id.etpassword)
        tilconfirm = findViewById(R.id.tilconfirm)
        etconfirm = findViewById(R.id.etconfirm)
        btnsignup.setOnClickListener { validatesignup() }


    }
    fun validatesignup(){
        var error = false
        tilfirstname.error=null
        tillastname.error=null
        tilemail.error=null
        tilpassword.error=null


        var firstname = etfirstname.text.toString()
        if (firstname.isBlank()){
            tilfirstname.error= "firstname is required"

        }
        var lastname = etlastname.text.toString()
        if (lastname.isBlank()){
            tillastname.error= "Lastname is required"

        }



        var email = etemail.text.toString()
        if (email.isBlank()){
            tilemail.error="Email is required"
            error = true

        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            tilemail.error = "Not a valid email"
            error=true
        }
        var password = etpassword.text.toString()
        if (password.isBlank()){
            tilpassword.error= "Password is required"

        }
        var confirm = etconfirm.text.toString()
        if (confirm.isBlank()){
            tilconfirm.error= " Kindly confirm password"
        }

        var equals=etpassword==etconfirm
        if (etpassword !=etconfirm){
            tilconfirm.error="invalid"
        }

    }

}