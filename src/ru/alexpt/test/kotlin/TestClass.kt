package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {

    val `in` = Scanner(System.`in`)

    val tom: Person = Person()
    val alice: Person = Person()

    val bob: Person = Person()      // создаем объект
    println(bob.name)               // Tom
    println(bob.age)                // 18

    bob.name = "Bob"
    bob.age = 25

    println(bob.name)               // Bob
    println(bob.age)                // 25

    println(tom.name)
    println(tom.age)

    tom.name = "Maxim"
    tom.age = 25

    println(tom.name)
    println(tom.age)

    println(bob.info)
    println(tom.info)
    println(alice.info)
    println()

    println("Введите имя и возраст:")
    tom.name = `in`.next()
    tom.age = `in`.nextInt()
    println("Введенное имя: " + tom.name + ", возраст: " + tom.age + " лет.")
    println(tom.info)

    bob.sayHello()
    bob.go("Classic")
    alice.sayHello()
    alice.go("Vladivostok")

    val foma = Person()
    foma.sayHello()
}

class Person{
    var name: String = "Tom"
    var age: Int = 18

    // Геттеры и сеттеры. Для каждого свойства можно определять геттер и сеттер.
    // Геттер. Геттер управляет получением значения свойства и определяется с помощью слова get:
    val info: String
        get() = "Name: $name  Age: $age"

    fun sayHello(){
        println("Hello")
    }
    fun go(location: String){
        println("$name goes to $location")
    }
}