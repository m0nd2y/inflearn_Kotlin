package com.example.myapplication

fun main() {
    // Person person = new Person();

    var person = Person("홍길동", 20)
    print(person)
}

data class Person(
    val name: String,
    val age: Int
)