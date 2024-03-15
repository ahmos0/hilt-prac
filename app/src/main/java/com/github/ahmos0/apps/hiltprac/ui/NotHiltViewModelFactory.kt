package com.github.ahmos0.apps.hiltprac.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.ahmos0.apps.hiltprac.domain.repository.NotHiltRepository

class NotHiltViewModelFactory(private val repository: NotHiltRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NotHiltViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return NotHiltViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
