package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)
        endbtn.setOnClickListener{
            if(Inputtext.text.isEmpty()) {
                Toast.makeText(this,"몸무게를 적어주세요!", Toast.LENGTH_SHORT).show()
            }else {
                val intent = Intent()
                intent.putExtra("weightin", Inputtext.text.toString())
                setResult(Activity.RESULT_OK, intent)
                finish()
            }
        }
    }
}
