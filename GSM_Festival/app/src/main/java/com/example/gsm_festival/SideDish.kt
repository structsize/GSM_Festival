package com.example.gsm_festival

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SideDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_dish)
        var limited : Int
        var kcal : Int
        val intent : Intent = getIntent()
        if(intent.hasExtra("kcal")){
            kcal = intent.getIntExtra("kcal",0)
            limited = intent.getIntExtra("limited",0)
        }
    }
}
