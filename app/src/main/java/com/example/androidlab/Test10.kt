package com.example.androidlab

class User2 {
    var name = "kkang"
    constructor(name: String) {
        this.name = name
    }
    fun someFun() {
        println("name : $name")
    }
    class SomeClass {}
}

fun main() {
    val user = User2("kim")
    user.someFun()
}