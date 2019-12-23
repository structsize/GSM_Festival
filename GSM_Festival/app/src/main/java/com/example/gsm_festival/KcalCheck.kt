package com.example.gsm_festival

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_kcal_check.*


class KcalCheck : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcal_check)
        var Kcal = 0
        mainbtn.setOnClickListener{
            val intent = Intent(this, MainDish::class.java)
            intent.putExtra("Kcal",Kcal)
            startActivity(intent)
        }
        soupbtn.setOnClickListener{
            val intent = Intent(this, SoupDish::class.java)
            intent.putExtra("Kcal",Kcal)
            startActivity(intent)
        }
        sidebtn.setOnClickListener{
            val intent = Intent(this, SideDish::class.java)
            intent.putExtra("Kcal",Kcal)
            startActivity(intent)
        }
        dessertbtn.setOnClickListener{
            val intent = Intent(this, DessertDish::class.java)
            intent.putExtra("Kcal", Kcal)
            startActivity(intent)
        }

    }
}
