package ru.alexpt.test.kotlin

import jdk.nashorn.internal.objects.Global.print

class TestKotlin{
    val a = 2
    val b = 4

    fun printSumm (a: Int, b: Int){
        print(a + b)
    }
}