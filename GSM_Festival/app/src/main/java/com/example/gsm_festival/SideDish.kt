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
        var namestr = ""

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext3.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",0)
        }

        checkBox28.setOnClickListener {
            if (checkBox28.isChecked) {
                kcal = limitfood(checkBox28, limited, 29, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "김치, "
                }
                caltext3.text = kcal.toString()
            } else {
                kcal = minus(29, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("김치")
            }
        }
        checkBox29.setOnClickListener {
            if (checkBox29.isChecked) {
                kcal = limitfood(checkBox29, limited, 257, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "어묵볶음, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(257, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("어묵볶음")
            }
        }
        checkBox30.setOnClickListener {
            if (checkBox30.isChecked) {
                kcal = limitfood(checkBox30, limited, 64, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "시금치, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(64, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("시금치")
            }
        }
        checkBox31.setOnClickListener {
            if (checkBox31.isChecked) {
                kcal = limitfood(checkBox31, limited, 69, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "멸치볶음, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(69, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("멸치볶음")
            }
        }
        checkBox32.setOnClickListener {
            if (checkBox32.isChecked) {
                kcal = limitfood(checkBox32, limited, 300, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "소시지, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(300, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("소시지")
            }
        }
        checkBox33.setOnClickListener {
            if (checkBox33.isChecked) {
                kcal = limitfood(checkBox33, limited, 379, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "고등어구이, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(379, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("고등어구이")
            }
        }
        checkBox34.setOnClickListener {
            if (checkBox34.isChecked) {
                kcal = limitfood(checkBox34, limited, 30, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "콩나물, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(30, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("콩나물")
            }
        }
        checkBox35.setOnClickListener {
            if (checkBox35.isChecked) {
                kcal = limitfood(checkBox35, limited, 124, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "장조림, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(124, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("장조림")
            }
        }
        checkBox36.setOnClickListener {
            if (checkBox36.isChecked) {
                kcal = limitfood(checkBox36, limited, 336, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "계란말이, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(336, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("계란말이")
            }
        }
        checkBox37.setOnClickListener {
            if (checkBox37.isChecked) {
                kcal = limitfood(checkBox37, limited, 117, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "가지볶음, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(117, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("가지볶음")
            }
        }
        checkBox38.setOnClickListener {
            if (checkBox38.isChecked) {
                kcal = limitfood(checkBox38, limited, 16, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "깍두기, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(16, kcal)
                caltext3.text = kcal.toString()
                namestr = checkstring("깍두기")
            }
        }
        checkBox39.setOnClickListener {
            if (checkBox39.isChecked) {
                kcal = limitfood(checkBox39, limited, 30, kcal)
                if (caltext3.text.toString().toInt() != kcal) {
                    namestr += "동그랑땡, "
                }
                caltext3.text = kcal.toString()

            } else {
                kcal = minus(30, kcal)
                caltext3.text = kcal.toString()
                checkstring("동그랑땡")
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
