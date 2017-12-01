package ru.alexpt.test.kotlin

import jdk.nashorn.internal.objects.Global.print

// main() — точка входа в приложение
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

    // Реализуем функцию multiply() умножения двух чисел. Название любой функции предваряется ключевым словом fun
    fun multiply(a : Int, b : Int) : Int {
        return a * b
    }

    val c = multiply(a, b)
    println("Результат умножения двух чисел: " + c)
    println()

    // Создание массива при помощи встроенного фабричного метода arrayOf() с перечислением элементов массива
    val array : Array<Int> = arrayOf(1, 2, 5, 7)
    println("третий элемент массива: " + array[2])   // вывод третьего элемента массива

    // методы get() и set() вызываются при обращении к элементам массива через []
    // меняем второй (массивы нумеруются с нуля) элемент массива на значение 4
    array[1] = 4
    println("второй элемент массива (2) заменен на " + array[1])   // вывод второго элемента массива
}