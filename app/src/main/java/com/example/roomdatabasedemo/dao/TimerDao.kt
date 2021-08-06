package com.example.roomdatabasedemo.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.worktime.roomModel.TimerModel

@Dao
interface TimerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
        fun insert(timerModel:TimerModel):Void

//    @Delete
//    suspend fun delete(timerModel: TimerModel)
//    @Update
//    suspend fun update(timerModel: TimerModel)
//
//    @Query("DELETE from work_time_table")
//     fun deleteAllWork():LiveData<List<TimerModel>>
//
    @Query("SELECT * from work_time_table")
    fun getAllWork():LiveData<List<TimerModel>>
}