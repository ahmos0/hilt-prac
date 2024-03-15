package com.github.ahmos0.apps.hiltprac

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.github.ahmos0.apps.hiltprac.domain.repository.NotHiltRepository
import com.github.ahmos0.apps.hiltprac.ui.NotHiltViewModel
import com.github.ahmos0.apps.hiltprac.ui.NotHiltViewModelFactory
import com.github.ahmos0.apps.hiltprac.ui.UseHiltViewModel
import com.github.ahmos0.apps.hiltprac.ui.theme.HiltPracTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val factory = NotHiltViewModelFactory(NotHiltRepository())
        val notHiltViewModel = ViewModelProvider(this, factory)[NotHiltViewModel::class.java]
        val hiltViewModel = ViewModelProvider(this)[UseHiltViewModel::class.java]

        setContent {
            HiltPracTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SampleScreen(notHiltViewModel, hiltViewModel)
                }
            }
        }
    }
}

@Composable
fun SampleScreen(notHiltViewModel: NotHiltViewModel,hiltViewModel: UseHiltViewModel ) {
    Column {
        Text(text = notHiltViewModel.data)
        Text(text = hiltViewModel.data)
    }
}
