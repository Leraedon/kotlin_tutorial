package com.example.androidlab

fun some(data: String?): Int {
    return data!!.length
}
fun main() {
    println(some("kkang"))
    println(some(null))
}