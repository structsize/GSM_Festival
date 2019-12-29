package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_side_dish.*
import java.util.*

class SideDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = arrayListOf<String>()
        var kcalstr = arrayListOf<Int>()

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext3.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",0)
        }
        if(intent.hasExtra("food")){
            namestr = intent.getStringArrayListExtra("food")
        }
        if(intent.hasExtra("kcalstr")){
            kcalstr = intent.getIntegerArrayListExtra("kcalstr")
        }

        checkBox28.setOnClickListener {
            if (checkBox28.isChecked) {
                kcal = limitfood(checkBox28, limited, 29, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("김치")
                    kcalstr.add(29)
                }
                caltext3.text = kcal.toString()
            } else {
                kcal = minus(29, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"김치")
                kcalstr = checkint(kcalstr, 29)
            }
        }
        checkBox29.setOnClickListener {
            if (checkBox29.isChecked) {
                kcal = limitfood(checkBox29, limited, 257, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("어묵볶음")
                    kcalstr.add(257)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(257, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"어묵볶음")
                kcalstr = checkint(kcalstr, 257)
            }
        }
        checkBox30.setOnClickListener {
            if (checkBox30.isChecked) {
                kcal = limitfood(checkBox30, limited, 64, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("시금치")
                    kcalstr.add(64)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(64, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"시금치")
                kcalstr = checkint(kcalstr, 64)
            }
        }
        checkBox31.setOnClickListener {
            if (checkBox31.isChecked) {
                kcal = limitfood(checkBox31, limited, 69, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("멸치볶음")
                    kcalstr.add(69)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(69, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"멸치볶음")
                kcalstr = checkint(kcalstr, 69)
            }
        }
        checkBox32.setOnClickListener {
            if (checkBox32.isChecked) {
                kcal = limitfood(checkBox32, limited, 300, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("소시지")
                    kcalstr.add(300)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(300, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"소시지")
                kcalstr = checkint(kcalstr, 300)
            }
        }
        checkBox33.setOnClickListener {
            if (checkBox33.isChecked) {
                kcal = limitfood(checkBox33, limited, 379, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("고등어구이")
                    kcalstr.add(379)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(379, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"고등어구이")
                kcalstr = checkint(kcalstr, 379)
            }
        }
        checkBox34.setOnClickListener {
            if (checkBox34.isChecked) {
                kcal = limitfood(checkBox34, limited, 30, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("콩나물")
                    kcalstr.add(30)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(30, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"콩나물")
                kcalstr = checkint(kcalstr, 30)
            }
        }
        checkBox35.setOnClickListener {
            if (checkBox35.isChecked) {
                kcal = limitfood(checkBox35, limited, 124, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("장조림")
                    kcalstr.add(124)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(124, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"장조림")
                kcalstr = checkint(kcalstr, 124)
            }
        }
        checkBox36.setOnClickListener {
            if (checkBox36.isChecked) {
                kcal = limitfood(checkBox36, limited, 336, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("계란말이")
                    kcalstr.add(336)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(336, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"계란말이")
                kcalstr = checkint(kcalstr, 336)
            }
        }
        checkBox37.setOnClickListener {
            if (checkBox37.isChecked) {
                kcal = limitfood(checkBox37, limited, 117, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("가지볶음")
                    kcalstr.add(117)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(117, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"가지볶음")
                kcalstr = checkint(kcalstr, 117)
            }
        }
        checkBox38.setOnClickListener {
            if (checkBox38.isChecked) {
                kcal = limitfood(checkBox38, limited, 16, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("깍두기")
                    kcalstr.add(16)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(16, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring(namestr,"깍두기")
                kcalstr = checkint(kcalstr, 16)
            }
        }
        checkBox39.setOnClickListener {
            if (checkBox39.isChecked) {
                kcal = limitfood(checkBox39, limited, 30, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr.add("동그랑땡")
                    kcalstr.add(30)
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(30, kcal)
                caltext3.text = kcal.toString()
                checkstring(namestr,"동그랑땡")
                kcalstr = checkint(kcalstr, 30)
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
