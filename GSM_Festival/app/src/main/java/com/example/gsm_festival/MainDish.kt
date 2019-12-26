package com.example.gsm_festival

import android.content.Intent
import android.nfc.cardemulation.NfcFCardEmulation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
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
        var namestr = ""

        if(intent.hasExtra("kcal")){
            kcal = intent.getIntExtra("kcal",0)
            limited = intent.getIntExtra("limited",0)
        }

        if(checkBox1.isChecked){
            kcal = limitfood(limited,321,kcal)
            caltext1.setText(kcal)
            namestr += "현미밥"
        }
        else{
            kcal = minus(321,kcal)
            caltext1.setText(kcal)
            checkstring("현미밥")
        }
        if(checkBox2.isChecked){
            kcal = limitfood(limited,313,kcal)
            caltext1.setText(kcal)
            namestr += "쌀밥"
        }
        else{
            kcal = minus(313,kcal)
            caltext1.setText(kcal)
            checkstring("쌀밥")
        }
        if(checkBox3.isChecked){
            kcal = limitfood(limited,304,kcal)
            caltext1.setText(kcal)
            namestr += "잡곡밥"
        }
        else{
            kcal = minus(304,kcal)
            caltext1.setText(kcal)
            checkstring("잡곡밥")
        }
        if(checkBox4.isChecked){
            kcal = limitfood(limited,321,kcal)
            caltext1.setText(kcal)
            namestr += "찰밥"
        }
        else{
            kcal = minus(321,kcal)
            caltext1.setText(kcal)
            checkstring("찰밥")
        }
        if(checkBox5.isChecked){
            kcal = limitfood(limited,633,kcal)
            caltext1.setText(kcal)
            namestr += "카레"
        }
        else{
            kcal = minus(633,kcal)
            caltext1.setText(kcal)
            checkstring("카레")
        }
        if(checkBox6.isChecked){
            kcal = limitfood(limited,450,kcal)
            caltext1.setText(kcal)
            namestr += "볶음밥"
        }
        else{
            kcal = minus(450,kcal)
            caltext1.setText(kcal)
            checkstring("볶음밥")
        }
        if(checkBox7.isChecked){
            kcal = limitfood(limited,408,kcal)
            caltext1.setText(kcal)
            namestr += "잔치국수"
        }
        else{
            kcal = minus(408,kcal)
            caltext1.setText(kcal)
            checkstring("잔치국수")
        }
        if(checkBox8.isChecked){
            kcal = limitfood(limited,489,kcal)
            caltext1.setText(kcal)
            namestr += "비빔국수"
        }
        else{
            kcal = minus(489,kcal)
            caltext1.setText(kcal)
            checkstring("비빔국수")
        }
        if(checkBox9.isChecked){
            kcal = limitfood(limited,600,kcal)
            caltext1.setText(kcal)
            namestr += "초계국수"
        }
        else{
            kcal = minus(600,kcal)
            caltext1.setText(kcal)
            checkstring("초계국수")
        }
        if(checkBox10.isChecked){
            kcal = limitfood(limited,599,kcal)
            caltext1.setText(kcal)
            namestr += "비빔밥"
        }
        else{
            kcal = minus(599,kcal)
            caltext1.setText(kcal)
            checkstring("비빔밥")
        }
        if(checkBox11.isChecked){
            kcal = limitfood(limited,670,kcal)
            caltext1.setText(kcal)
            namestr += "전복죽"
        }
        else{
            kcal = minus(670,kcal)
            caltext1.setText(kcal)
            checkstring("전복죽")
        }
        if(checkBox12.isChecked){
            kcal = limitfood(limited,382,kcal)
            caltext1.setText(kcal)
            namestr += "팥죽"
        }
        else{
            kcal = minus(382,kcal)
            caltext1.setText(kcal)
            checkstring("팥죽")
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
