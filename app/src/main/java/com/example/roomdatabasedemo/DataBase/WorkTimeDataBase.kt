package com.example.worktime.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.roomdatabasedemo.dao.TimerDao
import com.example.worktime.roomModel.TimerModel

@Database(entities = [TimerModel::class], version = 1)
abstract class  WorkTimeDataBase :RoomDatabase() {
    abstract fun timerDao(): TimerDao
    companion object{
        private var INSTANCE: WorkTimeDataBase? = null
        fun getDataWork(context: Context): WorkTimeDataBase {
            if (INSTANCE != null){
                return INSTANCE !!
            }
            synchronized(this){
                INSTANCE = Room.databaseBuilder(context, WorkTimeDataBase::class.java,"workTimeDatabase")
                    .fallbackToDestructiveMigration()
                    .build()
                return INSTANCE!!
            }
        }
    }
}