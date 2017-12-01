package ru.alexpt.test.kotlin

import jdk.nashorn.internal.objects.Global.print

fun main(args : Array<String>) {
    println("Hello, World!")   // Первая программа на Kotlin!
    println("Поздравляю, вы написали свою первую программу на Kotlin!")
    println()

    // цикл while:
    var x = 5
    while (x > 0) {
        println("цикл while: " + x--)
    }
    println()

    // Цикл do-while
    var y = 5
    while (y > 0) {
        println("Цикл do-while: " + y--)
    }
    println()

    // Объявление переменных, ключевым словом var помечаются переменные, а val — константы
    var a = 3
    var b = 5
    println("a = 3, b = 5")

    // Реализуем функцию mul() умножения двух чисел
    fun mul(a : Int, b : Int) : Int {
        return a * b
    }

    val c = mul(a, b)
    println("Результат умножения двух чисел: " + c)
}