package com.shanu.cryptoverse.api

import com.shanu.cryptoverse.utils.Constants
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val okHttpClient = OkHttpClient.Builder().apply {
    addInterceptor(
        Interceptor { chain ->
            val builder = chain.request().newBuilder()
            builder.header("x-rapidapi-host", "coinranking1.p.rapidapi.com")
            builder.header("x-rapidapi-key", "557fdd1eccmsh4aef4e183aaf05cp12070ejsn6e93e8960041")
            return@Interceptor chain.proceed(builder.build())

        }
    )
}.build()

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: MarketApi by lazy {
        retrofit.create(MarketApi::class.java)
    }
}