package com.shanu.cryptoverse.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.shanu.cryptoverse.ui.components.BottomNavigationBar
import com.shanu.cryptoverse.ui.components.NavigationItem
import com.shanu.cryptoverse.ui.screens.CryptoScreen
import com.shanu.cryptoverse.ui.screens.HomeScreen
import com.shanu.cryptoverse.ui.screens.NewsScreen
import com.shanu.cryptoverse.ui.theme.CryptoverseTheme

class MainActivity : ComponentActivity() {

    private val mainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            CryptoverseTheme {
                Main()
            }
        }
    }
}

@Composable
fun Main() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        NavHost(navController, startDestination = NavigationItem.Home.route ){
            composable(NavigationItem.Home.route){
                HomeScreen()
            }
            composable(NavigationItem.Cryptos.route){
                CryptoScreen()
            }
            composable(NavigationItem.News.route) {
                NewsScreen()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CryptoverseTheme {
        Main()
    }
}