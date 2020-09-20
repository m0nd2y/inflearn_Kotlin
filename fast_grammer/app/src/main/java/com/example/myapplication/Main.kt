package com.example.myapplication

fun main() {
    val str = "Hello"

    val item = Item("항아리")

    print(str.myLength())
    print(item)
}

fun String.myLength():Int {
    return this.length
}