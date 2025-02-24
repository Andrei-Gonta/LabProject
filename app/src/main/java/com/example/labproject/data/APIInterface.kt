package com.example.labproject.data

import com.mkrdeveloper.weatherappexample.data.forecastModels.Forecast
import com.mkrdeveloper.weatherappexample.data.models.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface APIInterface {
    @GET("weather?")
    suspend fun getCurrentWeather(
        @Query("q") city : String,
        @Query("units") units : String,
        @Query("appid") apiKey : String,
    ): Response<CurrentWeather>


    @GET("forecast?")
    suspend fun getForecast(
        @Query ("q") city: String,
        @Query("units") units : String,
        @Query("appid") apiKey : String,
    ) :Response<Forecast>


}