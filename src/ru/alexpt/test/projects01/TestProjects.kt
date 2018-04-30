package ru.alexpt.test.projects01

import java.util.*

fun main(args: Array<String>) {
    /*println("en:")
    var a = 'a'; var a1 = a.toInt(); println("a1 = $a1")
    var b = 'b'; var b1 = b.toInt(); println("b1 = $b1")
    var c = a + b.toInt()
    var c1 = a.toInt() + b.toInt()
    var c2 = a1 + b1
    println("c = $c"); println("c1 = $c1"); println("c2 = $c2"); println(c1 == c2)
    var d: Char = c - b.toInt()
    var d1 = c1 - b1
    println("d = $d"); println("d1 = $d1")
    println()

    println("ru:")
    a = 'а'; a1 = a.toInt(); println("a1 = $a1")
    b = 'я'; b1 = b.toInt(); println("b1 = $b1")
    c = a + b.toInt() - 1100
    c1 = a.toInt() + b.toInt() - 1100
    c2 = a1 + b1 - 1100
    println("c = $c"); println("c1 = $c1"); println("c2 = $c2"); println(c1 == c2)
    d = c - b.toInt() + 1100
    d1 = c1 - b1 + 1100
    println("d = $d"); println("d1 = $d1")*/

    val `in` = Scanner(System.`in`)
    var k = 0
    var i = 0

    enru(k)
    addtext()

    val a1 = CharArray(i, {'*'})
}

//----------------------------------------------- Выбор языка ввода ----------------------------------------------------
fun enru(k: Int){
    val `in` = Scanner(System.`in`)
    println("Выбор языка ввода (введите 'en' или 'ru':")
    val e: String = `in`.nextLine()
    var k = 0

    when(e){
        "en" -> k
        "ru" -> k = 1100
    }
    println("k = $k")
}

//------------------------------------- Ввод текста и преобразование в CharArray ---------------------------------------
fun addtext(): CharArray {
    val `in` = Scanner(System.`in`)
    println("Введите текст 'a':")
    val a: String = `in`.nextLine()
    println("Текст 'a': $a")
    val a1 = a.toCharArray()
    print("a1: ")
    for(a1 in a1){
        print(a1)
    }
    val a2 = a1.toList()
    println("\na2: $a2")

    var i = a2.size                  // определяем длину массива и длину сообщения
    println("Длина сообщения i = $i")

    return a1
}

class Dec {
    var x = 0
    var y = 0
    var z = 0

    fun sum(x: Int, y: Int){
        val z = x + y
        println("Сумма двух чисел: z = $z")
    }

    fun pow(z: Int){
        val zz = Math.pow(z.toDouble(), 3.0)
        println("Число в кубе равно: $zz")
    }
}