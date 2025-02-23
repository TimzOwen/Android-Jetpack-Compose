package com.timzowen.mvvmr3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import com.timzowen.mvvmr3.agent.view.AgentView
import com.timzowen.mvvmr3.agent.viewmodel.AgentViewModel
import com.timzowen.mvvmr3.router.RouterHome
import com.timzowen.mvvmr3.router.RouterViewModel
import com.timzowen.mvvmr3.shop.HomeShop
import com.timzowen.mvvmr3.shop.ShopViewModel
import com.timzowen.mvvmr3.ui.theme.MvvMR3Theme
import com.timzowen.mvvmr3.view.StudentHome
import com.timzowen.mvvmr3.viewmodel.StudentViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        val viewModel = ViewModelProvider(this)[StudentViewModel::class.java]
//        val agentViewModel = ViewModelProvider(this)[AgentViewModel::class.java]
//        val routerViewModel = ViewModelProvider(this)[RouterViewModel::class.java]
        val shopViewModel = ViewModelProvider(this)[ShopViewModel::class.java]
        setContent {
            MvvMR3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                  StudentHome(modifier = Modifier.padding(innerPadding) , viewModel)
//                    AgentView(modifier = Modifier.padding(innerPadding), agentViewModel)
//                    RouterHome(modifier = Modifier.padding(innerPadding),routerViewModel)
                    HomeShop(modifier = Modifier.padding(innerPadding), shopViewModel)
                }
            }
        }
    }
}

