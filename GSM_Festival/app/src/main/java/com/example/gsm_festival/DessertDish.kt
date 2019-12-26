package com.example.gsm_festival

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_dish.*
import java.util.*

class DessertDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert_dish)
        var limited : Int
        var kcal : Int
        val intent : Intent = getIntent()
        if(intent.hasExtra("kcal")){
            kcal = intent.getIntExtra("kcal",0)
            limited = intent.getIntExtra("limited",0)
        }


    }
    fun limitfood(limited : Int, fkcal : Int, kcal : Int) : Int{
        if(kcal+fkcal > limited){
            Toast.makeText(this,"칼로리 제한을 넘었습니다", Toast.LENGTH_SHORT).show()
            return kcal
        }
        return kcal+fkcal
    }
    fun minus(kcal: Int, fkcal: Int) : Int{
        return kcal-fkcal
    }
    fun checkstring(s : String) : String{
        var st : String = ""
        val str : StringTokenizer = StringTokenizer(st,",")
        while(str.hasMoreTokens()){
            if(str.nextToken() === st){
                continue
            }
            st += str.nextToken()
        }
        return st
    }
}
