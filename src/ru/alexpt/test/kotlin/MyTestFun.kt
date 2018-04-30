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
    j = 32769; j1 = j.toChar(); println("32769 = $j1")
    j = 32770; j1 = j.toChar(); println("32770 = $j1")
    j = 31065; j1 = j.toChar(); println("31065 = $j1")
    j = 32165; j1 = j.toChar(); println("32165 = $j1")

}