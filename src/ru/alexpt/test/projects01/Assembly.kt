package ru.alexpt.test.projects01

import java.util.*

fun main(args: Array<String>) {
//    wer()
    decClass()
}

fun wer(){
    val k = 0
    enru(k)

    val `in` = Scanner(System.`in`)
    println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()

    val textkey1 = textkey.toList()
    println(textkey1)

    val i = 0
    val j = 0
    addkey(textkey1, i, j, k)
    println("-----------------------------------")
}

fun decClass(){
    val `in` = Scanner(System.`in`)
    println("Введите значение 'x' и 'y':")
    val x1 = `in`.nextInt()
    val y1 = `in`.nextInt()

    val tz: Dec = Dec()
    tz.sum(x = x1, y = y1)

    val ty: Dec = Dec()
    ty.sum(x = y1, y = y1)

    val tx: Dec = Dec()
    tx.sum(x = x1, y = x1)

    val tpow: Dec = Dec()
    tpow.pow(z = x1)
}