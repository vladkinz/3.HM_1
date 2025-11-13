package com.example.a3hm_1

import java.io.Serializable
data class SerialModel(
    val img: String,
    val name: String,
    val episode: String,
    val date: String,
    val days: Int
): Serializable
