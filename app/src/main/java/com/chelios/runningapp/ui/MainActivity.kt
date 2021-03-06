package com.chelios.runningapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chelios.runningapp.R
import com.chelios.runningapp.db.RunDAO
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}