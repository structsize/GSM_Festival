package com.example.gsm_festival


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import io.realm.Realm
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.kotlin.createObject
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.activity_app_main.*
import java.time.format.DateTimeFormatter
import java.util.*

class AppMain : AppCompatActivity() {

    var weight = 0
    var height = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_main)

        val intent : Intent = getIntent()
        if(intent.hasExtra("user")){
            val user = intent.getParcelableExtra<User>("user")

            nametag.text = user.name
            ageoutput.text = user.age
            gender.text = user.gender
            weight = user.weight
            height = user.height

        }


        loadData()


        val bmi : Double = weight/Math.pow(height/100.0,2.0)

        weightcheck.setOnClickListener {
            val intent = Intent(this, WeightCheck::class.java)
            startActivityForResult(intent,1)
            saveData(nametag.text.toString(),gender.text.toString(), ageoutput.text.toString(),height,weight)

        }


        endbutton.setOnClickListener{
            System.exit(0)
        }

        calendarbutton.setOnClickListener{
            val intent = Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }

        kcalcheck.setOnClickListener{
            val intent = Intent(this, Food::class.java)
            intent.putExtra("bmi",bmi)
            startActivity(intent)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == 1){
            weight = data!!.getStringExtra("weightin").toInt()

        }
    }
    private fun saveData(name : String , gender : String, age : String, height: Int, weight: Int){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("name",name).putString("gender",gender).putString("age",age).putInt("height1", height).putInt("weight1",weight).apply()
    }
    private fun loadData(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        val height1 = pref.getInt("height1",0)
        val weight1 = pref.getInt("weight1",0)

        if(height1 != 0 && weight1 != 0){
            height = height1
            weight = weight1
        }
    }

}

