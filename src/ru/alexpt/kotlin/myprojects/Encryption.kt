package ru.alexpt.kotlin.myprojects

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    /*println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()*/

    val textkey = "Моя кодовая фраза на русском языке"
    println("'textkey': $textkey")

    val textkey1 = textkey.toList()
    println(textkey1)

    val i = 0
    val j = 0
    addkey(textkey1, i, j)

    val textof: String = "ɜʠʬ賓ʒʱʌʱﹶʕʣﺀʳʩﹴʢʉﺅʣʑﺏʩﺇʤʥʎʔʘﹿ*****"

    ofkey(textof)
}

fun addkey(textkey1: List<Char>, i: Int, j: Int) {
    var i = textkey1.size               // определяем длину массива (длину ключа, максимальную длину сообщения)
    println("Длина ключа: i = $i")

    var text: String = "Мой дядя самых честных правил"
    val text1 = text.toList()
    println(text1)
    var j = text1.size                  // определяем длину массива и длину сообщения
    println("Исходный текст: '$text', \nдлина сообщения j = $j")

    val textkey2: CharArray = textkey1.toCharArray()
    val text2: CharArray = text1.toCharArray()
    val text3 = CharArray(i, {'*'})

    if(i <= j){
        var n = 0
        while(n < i){
            text3[n] = textkey2[n] + text2[n].toInt() - 1500
            n++
        }
    } else {
        var n = 0
        while(n < j){
            text3[n] = textkey2[n] + text2[n].toInt() - 1500
            n++
        }
    }
    println()

    println("Зашифрованный текст:")
    for(text3 in text3){
        print(text3)
    }
    println()
}

fun ofkey(textof: String) {
    println("Зашифрованный текст: \n$textof")
}