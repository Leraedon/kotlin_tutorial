package com.example.androidlab

val data19a: String = "hello"
val data19b: String? = null

fun main() {
    val length = if(data19b == null) {
        0
    } else {
        data19b.length
    }

    println("data length : ${data19b?.length ?: 0}")
}