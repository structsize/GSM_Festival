package com.example.gsm_festival

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.realm.Realm
import io.realm.Sort
import io.realm.kotlin.where
import kotlinx.android.synthetic.main.activity_calendar.*
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class CalendarActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        Realm.getDefaultInstance()
        val realm = Realm.getDefaultInstance()


        val realmResult = realm.where<Todo>()
                .findAll()
                .sort("date", Sort.DESCENDING)
        val adapter = TodoListAdapter(realmResult)
        listView.adapter = adapter

        realmResult.addChangeListener { _ -> adapter.notifyDataSetChanged() }

        listView.setOnItemClickListener { parent, view, position, id ->
            startActivity<EditActivity>("id" to id)
        }

        fab.setOnClickListener{
            startActivity<EditActivity>()
        }

        fab.setOnClickListener {
            startActivity<EditActivity>()

        }


    }

}
