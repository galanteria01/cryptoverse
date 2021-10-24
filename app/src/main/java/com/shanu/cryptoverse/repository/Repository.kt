package com.shanu.cryptoverse.repository

import com.shanu.cryptoverse.api.RetrofitInstance
import com.shanu.cryptoverse.model.MarketRes

class Repository {
    suspend fun getMarket(): MarketRes {
        return RetrofitInstance.api.getMarket()
    }
}