package com.example.androidlab

val some: (Int, Int) -> Int = {no1: Int, no2: Int -> no1 + no2}
typealias MyInt = Int
typealias MyFunType = (Int, Int) -> Boolean

fun main() {
    val data1: Int = 10
    val data2: MyInt = 10

    val someFun: MyFunType = {no1, no2 -> no1 > no2}
    println(someFun(10, 20))
    println(someFun(20, 10))
}