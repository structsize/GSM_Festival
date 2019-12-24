package com.example.gsm_festival

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kcal_check.*


class KcalCheck : AppCompatActivity() {
    var kcal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcal_check)
        val intents : Intent = getIntent()
        var limited = 0
        if(intents.hasExtra("bmi")){
            val bmi = intents.getIntExtra("bmi",0)
            when{
                bmi >= 35 -> limited = 1600
                bmi >= 30 -> limited = 1700
                bmi >= 25 -> limited = 1800
                bmi >= 23 -> limited = 2000
                bmi >= 18.5 -> limited = 2200
                else -> limited = 2500
            }

        }

        mainbtn.setOnClickListener{
            val intent = Intent(this, MainDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivity(intent)
        }
        soupbtn.setOnClickListener{
            val intent = Intent(this, SoupDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivity(intent)
        }
        sidebtn.setOnClickListener{
            val intent = Intent(this, SideDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivity(intent)
        }
        dessertbtn.setOnClickListener{
            val intent = Intent(this, DessertDish::class.java)
            intent.putExtra("Kcal", kcal)
            intent.putExtra("limited",limited)
            startActivity(intent)
        }

    }
}
