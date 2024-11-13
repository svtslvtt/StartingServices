package com.example.startingsevices

import android.app.IntentService
import android.content.Intent
import android.content.Context
import android.os.IBinder
import android.util.Log


class TimerService1 : IntentService("TimerService1") {

    override fun onHandleIntent(intent: Intent?) {
        val time = intent?.getIntExtra("time", 0) ?: 0
        runTimer(time)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }

    private fun runTimer(seconds: Int) {
        Thread {
            for (i in seconds downTo 0) {
                Log.d("Timer", "seconds remaining: $i")
                Thread.sleep(1000)
            }
            Log.d("Timer", "Timer finished")
        }.start()
    }
}