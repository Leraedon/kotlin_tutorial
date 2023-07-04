package com.example.androidlab

open class Test13 {
    open var someData = 10
    open fun someFun() {
        println("i am superFun : $someData")
    }
}

class Sub: Test13() {
    override var someData = 20
    override fun someFun() {
        println("i am sub class function : $someData")
    }
}
fun main() {
    val obj = Sub()
    obj.someFun()
}