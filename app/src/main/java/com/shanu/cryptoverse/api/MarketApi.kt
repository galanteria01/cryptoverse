package com.shanu.cryptoverse.api

import com.shanu.cryptoverse.model.MarketRes
import retrofit2.http.GET

interface MarketApi {
    @GET("stats")
    suspend fun getMarket(): MarketRes
}