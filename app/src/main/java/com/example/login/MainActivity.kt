package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var ButtonSubmit: Button?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButtonSubmit=findViewById(R.id.button)

        ButtonSubmit!!.setOnClickListener {
            val intent= Intent(this,Activityfood::class.java)
            startActivity(intent)
        }


    }
}