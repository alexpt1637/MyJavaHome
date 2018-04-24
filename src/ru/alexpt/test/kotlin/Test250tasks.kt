package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val a = 21.0; val b = 12.0; val h = 17.0
    /*task_11(); task_12(); task_13(); task_14(); task_15(); task_16(); task_17()
    task_18(a, b); task_19(a, h); task_20(a, b, h); task_21(b); task_22(b, h)*/
    task_23(a, b, h); task_24(b); task_26(a, b, h); task_27(b, h)
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

fun task_15(){
    var x = 5
    val d = 3
    print("15) Число х = $x (при d = 3)")
    x += d * x
    println(", увеличенное на dx равно: $x")
}

fun task_16(){
    // 1 фунт = 405,9 г = 0,4059 кг
    val m = 1.2     // 1,2 фунта
    val f = 0.4059
    val v = m / f; val v1 = v - v % 0.001
    println("16) Вес $m фунта в килограммах равен: $v1 кг")
}

fun task_17(){
    // 1 верста = 1066,8 м = 1,0668 км
    val s = 100     // 100 км
    val v = 1.0668
    val S = s * v; val s1 = S - S % 0.01
    println("17) В $s км $s1 верст")
}

fun task_18(a: Double, b: Double){
    val S = a * b
    println("18) При a = $a, b = $b площадь прямоугольника равна $S см")
}

fun task_19(a: Double, h: Double){
    val S = a * h / 2
    println("19) При a = $a, h = $h площадь треугольника равна $S см")
}

fun task_20(a: Double, b: Double, h: Double){
    val S = (a + b) / 2 * h
    println("20) При a = $a, b = $b, h = $h площадь трапеции равна $S см")
}

fun task_21(b: Double){
    val R = b
    val s = Math.PI * Math.pow(R, 2.0)
    val S = s - s % 0.1
    println("21) При R = $b площадь круга равна: $S см")
}

fun task_22(b: Double, h: Double){
    val R = b
    val v = Math.PI * Math.pow(R, 2.0) * h; val V = v.toInt()
    val s = 2 * Math.PI * R * (h + R); val S = s.toInt()
    println("22) При R = $b, h = $h объем цилиндра равен: $V куб.см, площадь поверхности: $S кв.см")
}

fun task_23(a: Double, b: Double, h: Double){
    val v = a * b * h; val V = v.toInt()
    println("23) Объем параллелепипеда равен: $V куб.см")
}

fun task_24(b: Double){
    val R = b
    val v = 3.0 / 4.0 * Math.PI * Math.pow(R, 3.0); val V = v.toInt()
    val s = 4.0 * Math.PI * Math.pow(R, 2.0); val S = s.toInt()
    println("24) При R = $b объем шара равен: $V куб.см, площадь поверхности шара: $S кв.см")
}

fun task_26(a: Double, b: Double, h: Double){
    val R1 = a; val R2 = b
    val v = Math.PI * h * (Math.pow(R1, 2.0) - Math.pow(R2, 2.0)); val V = v.toInt()
    println("26) Объем полого цилиндра равен $V куб.см")
}

fun task_27(b: Double, h: Double){
    val R = b
    val v = 1.0 / 3.0 * Math.PI * Math.pow(R, 2.0) * h; val V = v.toInt()
    println("27) При R = $b и h = $h см объем конуса равен $V куб.см")
}