package com.example.myapplication

fun main() {
    val str = "Hello"

    print(str.myLength())
}

fun String.myLength():Int {
    return this.length
}