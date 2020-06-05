package com.currate.data.network

import retrofit2.Response
import retrofit2.http.GET

interface CurrencyServiceInterface {

    @GET("/latest")
    suspend fun getCurrency() : Response<CurrencyNew>
}