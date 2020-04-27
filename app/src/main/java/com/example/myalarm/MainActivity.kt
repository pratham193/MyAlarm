package com.example.myalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setalrm.setOnClickListener() {
            val sec: Long = sec.text.toString().toLong()

            Log.d("set", "alarm set")

            val i = Intent(this, Myservice::class.java)
            i.putExtra("sec", sec)


            startService(i)
        }


    }
}
