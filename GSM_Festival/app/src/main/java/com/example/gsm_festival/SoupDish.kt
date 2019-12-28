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
        var namestr = ""

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext2.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",2500)
        }

        checkBox13.setOnClickListener {
            if(checkBox13.isChecked){
                kcal = limitfood(checkBox13, limited,76,kcal)
                if(caltext2.text.toString().toInt() != kcal){
                    namestr += "된장국, "
                }
                caltext2.text = kcal.toString()
            }

            else{
                kcal = minus(76,kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("된장국")
            }
        }
        checkBox14.setOnClickListener {
            if (checkBox14.isChecked) {
                kcal = limitfood(checkBox14, limited, 456, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "김치찌개, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(456, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("김치찌개")
            }
        }
        checkBox15.setOnClickListener {
            if (checkBox15.isChecked) {
                kcal = limitfood(checkBox15, limited, 40, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "콩나물국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(40, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("콩나물국")
            }
        }
        checkBox16.setOnClickListener {
            if (checkBox16.isChecked) {
                kcal = limitfood(checkBox16,limited, 92, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "미역국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(92, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("미역국")
            }
        }
        checkBox17.setOnClickListener {
            if (checkBox17.isChecked) {
                kcal = limitfood(checkBox17, limited, 213, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "매운탕, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(213, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("매운탕")
            }
        }
        checkBox18.setOnClickListener {
            if (checkBox18.isChecked) {
                kcal = limitfood(checkBox18, limited, 192, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "소고기무국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(192, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("소고기무국")
            }
        }
        checkBox19.setOnClickListener {
            if (checkBox19.isChecked) {
                kcal = limitfood(checkBox19, limited, 480, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "만두국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(480, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("만두국")
            }
        }
        checkBox20.setOnClickListener {
            if (checkBox20.isChecked) {
                kcal = limitfood(checkBox20, limited, 272, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "계란국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(272, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("계란국")
            }
        }
        checkBox21.setOnClickListener {
            if (checkBox21.isChecked) {
                kcal = limitfood(checkBox21, limited, 72, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "토란국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(72, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("토란국")
            }
        }
        checkBox22.setOnClickListener {
            if (checkBox22.isChecked) {
                kcal = limitfood(checkBox22, limited, 429, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "감자탕, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(429, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("감자탕")
            }
        }
        checkBox23.setOnClickListener {
            if (checkBox23.isChecked) {
                kcal = limitfood(checkBox23, limited, 325, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "떡국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(325, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("떡국")
            }
        }
        checkBox24.setOnClickListener {
            if (checkBox24.isChecked) {
                kcal = limitfood(checkBox24, limited, 253, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "순두부찌개, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(253, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("순두부찌개")
            }
        }
        checkBox25.setOnClickListener {
            if (checkBox25.isChecked) {
                kcal = limitfood(checkBox25, limited, 712, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "부대찌개, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(712, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("부대찌개")
            }
        }
        checkBox26.setOnClickListener {
            if (checkBox26.isChecked) {
                kcal = limitfood(checkBox26, limited, 240, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "북어국, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(240, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("북어국")
            }
        }
        checkBox27.setOnClickListener {
            if (checkBox27.isChecked) {
                kcal = limitfood(checkBox27, limited, 179, kcal)
                if (caltext2.text.toString().toInt() != kcal) {
                    namestr += "곰탕, "
                }
                caltext2.text = kcal.toString()

            } else {
                kcal = minus(179, kcal)
                caltext2.text = kcal.toString()
                namestr = checkstring("곰탕")
            }
        }
        backbutton.setOnClickListener{
            val intent = Intent()
            intent.putExtra("Kcal",kcal)
            intent.putExtra("food",namestr)
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
    fun checkstring(s : String) : String{
        var st : String = ""
        val str : StringTokenizer = StringTokenizer(s,", ")
        while(str.hasMoreTokens()){
            if(str.nextToken() === s){
                continue
            }
            st += str.nextToken()
        }
        return st
    }
}
