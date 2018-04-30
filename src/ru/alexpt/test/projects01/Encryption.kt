package ru.alexpt.test.projects01

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    /*println("Введите кодовую фразу (ключ):")
    val textkey: String = `in`.nextLine()*/

    var k = 0
    enru(k)

    val textkey = "На каком основании принимаются политизированные решения"
    println("'textkey': $textkey")

    val textkey1 = textkey.toList()
    println(textkey1)

    val i = 0
    val j = 0
    addkey(textkey1, i, j, k)

    val textof: String = "Ҏҧ\u0085ҬҤҳҳҥ\u008FҮ*********************************************"

    ofkey(textof, i, j, textkey1, k)

//    decClass2(i, j)
}

//----------------------------------------------------------------------------------------------------------------------

fun addkey(textkey1: List<Char>, i: Int, j: Int, k: Int) {
    var i = textkey1.size               // определяем длину массива (длину ключа, максимальную длину сообщения)
    println("Длина ключа: i = $i")

    var text: String = "qwertyuiop"      // исходный текст
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
            text3[n] = textkey2[n] + text2[n].toInt() - k
            n++
        }
    } else {
        var n = 0
        while(n < j){
            text3[n] = textkey2[n] + text2[n].toInt() - k
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

fun ofkey(textof: String, i: Int, j: Int, textkey1: List<Char>, k: Int) {
    println()
    println("Зашифрованный текст: --------------/ расшифование /--------------- \n'textof' : $textof")
    val textof1 = textof.toList()
    println("textof1:")
    println(textof1)
    println("textkey1:")
    println(textkey1)

    val textkey2: CharArray = textkey1.toCharArray()
    val textof2: CharArray = textof1.toCharArray()
    val textof3: Array<Char>
    println("textof2:")
    for(textof2 in textof2){
        print(textof2)
    }

    println("\ntextkey2:")
    for(textkey2 in textkey2){
        print(textkey2)
    }
    println()

    print("textkey2[3]: ")
    println(textkey2[3])

    val t3 = (textof2[2] - textkey2[2] + k).toChar()
    println("t3 = $t3")

    /*if(i <= j){
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
    println()*/

}

fun decClass2(i: Int, j: Int){
    if(i > j){
        decClass()
    } else {
        addtext()
    }

}