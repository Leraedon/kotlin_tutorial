package com.example.androidlab

fun main() {
    var data = arrayOf<Int>(10, 20, 30)
    for (i in data.indices) {
        print(data[i])
        if(i != data.size -1) print(",")
    }
    for ((index, value) in data.withIndex()) {
        print(value)
        if (index !== data.size -1) print(",")
    }
}