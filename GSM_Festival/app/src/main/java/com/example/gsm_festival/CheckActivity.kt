package com.example.gsm_festival


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Toast
import app.akexorcist.bluetotohspp.library.BluetoothSPP
import app.akexorcist.bluetotohspp.library.BluetoothState

import app.akexorcist.bluetotohspp.library.DeviceList
import kotlinx.android.synthetic.main.activity_check.*

class CheckActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check)

        val bt = BluetoothSPP(this)
        if(!bt.isBluetoothAvailable){
            Toast.makeText(getApplicationContext(), "블루투스 연결이 불가능합니다",Toast.LENGTH_SHORT).show()
            finish()
        }
        bt.setOnDataReceivedListener(object:BluetoothSPP.OnDataReceivedListener{
            override fun onDataReceived(data:ByteArray, message:String) {
                weighttext.text = message
            }
        })
        bt.setBluetoothConnectionListener(object:BluetoothSPP.BluetoothConnectionListener { //연결됐을 때
            override fun onDeviceConnected(name:String, address:String) {
                Toast.makeText(getApplicationContext(), "Connected to " + name + "\n" +
                        "" + address, Toast.LENGTH_SHORT).show()
            }
            override fun onDeviceDisconnected() { //연결해제
                Toast.makeText(getApplicationContext(), "Connection lost", Toast.LENGTH_SHORT).show()
            }
            override fun onDeviceConnectionFailed() { //연결실패
                Toast.makeText(getApplicationContext(), "Unable to connect", Toast.LENGTH_SHORT).show()
            }
        })
        weightbutton.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                if(bt.serviceState===BluetoothState.STATE_CONNECTED)
                {
                    bt.send("1",true)
                }
                else{
                    val intent = Intent(applicationContext, DeviceList::class.java)
                    startActivityForResult(intent,BluetoothState.REQUEST_CONNECT_DEVICE)
                }
            }
        })


    }
}
