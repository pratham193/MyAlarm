package com.example.myalarm

import android.app.Service
import android.content.Intent
import android.os.IBinder

class Myservice(): Service() {

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {


        val sec:Long= intent?.getLongExtra("sec",1)!! *1000 + System.currentTimeMillis()
        var c=true
        while (c) {
            if (System.currentTimeMillis() == sec) {

                c = false
                val intent= Intent(this,Alarm_on::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)

            }
        }
        return START_STICKY

    }

    override fun onDestroy() {
        super.onDestroy()



    }


}
