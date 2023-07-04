package com.example.androidlab

fun main() {
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
            map size : ${map.size}
            map data : ${map.get("one")}, ${map.get("two")}
        """.trimIndent()
    )
}

class Test5 {
}