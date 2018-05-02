package ru.alexpt.test.projects_01.newtest_01

import java.util.*

fun main(args: Array<String>) {
    val i = 0
    val j = 0
    val k = 30000
    val `in` = Scanner(System.`in`)
    println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()
    println("Введите текст:")
    val text: String = `in`.nextLine()

    encrypt(textkey, text, i, j, k)
}

fun encrypt(textkey: String, text: String, i: Int, j: Int, k: Int) {
    val textkey1 = textkey.toList()
    val text1 = text.toList()
    val i = textkey1.size
    val j = text1.size

    val textkey2: CharArray = textkey1.toCharArray()
    val text2: CharArray = text1.toCharArray()
    val text3 = CharArray(i, {'*'})
    println()

    if(i < j){
        println("Ключ меньше набранного текста, повторите набор!")
        var n = 0
        while(n < i){
            text3[n] = textkey2[n] + text2[n].toInt() + k
            n++
        }
    } else {
        var n = 0
        while(n < j){
            text3[n] = textkey2[n] + text2[n].toInt() + k
            n++
        }
    }

    println("text3:")
    for(text3 in text3){
        print(text3)
    }
    println()
}