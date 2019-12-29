package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_dish.*
import java.util.*
import kotlin.collections.ArrayList

class MainDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = arrayListOf<String>()
        var kcalstr = arrayListOf<Int>()
        
        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext1.text = kcal.toString()
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

        checkBox1.setOnClickListener {
            if (checkBox1.isChecked) {
                kcal = limitfood(checkBox1, limited, 321, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add("현미밥")
                    kcalstr.add(322)
                }
                caltext1.text = kcal.toString()
            } else {
                kcal = minus(322, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"현미밥")
                kcalstr = checkint(kcalstr, 322)
            }
        }
        checkBox2.setOnClickListener {
            if (checkBox2.isChecked) {
                kcal = limitfood(checkBox2, limited, 313, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "쌀밥")
                    kcalstr.add(313)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(313, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"쌀밥")
                kcalstr = checkint(kcalstr, 313)
            }
        }
        checkBox3.setOnClickListener {
            if (checkBox3.isChecked) {
                kcal = limitfood(checkBox3, limited, 304, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "잡곡밥")
                    kcalstr.add(304)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(304, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"잡곡밥")
                kcalstr = checkint(kcalstr, 304)
            }
        }
        checkBox4.setOnClickListener {
            if (checkBox4.isChecked) {
                kcal = limitfood(checkBox4, limited, 321, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "찰밥")
                    kcalstr.add(321)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(321, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"찰밥")
                kcalstr = checkint(kcalstr, 321)
            }
        }
        checkBox5.setOnClickListener {
            if (checkBox5.isChecked) {
                kcal = limitfood(checkBox5, limited, 633, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "카레")
                    kcalstr.add(633)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(633, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"카레")
                kcalstr = checkint(kcalstr, 633)
            }
        }
        checkBox6.setOnClickListener {
            if (checkBox6.isChecked) {
                kcal = limitfood(checkBox6, limited, 450, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "볶음밥")
                    kcalstr.add(450)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(450, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"볶음밥")
                kcalstr = checkint(kcalstr, 450)
            }
        }
        checkBox7.setOnClickListener {
            if (checkBox7.isChecked) {
                kcal = limitfood(checkBox7, limited, 408, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "잔치국수")
                    kcalstr.add(408)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(408, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"잔치국수")
                kcalstr = checkint(kcalstr, 408)
            }
        }
        checkBox8.setOnClickListener {
            if (checkBox8.isChecked) {
                kcal = limitfood(checkBox8, limited, 489, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "비빔국수")
                    kcalstr.add(489)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(489, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"비빔국수")
                kcalstr = checkint(kcalstr, 489)
            }
        }
        checkBox9.setOnClickListener {
            if (checkBox9.isChecked) {
                kcal = limitfood(checkBox9, limited, 600, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "초계국수")
                    kcalstr.add(600)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(600, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"초계국수")
                kcalstr = checkint(kcalstr, 600)
            }
        }
        checkBox10.setOnClickListener {
            if (checkBox10.isChecked) {
                kcal = limitfood(checkBox10, limited, 599, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "비빔밥")
                    kcalstr.add(599)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(599, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"비빔밥")
                kcalstr = checkint(kcalstr, 599)
            }
        }
        checkBox11.setOnClickListener {
            if (checkBox11.isChecked) {
                kcal = limitfood(checkBox11, limited, 670, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "전복죽")
                    kcalstr.add(670)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(670, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"전복죽")
                kcalstr = checkint(kcalstr, 670)
            }
        }
        checkBox12.setOnClickListener {
            if (checkBox12.isChecked) {
                kcal = limitfood(checkBox12, limited, 382, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr.add( "팥죽")
                    kcalstr.add(382)
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(382, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring(namestr,"팥죽")
                kcalstr = checkint(kcalstr, 382)
            }
        }

        backbutton.setOnClickListener{
            val intent = Intent(this, AppMain::class.java)
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
