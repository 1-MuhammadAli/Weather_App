package com.example.weather_app.models

data class Weather (
    val all: Int,
    val main: String,
    val description: String,
    val icon: String
) : java.io.Serializable