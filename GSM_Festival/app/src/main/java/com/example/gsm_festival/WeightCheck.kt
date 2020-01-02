package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import kotlinx.android.synthetic.main.activity_weight_check.*
import java.util.*

class WeightCheck : AppCompatActivity(){
    val calendar = Calendar.getInstance()
    var weightstr : String = ""
    var timestr : String = ""
    var weight = 0
    var cnt = 0
    var weightlist = arrayListOf<Int>()
    var timelist = arrayListOf<Long>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_check)


        loaddata()

        var list = arrayListOf<Weight>()
        while(cnt < weightlist.size){
            val data = Weight(weightlist[cnt], timelist[cnt])
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
            if(weight != 0 ) {
                intent.putExtra("weightin", weight.toString())
                setResult(Activity.RESULT_OK, intent)

            }
            savedata()
            finish()
        }
    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == 1){
            weight = data!!.getStringExtra("weightin").toInt()
            weightlist = data!!.getIntegerArrayListExtra("weight")
            var time = calendar.timeInMillis
            timelist.add(time)

        }
    }
    private fun savedata(){
        cnt = 0
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        while(cnt<weightlist.size){
            if(weightstr != "") {
                weightstr = weightstr + weightlist[cnt].toString() + ", "
                timestr = timestr + timelist[cnt].toString() + ", "
                cnt++
            }
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


