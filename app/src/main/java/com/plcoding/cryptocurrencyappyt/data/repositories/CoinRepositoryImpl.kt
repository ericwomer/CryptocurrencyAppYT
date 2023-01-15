package com.plcoding.cryptocurrencyappyt.data.repositories

import com.plcoding.cryptocurrencyappyt.data.remote.CoinPaprikaApi
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDTO
import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDetailsDTO
import com.plcoding.cryptocurrencyappyt.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi,
) : CoinRepository {
    override suspend fun getCoins(): List<CoinDTO> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinID: String): CoinDetailsDTO {
        return api.getCoinById(coinID = coinID)
    }
}
