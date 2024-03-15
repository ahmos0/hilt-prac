package com.github.ahmos0.apps.hiltprac.ui

import androidx.lifecycle.ViewModel
import com.github.ahmos0.apps.hiltprac.domain.repository.HiltRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UseHiltViewModel  @Inject constructor(private val repository: HiltRepository): ViewModel(){
    val data: String = repository.getData()
}
