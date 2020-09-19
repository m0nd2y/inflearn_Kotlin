package com.example.myapplication

fun main() {
    val items = listOf(1, 2, 3, 4, 5) //불변
    val items2 = arrayListOf(1, 2, 3, 4, 5) //변경 가능

    items2.add(6)
    items2.remove(1)

    items2[0] = 10


    print(items2)

}
