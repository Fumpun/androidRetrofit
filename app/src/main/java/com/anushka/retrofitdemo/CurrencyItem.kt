package com.currate.data.network

data class CurrencyItem(
    val base: String,
    val date: String,
    val currencyItemRates: CurrencyItemRates
)