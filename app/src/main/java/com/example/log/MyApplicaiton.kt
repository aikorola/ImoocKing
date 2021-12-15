package com.example.log

import android.app.Application
import com.god.log.HiLogConfig
import com.god.log.HiLogManager

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object : HiLogConfig() {
            override fun getGlobalTag() = "chan"

            override fun enable() = true
        })
    }
}