package com.example.gsm_festival


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_app_main.*

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
            val intent = Intent(this, Bluetooth::class.java)
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
            val intent = Intent(this, KcalCheck::class.java)
            intent.putExtra("bmilimit",bmi)
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
        editor.putString("name",name).putString("gender",gender).putString("age",age).putInt("height", height).putInt("weight1",weight).apply()
    }
    private fun loadData(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)

        val height1 = pref.getInt("height",height)
        val weight1 = pref.getInt("weight1",weight)

        if(height1 != 0 && weight1 != 0){
            height = height1
            weight = weight1
        }
    }
}
