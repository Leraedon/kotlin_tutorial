package com.example.androidlab

import java.util.*
import kotlin.properties.Delegates

lateinit var data1: String
var data2: Int? = null
var data3: Int = 10
val data4: Int by lazy {
    println("in lazy...")
    10
}
var data5: Any = 10
val data6: Unit = Unit
var data7: Int? = 10


fun some() {
    println(10 + 20)
}

fun main() {
    data7 = null
    data5 = "ad"
    val str1 = "Hello \n World"
    val str2 = """
        Hello
        World
    """.trimIndent()
    println("str1 : $str1")
    println("str2 : $str2")

    fun sum(no: Int): Int {
        var sum = 0
        for ( i in 1..no) {
            sum += i
        }
        return sum
    }

    val name: String = "kkang"
    println("name : $name, sum : ${sum(10)}, plus: ${10 + 20}")
}

class Test {
}