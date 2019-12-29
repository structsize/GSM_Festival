package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dessert_dish.*
import java.util.*
import kotlin.collections.ArrayList

class DessertDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = arrayListOf<String>()
        var kcalstr = arrayListOf<Int>()

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext4.text = kcal.toString()
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

        checkBox40.setOnClickListener {
            if (checkBox40.isChecked) {
                kcal = limitfood(checkBox40, limited, 54, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("키위")
                    kcalstr.add(54)
                }
                caltext4.text = kcal.toString()
            } else {
                kcal = minus(54, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"키위")
                kcalstr = checkint(kcalstr, 54)
            }
        }
        checkBox41.setOnClickListener {
            if (checkBox41.isChecked) {
                kcal = limitfood(checkBox41, limited, 40, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("딸기")
                    kcalstr.add(40)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(40, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"딸기")
                kcalstr = checkint(kcalstr, 40)
            }
        }
        checkBox42.setOnClickListener {
            if (checkBox42.isChecked) {
                kcal = limitfood(checkBox42, limited, 52, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("사과")
                    kcalstr.add(52)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(52, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"사과")
                kcalstr = checkint(kcalstr, 52)
            }
        }
        checkBox43.setOnClickListener {
            if (checkBox43.isChecked) {
                kcal = limitfood(checkBox43, limited, 39, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("복숭아")
                    kcalstr.add(39)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(39, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"복숭아")
                kcalstr = checkint(kcalstr, 39)
            }
        }
        checkBox44.setOnClickListener {
            if (checkBox44.isChecked) {
                kcal = limitfood(checkBox44, limited, 120, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("푸딩")
                    kcalstr.add(120)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(120, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"푸딩")
                kcalstr = checkint(kcalstr, 120)
            }
        }
        checkBox45.setOnClickListener {
            if (checkBox45.isChecked) {
                kcal = limitfood(checkBox45, limited, 50, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("파인애플")
                    kcalstr.add(50)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(50, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"파인애플")
                kcalstr = checkint(kcalstr, 50)
            }
        }
        checkBox46.setOnClickListener {
            if (checkBox46.isChecked) {
                kcal = limitfood(checkBox46, limited, 150, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("마카롱")
                    kcalstr.add(150)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(150, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"마카롱")
                kcalstr = checkint(kcalstr, 150)
            }
        }
        checkBox47.setOnClickListener {
            if (checkBox47.isChecked) {
                kcal = limitfood(checkBox47, limited, 280, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("케이크")
                    kcalstr.add(280)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(280, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"케이크")
                kcalstr = checkint(kcalstr, 280)
            }
        }
        checkBox48.setOnClickListener {
            if (checkBox48.isChecked) {
                kcal = limitfood(checkBox48, limited, 39, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("귤")
                    kcalstr.add(39)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(39, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"귤")
                kcalstr = checkint(kcalstr, 39)
            }
        }
        checkBox49.setOnClickListener {
            if (checkBox49.isChecked) {
                kcal = limitfood(checkBox49, limited, 207, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("아이스크림")
                    kcalstr.add(207)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(207, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"아이스크림")
                kcalstr = checkint(kcalstr, 207)
            }
        }
        checkBox50.setOnClickListener {
            if (checkBox50.isChecked) {
                kcal = limitfood(checkBox50, limited, 67, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("포도")
                    kcalstr.add(67)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(67, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"포도")
                kcalstr = checkint(kcalstr, 67)
            }
        }
        checkBox51.setOnClickListener {
            if (checkBox51.isChecked) {
                kcal = limitfood(checkBox51, limited, 200, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("떡")
                    kcalstr.add(200)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(200, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"떡")
                kcalstr = checkint(kcalstr, 200)
            }
        }
        checkBox52.setOnClickListener {
            if (checkBox52.isChecked) {
                kcal = limitfood(checkBox52, limited, 700, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("빙수")
                    kcalstr.add(700)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(700, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"빙수")
                kcalstr = checkint(kcalstr, 700)
            }
        }
        checkBox53.setOnClickListener {
            if (checkBox53.isChecked) {
                kcal = limitfood(checkBox53, limited, 5, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("아메리카노")
                    kcalstr.add(5)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(5, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"아메리카노")
                kcalstr = checkint(kcalstr, 5)
            }
        }
        checkBox54.setOnClickListener {
            if (checkBox54.isChecked) {
                kcal = limitfood(checkBox54, limited, 153, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr.add("코코아")
                    kcalstr.add(153)
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(153, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring(namestr,"코코아")
                kcalstr = checkint(kcalstr, 153)
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
