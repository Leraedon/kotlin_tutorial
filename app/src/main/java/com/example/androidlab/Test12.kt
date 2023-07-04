package com.example.androidlab

class Test12 {
    constructor(name: String) {
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Int) {
        println("constructor(name: String, count: Int) call...")
    }
}

fun main() {
    val user1 = Test12("kkang")
    val user2 = Test12("kkang", 10)
}