package com.example.androidlab

class Test11(val name: String, val count: Int) {

    fun someFun() {
        println("name : $name, count : $count")
    }
}

fun main() {
    val user = Test11("kkang", 10)
    user.someFun()
}