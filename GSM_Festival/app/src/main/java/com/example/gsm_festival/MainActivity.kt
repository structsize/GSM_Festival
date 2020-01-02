package com.example.gsm_festival


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Realm.init(this)



        startbtn.setOnClickListener{

            val intent = Intent(this, bmicoculator::class.java)
            startActivity(intent)
            finish()

        }
    }



}
