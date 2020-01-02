package com.example.gsm_festival

import android.content.Context
import android.text.format.DateFormat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView


class WeightAdapter(val context : Context, var weightlist : ArrayList<Weight>) : BaseAdapter(){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view : View = LayoutInflater.from(context).inflate(R.layout.item_weight, null)

        val weighttxt = view.findViewById<TextView>(R.id.text2)
        val timetxt = view.findViewById<TextView>(R.id.text1)
        val data = weightlist[position]

        weighttxt.text = data.weight.toString() + " kg"
        timetxt.text = DateFormat.format("yyyy/MM/dd   HH:mm:ss", data.time)
        return view
    }

    override fun getCount(): Int {
        return weightlist.size
    }

    override fun getItem(position: Int): Any {
        return weightlist[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}

class Weight(var weight : Int, var time : Long)