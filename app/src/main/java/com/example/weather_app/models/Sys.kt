package com.example.weather_app.models

data class Sys (
    val type: Int,
    val message: Double,
    val country: String,
    val sunrise: Int,
    val sunset: Int
) : java.io.Serializable