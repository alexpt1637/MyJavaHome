package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    task_11()
    task_12()
    task_13()
    task_14()
}

fun task_11(){
    var n = 14
    n = ++n
    println("11) n = 14, увеличим значение n на единицу: $n")
}

fun task_12(){
    var n = 25
    n -= 2
    println("12) n = 25, уменьшим значение n на 2: $n")
}

fun task_13(){
    val a = 25; val b = 30
    val c: Double = (a.toDouble() + b.toDouble()) / 2
    val d = c.toInt()
    println("13) Среднее арифметическое а = $a и в = $b равно: $c; округленное значение равно: $d")
}

fun task_14(){
    val x = 5
    val y = -2.7 * Math.pow(x.toDouble(), 3.0) + 0.23 * Math.pow(x.toDouble(), 2.0) - 1.4
    print("14) При х = $x значение функции равно: $y, ")
    val z = Math.pow(y, 2.0)
    val z1 = z - z % 0.01
    println("полученное значение в квадрате равно: $z1")
}