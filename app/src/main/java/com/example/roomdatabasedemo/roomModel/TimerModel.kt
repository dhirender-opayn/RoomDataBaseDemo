package com.example.worktime.roomModel

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "work_time_table")
data class TimerModel(
    @ColumnInfo(name = "work_title")
        val work_title:String,
    @ColumnInfo(name = "taken_hours")
        val taken_hours:Long,
    @ColumnInfo(name = "work_date")
        val work_date:String,
    @ColumnInfo(name = "total_hours")
        val total_hours:Long,
    @ColumnInfo(name = "id")
       @PrimaryKey(autoGenerate = true) val id:Int
       )
