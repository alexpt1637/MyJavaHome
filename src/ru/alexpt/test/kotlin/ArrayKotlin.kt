package ru.alexpt.test.kotlin

fun main(args: Array<String>) {

    // https://metanit.com/java/kotlin/2.3.php

    // С помощью встроенной функции arrayOf() можно передать набор значений, которые будут составлять массив:
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]  // получаем второй элемент  n=2
    numbers[2] = 7      // переустанавливаем третий элемент

    // Перебор массивов. Для перебора массивов применяется цикл for:
    for(numbers in numbers){
        println(numbers)
    }
    println()

    // Двухмерные массивы
    // Используя два цикла, можно перебирать двухмерные массивы:
    val table: Array<Array<Int>> = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    for(row in table){
        for(cell in row){
            print("$cell \t")
        }
        println()
    }
}