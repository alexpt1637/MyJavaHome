package ru.alexpt.test.projects_01.newtest_01

import java.util.*

fun main(args: Array<String>) {
    val k = 30000
    val `in` = Scanner(System.`in`)

    /*println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()*/
    val textkey: String = "Мой дядя самых честных правил когда не в шутку занемог он уважать себя заставил и лучше выдумать не мог"

    println("Введите текст:")
    val text: String = `in`.nextLine()

    encrypt(textkey, text, k)
}

fun encrypt(textkey: String, text: String, k: Int) {
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