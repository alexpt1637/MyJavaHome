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
    vvod_07(a)
    vvod_08(x)
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
    val d = (a.toDouble() + b.toDouble() + c.toDouble()) / 3
    println("4. Среднее арифметическое значение трёх вещественных чисел равно: $d")
}

fun vvod_05 (a: Int, b: Int){
    val x = -b.toDouble() / a.toDouble()
    println("5. Корень линейного уравнения ax + b = 0 равен: $x")
}

fun vvod_06 (a: Int, b: Int){
    val c = Math.pow(a.toDouble(), b.toDouble())
    println("6. Число (a = $a) в степени $b равно: $c")
}

fun vvod_07 (a: Int){
    val Pi = 3.14; val R = a.toDouble()
    val S = Pi * R * R; val s = S - S % 0.01
    val L = 2 * Pi * R; val l = L - L % 0.01
    println("7. При R = $a см площадь круга равна: $s кв.см, длина окружности: $l см")
}

fun vvod_08 (x: Int){
    val USD = 61.41; val EUR = 75.47
    val U = x.toDouble() / USD; val u = U - U % 0.01
    val E = x.toDouble() / EUR; val e = E - E % 0.01
    println("8. Сумма в рублях ($x руб.) равна $u долларам или $e евро")
}