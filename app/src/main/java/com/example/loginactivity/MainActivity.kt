package com.example.loginactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLoginListener()
        btnRegislistener()
    }

    private fun btnLoginListener(){
      val m:Button = findViewById(R.id.masuk)
        m.setOnClickListener(this)
        }

    private fun btnRegislistener(){
        val daftar:Button = findViewById(R.id.daftar)
        daftar.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
      when(v?.id) {
      R.id.masuk -> {
          val intent = Intent(this@MainActivity,LoginActivity::class.java)
          startActivity(intent)
      }
          R.id.daftar -> {
              val intent = Intent(this@MainActivity,RegisterAktivity::class.java)
              startActivity(intent)
          }

    }
}


}