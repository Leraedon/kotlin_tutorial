package com.example.androidlab

fun main() {
    var data = 10
    val result = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("data < 0")
        false
    }
    println(result)

    when(data) {
        10 -> println("data is 10")
        20 -> println("data is 20")
        else -> {
            println("ㅗ")
        }
    }
    when {
        data <= 0 -> println("data is <= 0")
        data > 100 -> println("data is > 100")
        else -> println("data is valid")
    }
}

class Test6 {
}