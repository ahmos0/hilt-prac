package com.github.ahmos0.apps.hiltprac.domain.repository

import javax.inject.Inject

class HiltRepository @Inject constructor() {
    fun getData(): String = "This is Hilt Repository!"
}
