package com.example.todo_list

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform