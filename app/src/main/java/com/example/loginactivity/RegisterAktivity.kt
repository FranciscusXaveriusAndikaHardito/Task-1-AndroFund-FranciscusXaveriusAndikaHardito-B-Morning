package com.example.loginactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterAktivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtusername:EditText
    private lateinit var edtpassword:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_aktivity)
        edtusername = findViewById(R.id.ed_usernew)
        edtpassword = findViewById(R.id.editText1)
        daftar()
        login()
    }

    private fun login() {

        val login:Button = findViewById(R.id.regisakun)
        login.setOnClickListener(this)
    }

    private fun daftar() {
        val daftar:TextView = findViewById(R.id.loginakun)
        daftar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.loginakun -> {



                val intent = Intent(this@RegisterAktivity,LoginActivity::class.java)
                startActivity(intent)
            }
            R.id.regisakun -> {
                val bundle = Bundle()
                bundle.putString("username",edtusername.text.toString())
                bundle.putString("password",edtpassword.text.toString())
                val intent = Intent(this@RegisterAktivity,LoginActivity::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }

        }
    }
}