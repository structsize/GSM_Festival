package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.View
import kotlinx.android.synthetic.main.activity_weight_check.*
import java.util.*
import kotlin.collections.ArrayList

class WeightCheck : AppCompatActivity(){
    val calendar = Calendar.getInstance()
    var weightstr : String = ""
    var timestr : String = ""
    var weight : Int = 0
    var cnt = 0
    var weightlist = arrayListOf<Int>()
    var timelist = arrayListOf<Long>()
    var list = arrayListOf<Weight>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_check)


        loaddata()

        while(cnt<weightlist.size){
            var data = Weight(weightlist[cnt],timelist[cnt])
            list.add(data)
            cnt++
        }

        val weightadapter = WeightAdapter(this, list)
        listView3.adapter = weightadapter

        bluetoothbtn.setOnClickListener {
            val intent = Intent(this,Bluetooth::class.java)
            startActivityForResult(intent, 1)
        }
        okbtn.setOnClickListener {
            val intent = Intent()
            if(weight != 0) {
                intent.putExtra("weighti", weight)
            }
            setResult(Activity.RESULT_OK, intent)
            savedata()
            finish()
        }
        while(cnt < timelist.size){
            val data = Weight(weightlist[cnt], timelist[cnt])
            list.add(data)
            cnt++
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            listView3.visibility = View.VISIBLE

            weight = data!!.getIntExtra("weighti",0)
            weightlist.add(weight)

            var time = data.getLongExtra("time",calendar.timeInMillis)
            timelist.add(time)
            list.add(Weight(weight,time))
            val weightadapter = WeightAdapter(this, list)
            listView3.adapter = weightadapter
        }
    }
    private fun savedata(){
        cnt = 0
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        while(cnt<weightlist.size){

                weightstr = weightstr + weightlist[cnt].toString() + ", "
                timestr = timestr + timelist[cnt].toString() + ", "
                cnt++

        }
        editor.putString("time",timestr).putString("weight12",weightstr).apply()
    }
    private fun loaddata(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        weightstr = pref.getString("weight12","").toString()
        timestr = pref.getString("time","").toString()
        if(weightstr != "" && timestr != "") {
            var st1 = StringTokenizer(weightstr, ", ")
            var st2 = StringTokenizer(timestr, ", ")
            while (st1.hasMoreTokens() && st2.hasMoreTokens()) {
                weightlist.add(st1.nextToken().toInt())
                timelist.add(st2.nextToken().toLong())
            }
        }
    }


}


