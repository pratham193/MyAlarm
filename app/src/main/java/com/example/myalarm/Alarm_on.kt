package com.example.myalarm

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import kotlinx.android.synthetic.main.activity_alarm_on.*

class Alarm_on : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm_on)

        val mp= MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI)
        mp.start()
        off.setOnClickListener(){
            mp.stop()
            mp.release()


            val intent= Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)




        }





    }
}



