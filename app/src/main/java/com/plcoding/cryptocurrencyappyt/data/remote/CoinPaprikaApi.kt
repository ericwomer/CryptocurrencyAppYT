package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailsDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface CoinPaprikaApi {
    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDTO>

    @GET("/v1/coins/{coinID}")
    suspend fun getCoinById(@Path("coinID") coinID: String): CoinDetailsDTO
}
