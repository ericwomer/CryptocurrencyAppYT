package com.plcoding.cryptocurrencyappyt.domain.models

import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMembers

data class CoinDetails(
    val coinID: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMembers>,
)
