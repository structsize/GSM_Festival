package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dessert_dish.*
import java.util.*

class DessertDish : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dessert_dish)
        var limited : Int = 0
        var kcal : Int = 0
        val intent : Intent = getIntent()
        var namestr = ""

        if(intent.hasExtra("Kcal")){
            kcal = intent.getIntExtra("Kcal",0)
            caltext4.text = kcal.toString()
        }
        if(intent.hasExtra("limited")){
            limited = intent.getIntExtra("limited",0)
        }

        checkBox40.setOnClickListener {
            if (checkBox40.isChecked) {
                kcal = limitfood(checkBox40, limited, 54, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "키위, "
                }
                caltext4.text = kcal.toString()
            } else {
                kcal = minus(54, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("키위")
            }
        }
        checkBox41.setOnClickListener {
            if (checkBox41.isChecked) {
                kcal = limitfood(checkBox41, limited, 40, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "딸기, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(40, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("딸기")
            }
        }
        checkBox42.setOnClickListener {
            if (checkBox42.isChecked) {
                kcal = limitfood(checkBox42, limited, 52, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "사과"
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(52, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("사과")
            }
        }
        checkBox43.setOnClickListener {
            if (checkBox43.isChecked) {
                kcal = limitfood(checkBox43, limited, 39, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "복숭아, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(39, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("복숭아")
            }
        }
        checkBox44.setOnClickListener {
            if (checkBox44.isChecked) {
                kcal = limitfood(checkBox44, limited, 120, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "푸딩, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(120, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("푸딩")
            }
        }
        checkBox45.setOnClickListener {
            if (checkBox45.isChecked) {
                kcal = limitfood(checkBox45, limited, 50, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "파인애플, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(50, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("파인애플")
            }
        }
        checkBox46.setOnClickListener {
            if (checkBox46.isChecked) {
                kcal = limitfood(checkBox46, limited, 150, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "마카롱, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(150, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("마카롱")
            }
        }
        checkBox47.setOnClickListener {
            if (checkBox47.isChecked) {
                kcal = limitfood(checkBox47, limited, 280, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "케이크, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(280, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("케이크")
            }
        }
        checkBox48.setOnClickListener {
            if (checkBox48.isChecked) {
                kcal = limitfood(checkBox48, limited, 39, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "귤, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(39, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("귤")
            }
        }
        checkBox49.setOnClickListener {
            if (checkBox49.isChecked) {
                kcal = limitfood(checkBox49, limited, 207, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "아이스크림, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(207, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("아이스크림")
            }
        }
        checkBox50.setOnClickListener {
            if (checkBox50.isChecked) {
                kcal = limitfood(checkBox50, limited, 67, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "포도, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(67, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("포도")
            }
        }
        checkBox51.setOnClickListener {
            if (checkBox51.isChecked) {
                kcal = limitfood(checkBox51, limited, 200, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "떡, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(200, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("떡")
            }
        }
        checkBox52.setOnClickListener {
            if (checkBox52.isChecked) {
                kcal = limitfood(checkBox52, limited, 700, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "빙수, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(700, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("빙수")
            }
        }
        checkBox53.setOnClickListener {
            if (checkBox53.isChecked) {
                kcal = limitfood(checkBox53, limited, 5, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "아메리카노, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(5, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("아메리카노")
            }
        }
        checkBox54.setOnClickListener {
            if (checkBox54.isChecked) {
                kcal = limitfood(checkBox54, limited, 153, kcal)
                if (caltext4.text.toString().toInt() != kcal) {
                    namestr += "코코아, "
                }
                caltext4.text = kcal.toString()

            } else {
                kcal = minus(153, kcal)
                caltext4.text = kcal.toString()
                namestr = checkstring("코코아")
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
