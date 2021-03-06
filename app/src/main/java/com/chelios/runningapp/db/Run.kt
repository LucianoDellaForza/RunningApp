package com.chelios.runningapp.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run (
    var image: Bitmap? = null,  //requires converter functions for Room (Converters class)
    var timestamp: Long = 0L,    //date of the run in milliseconds (saved in this format for easier sorting by date)
    var avgSpeedInKMH: Float = 0f,
    var distanceInMeters: Int = 0,
    var timeInMillis: Long = 0L, //duration of a run
    var caloriesBurned: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}