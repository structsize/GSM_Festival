package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main_dish.*
import java.util.*

class MainDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = ""

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext1.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",2500)
        }

        checkBox1.setOnClickListener {
            if (checkBox1.isChecked) {
                kcal = limitfood(checkBox1, limited, 321, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "현미밥, "
                }
                caltext1.text = kcal.toString()
            } else {
                kcal = minus(321, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("현미밥")
            }
        }
        checkBox2.setOnClickListener {
            if (checkBox2.isChecked) {
                kcal = limitfood(checkBox2, limited, 313, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "쌀밥, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(313, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("쌀밥")
            }
        }
        checkBox3.setOnClickListener {
            if (checkBox3.isChecked) {
                kcal = limitfood(checkBox3, limited, 304, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "잡곡밥, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(304, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("잡곡밥")
            }
        }
        checkBox4.setOnClickListener {
            if (checkBox4.isChecked) {
                kcal = limitfood(checkBox4, limited, 321, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "찰밥, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(321, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("찰밥")
            }
        }
        checkBox5.setOnClickListener {
            if (checkBox5.isChecked) {
                kcal = limitfood(checkBox5, limited, 633, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "카레, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(633, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("카레")
            }
        }
        checkBox6.setOnClickListener {
            if (checkBox6.isChecked) {
                kcal = limitfood(checkBox6, limited, 450, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "볶음밥, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(450, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("볶음밥")
            }
        }
        checkBox7.setOnClickListener {
            if (checkBox7.isChecked) {
                kcal = limitfood(checkBox7, limited, 408, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "잔치국수, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(408, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("잔치국수")
            }
        }
        checkBox8.setOnClickListener {
            if (checkBox8.isChecked) {
                kcal = limitfood(checkBox8, limited, 489, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "비빔국수, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(489, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("비빔국수")
            }
        }
        checkBox9.setOnClickListener {
            if (checkBox9.isChecked) {
                kcal = limitfood(checkBox9, limited, 600, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "초계국수, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(600, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("초계국수")
            }
        }
        checkBox10.setOnClickListener {
            if (checkBox10.isChecked) {
                kcal = limitfood(checkBox10, limited, 599, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "비빔밥, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(599, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("비빔밥")
            }
        }
        checkBox11.setOnClickListener {
            if (checkBox11.isChecked) {
                kcal = limitfood(checkBox11, limited, 670, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "전복죽, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(670, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("전복죽")
            }
        }
        checkBox12.setOnClickListener {
            if (checkBox12.isChecked) {
                kcal = limitfood(checkBox12, limited, 382, kcal)
                if (caltext1.text.toString().toInt() != kcal) {
                    namestr += "팥죽, "
                }
                caltext1.text = kcal.toString()

            } else {
                kcal = minus(382, kcal)
                caltext1.text = kcal.toString()
                namestr = checkstring("팥죽")
            }
        }

        backbutton.setOnClickListener{
            val intent = Intent(this, AppMain::class.java)
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
