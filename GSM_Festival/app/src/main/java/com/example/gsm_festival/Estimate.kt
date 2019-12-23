package com.example.gsm_festival

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Estimate : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estimate)

        val client = BluetoothSerialClient.getInstance()
        if (client == null)
        {
            // 블루투스를 사용할 수 없는 장비일 경우 null.
            Toast.makeText(getApplicationContext(), "블루투스를 사용할 수 없는 기기입니다.", Toast.LENGTH_LONG).show()
        }
        if (!client.isEnabled())
        {
            client.enableBluetooth(this@Estimate, object:BluetoothSerialClient.OnBluetoothEnabledListener {
                      override  fun onBluetoothEnabled(success:Boolean) {

                        }
                    })
        }

    }
}
