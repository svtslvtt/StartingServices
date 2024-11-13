package com.example.startingsevices

import android.app.Service
import android.content.Intent
import android.os.IBinder


const val TIMER_SERVICE_ACTION = "timerServiceAction"

class TimerService: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    fun runTimer(){
        Thread{
            for(i in )
        }.start()
    }


}