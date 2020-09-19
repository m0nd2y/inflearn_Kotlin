package com.example.myapplication

fun main() {
    var x = 10; //int 형 변수
    var str = "Hello"
    var isMarried = true

    print("$str World")
    print(myMethod(10, 20))
}

fun myMethod(a: Int, b: Int): Int {
    return a + b
}