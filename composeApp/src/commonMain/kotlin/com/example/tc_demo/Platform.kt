package com.example.tc_demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform