package com.shanu.cryptoverse.model

data class MarketData (
    val totalCoins: Int,
    val totalMarkets: Int,
    val totalExchanges: Int,
    val totalMarketCap: Double,
    val total24hVolume: Double
        )