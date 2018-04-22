package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("Введите с клавиатуры два 3-значных числа: ")
    val x = `in`.nextInt()
    val y = `in`.nextInt()
    delmod_01(x, y)         // меняем средние цифры значений x и y
}

fun delmod_01(x: Int, y: Int){
    val x1 = x % 10; val x2 = (x - x1) % 100; val x3 = x - x1 - x2
    val y1 = y % 10; val y2 = (y - y1) % 100; val y3 = y - y1 - y2
//    println("x = $x, x1 = $x1, x2 = $x2, x3 = $x3")
//    println("y = $y, y1 = $y1, y2 = $y2, y3 = $y3")
    val x = x1 + y2 + x3; val y = y1 + x2 + y3
    println("1. Меняем средние цифры значений x и y: $x, $y")
}