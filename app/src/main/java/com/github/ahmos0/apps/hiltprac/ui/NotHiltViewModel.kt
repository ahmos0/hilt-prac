package com.github.ahmos0.apps.hiltprac.ui

import androidx.lifecycle.ViewModel
import com.github.ahmos0.apps.hiltprac.domain.repository.NotHiltRepository

class NotHiltViewModel(private val repository: NotHiltRepository): ViewModel(){
    val data: String = repository.getData()
}
