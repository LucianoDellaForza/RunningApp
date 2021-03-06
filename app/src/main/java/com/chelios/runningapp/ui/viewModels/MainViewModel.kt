package com.chelios.runningapp.ui.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.chelios.runningapp.repositories.MainRepository

//@ViewModelInject with Dagger Hilt for ViewModels
class MainViewModel @ViewModelInject constructor(
        val mainRepository: MainRepository
) : ViewModel() {
}