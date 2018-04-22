package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("Введите с клавиатуры двузначное натуральное число и нажмите Enter: ")
    val x = `in`.nextInt()
    vvod_01(x)
    vvod_02(x)
    vvod_03(x)

    println("Введите с клавиатуры последовательно три числа и нажмите Enter: ")
    val a = `in`.nextInt()
    val b = `in`.nextInt()
    val c = `in`.nextInt()
    vvod_04(a, b, c)
    vvod_05(a, b)
    vvod_06(a, b)
}

fun vvod_01 (x: Int) {
    val y = x % 10
    println("1. Младший разряд введенного натурального числа равен: $y")
}

fun vvod_02 (x: Int){
    val j = x / 10
    println("2. Количество десятков в введенном числе равно: $j")
}

fun vvod_03 (x: Int){
    val m = x / 2
    val n = m * 2 + 2
    println("3. Следующее за введеным четное число равно: $n")
}

fun vvod_04 (a: Int, b: Int, c: Int){
    val d = (a + b + c) / 3
    println("4. Среднее арифметическое значение трёх вещественных чисел равно: $d")
}

fun vvod_05 (a: Int, b: Int){
    val x = -b.toDouble() / a.toDouble()
    println("5. Корень линейного уравнения ax + b = 0 равен: $x")
}

fun vvod_06 (a: Int, b: Int){
    val c = Math.pow(a.toDouble(), b.toDouble())
    println("6. Число 'a' в указанной степени равно: $c")
}