package com.example.log

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.god.log.HiLog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun printLog(view: View) = HiLog.e("我是过来测试的")
}