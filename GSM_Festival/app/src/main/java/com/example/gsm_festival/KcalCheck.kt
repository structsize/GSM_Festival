package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kcal_check.*
import kotlinx.android.synthetic.main.activity_main_dish.*


class KcalCheck : AppCompatActivity() {
    var foodname : String = ""
    var kcal = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcal_check)
        val intents : Intent = getIntent()
        var limited = 0
        if(intents.hasExtra("bmi")){
            val bmi = intents.getDoubleExtra("bmi",0.0)
            when{
                bmi >= 35 -> limited = 1600
                bmi >= 30 -> limited = 1700
                bmi >= 25 -> limited = 1800
                bmi >= 23 -> limited = 2000
                bmi >= 18.5 -> limited = 2200
                else -> limited = 2500
            }

        }

        endbutton.setOnClickListener{
            val intent = Intent(this, FoodCheck::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("food",foodname)
            startActivity(intent)
        }
        mainbtn.setOnClickListener{
            val intent = Intent(this, MainDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivityForResult(intent,1)
        }
        soupbtn.setOnClickListener{
            val intent = Intent(this, SoupDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivityForResult(intent,1)
        }
        sidebtn.setOnClickListener{
            val intent = Intent(this, SideDish::class.java)
            intent.putExtra("Kcal",kcal)
            intent.putExtra("limited",limited)
            startActivityForResult(intent,1)
        }
        dessertbtn.setOnClickListener{
            val intent = Intent(this, DessertDish::class.java)
            intent.putExtra("Kcal", kcal)
            intent.putExtra("limited",limited)
            startActivityForResult(intent, 1)
        }


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            kcaltext.text = data!!.getIntExtra("Kcal", 0).toString()
            kcal = kcaltext.text.toString().toInt()
            foodname += data.getStringExtra("food").toString()
        }
    }
}
