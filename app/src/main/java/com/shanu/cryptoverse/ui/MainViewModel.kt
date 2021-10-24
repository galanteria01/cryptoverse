package com.shanu.cryptoverse.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shanu.cryptoverse.model.MarketRes
import com.shanu.cryptoverse.repository.Repository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository):ViewModel() {

    var marketData: MarketRes by mutableStateOf(MarketRes(null, null))

    fun getMarket() {
        viewModelScope.launch {
            val response = repository.getMarket()
            marketData = response
        }
    }

}