package com.example.myapplication

fun main() {
    val x = 1

    when(x) {
        1 -> print("1입니다")
        2 -> print("2입니다")
        3,4,5 -> print("3이나 4나 5입니다")
    }
}
