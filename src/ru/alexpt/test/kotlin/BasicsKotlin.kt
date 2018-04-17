package ru.alexpt.test.kotlin

import jdk.nashorn.internal.objects.Global.print

// main() — точка входа в приложение
fun main(args: Array<String>) {
    // мы можем сразу присвоить переменной начальное значение при ее объявлении. Такой прием называется инициализацией:
    val a: Int = 23
    println("a: " + a)

    val b: Int = 54
    println("b: " + b)

    val c1: Int
    c1 = a + b
    println("c1 = a + b = " + c1)

    val c2 = b - a
    println("c2 = b - a = " + c2)

    val c3 = (c1 / c2).toDouble()
    println("c3 = c1 / c2 = " + c3)
}