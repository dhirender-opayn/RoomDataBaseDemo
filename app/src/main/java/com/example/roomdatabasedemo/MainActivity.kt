package com.example.roomdatabasedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import com.example.worktime.DataBase.WorkTimeDataBase
import com.example.worktime.roomModel.TimerModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var workTimeDataBase: WorkTimeDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         workTimeDataBase = WorkTimeDataBase.getDataWork(this)
        GlobalScope.launch {
            workTimeDataBase.timerDao().insert(TimerModel("Work",25,"20-05-1996",265,1))
        }
    }
    fun BtnClick(view:View){
        workTimeDataBase.timerDao().getAllWork().observe(this, Observer {
            Log.e("Try","DDDDDDDDDDDDDD")
        })
    }
}