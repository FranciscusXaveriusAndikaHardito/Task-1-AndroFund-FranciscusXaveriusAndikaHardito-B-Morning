package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtusername:EditText
    private lateinit var edtpassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        edtusername = findViewById(R.id.editText2)
        edtpassword = findViewById(R.id.editText3)

        val bundle = intent.extras
        if (bundle != null){
            edtusername.setText(bundle.getString("username"))
            edtpassword.setText(bundle.getString("password"))
        }

        btnLogin()
        btnRegis()
    }

    private fun btnLogin() {
        val login:Button = findViewById(R.id.masuksini)
        login.setOnClickListener(this)
    }

    private fun btnRegis() {
        val regis:TextView = findViewById(R.id.daftarl)
        regis.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.masuksini -> {
                val intent = Intent(this@LoginActivity,HomeAktivity::class.java)
                intent.putExtra("UserLogin",UserLogin(edtusername.text.toString()))
                startActivity(intent)
            }
            R.id.daftarl -> {
                val intent = Intent(this@LoginActivity,RegisterAktivity::class.java)
                startActivity(intent)
            }
        }
    }

}