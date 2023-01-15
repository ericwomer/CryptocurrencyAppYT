package com.plcoding.cryptocurrencyappyt.presentation.coin_detail

import com.plcoding.cryptocurrencyappyt.domain.models.CoinDetails

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetails? = null,
    val error: String = "",
)
