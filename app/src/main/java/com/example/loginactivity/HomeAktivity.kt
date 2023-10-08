package com.example.loginactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.loginactivity.databinding.ActivityHomeAktivityBinding

class HomeAktivity : AppCompatActivity() {
    private lateinit var binding:ActivityHomeAktivityBinding
    private lateinit var user1:TextView
    private lateinit var user2:TextView
    private lateinit var user3:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_aktivity)

        binding = ActivityHomeAktivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        user1 = findViewById(R.id.userprofile)
        user2 = findViewById(R.id.userprofile2)
        user3 = findViewById(R.id.userprofile3)
        val username = intent.getParcelableExtra<UserLogin>("UserLogin")?.username
        user1.text = "$username"
        user2.text = "$username"
        user3.text = "$username"

        binding.button.setOnClickListener{replace(ScrollingFragment())}

    }

    private fun replace(fragment: Fragment){
    val fragmentManager = supportFragmentManager
        val  fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.ftampil, fragment)
        fragmentTransaction.commit()
    }
}