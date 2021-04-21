package com.henrique.desafio_android.service.repository.remote

import com.henrique.desafio_android.service.model.balance.BalanceResponse
import com.henrique.desafio_android.service.model.movimentation.MovimentationResponse
import com.henrique.desafio_android.service.model.movimentation.MovimentationResponseList
import retrofit2.http.GET
import retrofit2.http.Path

interface API {

    @GET("myBalance")
    suspend fun getBalance(): BalanceResponse

    @GET("myStatement/{limit}/{offset}")
    suspend fun getMovimentation(
        @Path("limit") limit: String,
        @Path("offset") offset: String
    ): MovimentationResponseList

    @GET("myStatement/detail/{id}")
    suspend fun getMovimentationDetail(
        @Path("id") id: String
    ): MovimentationResponse

}