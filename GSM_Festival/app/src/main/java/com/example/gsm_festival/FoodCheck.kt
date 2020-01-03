package com.example.gsm_festival

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_food_check.*
import java.util.*
import kotlin.collections.ArrayList

class FoodCheck : AppCompatActivity() {

    val calendar = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_check)
        val intent = getIntent()
        var cnt = 0
        var foodname = arrayListOf<String>()
        var kcalstr = arrayListOf<Int>()

        if(intent.hasExtra("food"))
        {
            foodname = intent.getStringArrayListExtra("food")
        }
        if(intent.hasExtra("Kcal")){
            kcaltext.text = intent.getIntExtra("Kcal",0).toString()
        }
        if(intent.hasExtra("kcaltxt")){
            kcalstr = intent.getIntegerArrayListExtra("kcaltxt")
        }


        var foodlist = ArrayList<Data>()
        while(cnt < foodname.size){
            val data = Data(foodname[cnt], kcalstr[cnt])

            foodlist.add(data)
            cnt++
        }
        val foodAdapter = FoodAdapter(this, foodlist)
        listView2.adapter = foodAdapter

        button.setOnClickListener {
            finish()
        }

    }
}

class Data(var food : String, var cal : Int)

class FoodAdapter(val context : Context, val foodlist : ArrayList<Data>) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.item_food, null)

        val foodname = view.findViewById<TextView>(R.id.text1)
        val kcaltxt = view.findViewById<TextView>(R.id.text2)
        val data = foodlist[position]
        foodname.text = data.food
        kcaltxt.text = data.cal.toString()
        return view
    }

    override fun getCount(): Int {
        return foodlist.size
    }

    override fun getItem(position: Int): Any {
        return foodlist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}
