package ru.alexpt.test.projects_02

import java.util.*

fun main(args: Array<String>) {
    val k = enru()
    println("k = $k")
    addtext(k)
}

fun enru(): Int {                                   // функция возвращает значение типа Int
    val `in` = Scanner(System.`in`)
    println("Выбор языка ввода (введите 'en' или 'ru'):")
    val e: String = `in`.nextLine()
    var k = 0

    when(e){
        "en" -> k
        "ru" -> k = 1100
    }
    println("fun enru: k = $k")
    return k                                        //  возвращаемое значение
}

fun addtext(k: Int){
    println("fun addtext: k = $k")
}