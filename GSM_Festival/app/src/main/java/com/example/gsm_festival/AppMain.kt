package com.example.gsm_festival


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_app_main.*

class AppMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_main)
        var weight = 0
        var height = 0
        var limited = 0


        val intent : Intent = getIntent()
        if(intent.hasExtra("user")){
            val user = intent.getParcelableExtra<User>("user")

            nametag.text = user.name
            ageoutput.text = user.age
            gender.text = user.gender
            weight = user.weight
            height = user.height
            val bmi : Double = weight/Math.pow(height/100.0,2.0)
            when{
                bmi >= 35 -> limited = 1600
                bmi >= 30 -> limited = 1700
                bmi >= 25 -> limited = 1800
                bmi >= 23 -> limited = 2000
                bmi >= 18.5 -> limited = 2200
                else -> limited = 2500
            }
        }
        weightcheck.setOnClickListener {

        }


        checkbutton.setOnClickListener{
            val intent = Intent(this, CheckActivity::class.java)
            startActivity(intent)

        }
        calendarbutton.setOnClickListener{

            
        }
        kcalcheck.setOnClickListener{
            val intent = Intent(this, KcalCheck::class.java)
            intent.putExtra("bmilimit",limited)
            startActivity(intent)
        }


    }
}
