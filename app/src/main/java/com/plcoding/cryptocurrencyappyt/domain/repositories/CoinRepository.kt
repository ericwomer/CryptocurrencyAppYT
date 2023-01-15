package com.plcoding.cryptocurrencyappyt.domain.repositories

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailsDTO

interface CoinRepository {
    suspend fun getCoins(): List<CoinDTO>
    suspend fun getCoinById(coinID: String): CoinDetailsDTO
}
