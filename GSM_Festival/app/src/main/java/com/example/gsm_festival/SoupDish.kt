package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_soup_dish.*
import java.util.*

class SoupDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soup_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = arrayListOf<String>()
        var kcalstr = arrayListOf<Int>()

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext2.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",2500)
        }
        if(intent.hasExtra("food")){
            namestr = intent.getStringArrayListExtra("food")
        }
        if(intent.hasExtra("kcalstr")){
            kcalstr = intent.getIntegerArrayListExtra("kcalstr")
        }

        checkBox13.setOnClickListener {
            if(checkBox13.isChecked){
                kcal = limitfood(checkBox13, limited,76,kcal)
                if(caltext2.text.toString().toInt() != kcal){
                    namestr.add("된장국")
                    kcalstr.add(76)
                }
                caltext2.text = kcal.toString()
            }

            else{
                kcal = minus(76,kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"된장국")
                kcalstr = checkint(kcalstr, 76)
            }
        }
        checkBox14.setOnClickListener {
            if (checkBox14.isChecked) {
                kcal = limitfood(checkBox14, limited, 456, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("김치찌개")
                    kcalstr.add(456)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(456, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"김치찌개")
                kcalstr = checkint(kcalstr, 456)
            }
        }
        checkBox15.setOnClickListener {
            if (checkBox15.isChecked) {
                kcal = limitfood(checkBox15, limited, 40, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("콩나물국")
                    kcalstr.add(40)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(40, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"콩나물국")
                kcalstr = checkint(kcalstr, 40)
            }
        }
        checkBox16.setOnClickListener {
            if (checkBox16.isChecked) {
                kcal = limitfood(checkBox16,limited, 92, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("미역국")
                    kcalstr.add(92)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(92, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"미역국")
                kcalstr = checkint(kcalstr, 92)
            }
        }
        checkBox17.setOnClickListener {
            if (checkBox17.isChecked) {
                kcal = limitfood(checkBox17, limited, 213, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("매운탕")
                    kcalstr.add(213)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(213, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"매운탕")
                kcalstr = checkint(kcalstr, 213)
            }
        }
        checkBox18.setOnClickListener {
            if (checkBox18.isChecked) {
                kcal = limitfood(checkBox18, limited, 192, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("소고기무국")
                    kcalstr.add(192)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(192, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"소고기무국")
                kcalstr = checkint(kcalstr, 192)
            }
        }
        checkBox19.setOnClickListener {
            if (checkBox19.isChecked) {
                kcal = limitfood(checkBox19, limited, 480, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("만두국")
                    kcalstr.add(480)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(480, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"만두국")
                kcalstr = checkint(kcalstr, 480)
            }
        }
        checkBox20.setOnClickListener {
            if (checkBox20.isChecked) {
                kcal = limitfood(checkBox20, limited, 272, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("계란국")
                    kcalstr.add(272)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(272, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"계란국")
                kcalstr = checkint(kcalstr, 272)
            }
        }
        checkBox21.setOnClickListener {
            if (checkBox21.isChecked) {
                kcal = limitfood(checkBox21, limited, 72, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("토란국")
                    kcalstr.add(72)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(72, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"토란국")
                kcalstr = checkint(kcalstr, 72)
            }
        }
        checkBox22.setOnClickListener {
            if (checkBox22.isChecked) {
                kcal = limitfood(checkBox22, limited, 429, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("감자탕")
                    kcalstr.add(429)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(429, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"감자탕")
                kcalstr = checkint(kcalstr, 429)
            }
        }
        checkBox23.setOnClickListener {
            if (checkBox23.isChecked) {
                kcal = limitfood(checkBox23, limited, 325, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("떡국")
                    kcalstr.add(325)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(325, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"떡국")
                kcalstr = checkint(kcalstr, 325)
            }
        }
        checkBox24.setOnClickListener {
            if (checkBox24.isChecked) {
                kcal = limitfood(checkBox24, limited, 253, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("순두부찌개")
                    kcalstr.add(253)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(253, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"순두부찌개")
                kcalstr = checkint(kcalstr, 253)
            }
        }
        checkBox25.setOnClickListener {
            if (checkBox25.isChecked) {
                kcal = limitfood(checkBox25, limited, 712, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("부대찌개")
                    kcalstr.add(712)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(712, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"부대찌개")
                kcalstr = checkint(kcalstr, 712)
            }
        }
        checkBox26.setOnClickListener {
            if (checkBox26.isChecked) {
                kcal = limitfood(checkBox26, limited, 240, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("북어국")
                    kcalstr.add(240)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(240, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"북어국")
                kcalstr = checkint(kcalstr, 240)
            }
        }
        checkBox27.setOnClickListener {
            if (checkBox27.isChecked) {
                kcal = limitfood(checkBox27, limited, 179, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr.add("곰탕")
                    kcalstr.add(179)
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(179, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring(namestr,"곰탕")
                kcalstr = checkint(kcalstr, 179)
            }
        }
        backbutton.setOnClickListener{
            val intent = Intent()
            intent.putExtra("Kcal",kcal)
            intent.putExtra("food",namestr)
            intent.putExtra("kcaltxt",kcalstr)
            setResult(Activity.RESULT_OK,intent)
            finish()

        }
    }
    fun limitfood(c : CheckBox, limited : Int, fkcal : Int, kcal : Int) : Int{
        if(kcal+fkcal > limited){
            Toast.makeText(this,"칼로리 제한을 넘었습니다", Toast.LENGTH_SHORT).show()
            c.isChecked = false
            return kcal
        }
        return kcal+fkcal
    }
    fun minus(fkcal: Int, kcal: Int) : Int{
        return kcal-fkcal
    }
    fun checkint(i1 : ArrayList<Int>, i2 : Int) : ArrayList<Int>{
        var cnt = 0
        while(cnt < i1.size){
            if(i1[cnt] == i2){
                i1.remove(i2)
            }
            cnt++
        }
        return i1
    }
    fun checkstring(s1 : ArrayList<String>, s2 : String) : ArrayList<String>{
        var cnt = 0
        while(cnt < s1.size){
            if(s1[cnt]===s2){
                s1.remove(s2)
            }
            cnt++

        }
        return s1
    }
}
