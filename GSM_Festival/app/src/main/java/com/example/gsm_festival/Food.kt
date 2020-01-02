package com.example.gsm_festival

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Food : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)
        val intent = getIntent()
        var time = intent.getIntExtra("time",0)
        var cnt = 0
        var foodname = arrayListOf<String>()
        var kcal = arrayListOf<Int>()
        var foodlist = arrayListOf<Data>()
        if(intent.hasExtra("food")){
            foodname = intent.getStringArrayListExtra("food")
        }
        if(intent.hasExtra("kcal")){
            while(cnt < foodname.size){
                val data = Data(foodname[cnt], kcal[cnt])

                foodlist.add(data)
                cnt++
            }
        }

    }
}
