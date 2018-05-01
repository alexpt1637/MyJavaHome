package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("Введите значение x:")
    var x = `in`.nextDouble()
    x = asd(x); val y = x.toInt()
    sdf(y)
    fgh()
}

fun asd(x: Double) : Double = Math.pow(x, 3.0)

fun sdf(y: Int){
    println("y = $y")
    val z = (Math.random() * 1000).toInt()
    println("z = $z")
    val u = Math.max(y, z)
    println("max = $u")
    val u1 = u.toChar()
    println("u1 = $u1")
}

fun fgh(){
    var j = 32768; var j1 = j.toChar(); println("32768 = $j1")
    j = 32769; val j0 = j.toChar(); println("32769 = $j0")
    j = 29770; j1 = j.toChar(); println("29770 = $j1")
    j = 31065; val j2 = j.toChar(); println("31065 = $j2")
    j = 30165; val j3 = j.toChar(); println("30165 = $j3")
    j = 27165; val j4 = j.toChar(); println("30165 = $j4")

    val china: Array<Char> = arrayOf(j0, j1, j2, j3, j4)

    for (china in china){
        println(china)
    }

    val ch = china.toList()
    println(ch)

    val ch1 = ch.toString()
    println(ch1)
}