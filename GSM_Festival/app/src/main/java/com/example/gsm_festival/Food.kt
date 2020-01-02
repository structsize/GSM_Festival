package com.example.gsm_festival

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Food : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        var bmi = 0
        val intent = getIntent()
        if(intent.hasExtra("bmi"))
        {
            bmi = intent.getIntExtra("bmi",0)
        }




    }
}
