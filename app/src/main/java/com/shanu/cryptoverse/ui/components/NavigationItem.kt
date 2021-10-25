package com.shanu.cryptoverse.ui.components

import com.shanu.cryptoverse.R

sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.ic_home, "Home")
    object Cryptos : NavigationItem("crypto", R.drawable.ic_crypto, "Crypto")
    object News : NavigationItem("news", R.drawable.ic_news, "News")
}