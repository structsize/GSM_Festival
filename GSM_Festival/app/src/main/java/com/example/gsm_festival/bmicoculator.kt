package com.example.gsm_festival

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_bmicoculator.*


class bmicoculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmicoculator)


        writebtn.setOnClickListener{
            val intent = Intent(this, InputActivity::class.java)
            startActivityForResult(intent,1)
        }

        check.setOnClickListener{
            val intent = Intent(this, Estimate::class.java)
            startActivityForResult(intent,1)
        }

        nextbtn.setOnClickListener{
            var gender : String? = ""
            var name: String? = nametext.text.toString()
            var age : String? = ageText.text.toString()

            if(nametext.text.isEmpty() || ageText.text.isEmpty() || heightinput.text.isEmpty() || weighttag.text.isEmpty() || (manbutton.isChecked == false && womanbutton.isChecked==false)){
                Toast.makeText(this,"내용이 비어있습니다.", Toast.LENGTH_SHORT).show()
            }
            else {

                if (manbutton.isChecked) {
                    gender = "남자"
                } else if (womanbutton.isChecked) {
                    gender = "여자"
                }
                var height = heightinput.text.toString().toInt()
                var weight = weighttag.text.toString().toInt()
                var user = User(name, age, gender, height,weight)

                val intent = Intent(this, AppMain::class.java)
                intent.putExtra("user",user)
                startActivity(intent)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode== Activity.RESULT_OK){
            weighttag.visibility = View.VISIBLE
            weighttag.text = data!!.getStringExtra("weightin")
        }
    }
}


class User(var name: String?, var age: String?, var gender: String?, var height: Int, var weight: Int) : Parcelable{
    constructor(parcel: Parcel) : this(
    parcel.readString(),
    parcel.readString(),
    parcel.readString(),
    parcel.readInt(),
    parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(name)
        parcel.writeString(age)
        parcel.writeString(gender)
        parcel.writeInt(height)
        parcel.writeInt(weight)

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}