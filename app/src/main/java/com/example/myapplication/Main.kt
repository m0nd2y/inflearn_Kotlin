package com.example.myapplication

fun main() {
    // Person person = new Person();

    var person = Person("홍길동")
    person.name = "한석봉"
    print(person.name)
}

class Person(var name: String) {
    init {
        print(name)
    }
}