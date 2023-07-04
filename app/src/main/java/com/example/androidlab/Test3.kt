package com.example.androidlab

fun main() {
    val data1: Array<Int> = Array(3, {0})
    val data2 = arrayOf<Int>(10, 20, 30)
    val data3 = booleanArrayOf(false, true, false)
    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30)

    println( """
        array size : ${data1.size}
        array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
    """.trimIndent())

    println( """
        array size : ${data2.size}
        array data : ${data2[0]}, ${data2[1]}, ${data2.get(2)}
    """.trimIndent())
}

class Test3 {
}