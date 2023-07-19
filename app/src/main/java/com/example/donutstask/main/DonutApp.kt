package com.example.donutstask.main

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.donutstask.ui.nav.BrainNavGraph
import com.example.donutstask.ui.theme.DonutsTaskTheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BrainBurstApp() {
    DonutsTaskTheme {
        Scaffold {
            val navController = rememberNavController()
            BrainNavGraph(navController)
        }
    }

}