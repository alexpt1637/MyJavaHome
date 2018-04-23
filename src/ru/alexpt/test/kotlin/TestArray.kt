package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {

    // https://metanit.com/java/kotlin/2.3.php

    // С помощью встроенной функции arrayOf() можно передать набор значений, которые будут составлять массив:
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val n = numbers[1]  // получаем второй элемент  n=2
    println("n = $n")
    numbers[2] = 7          // переустанавливаем третий элемент

    var max = numbers.max()     // Максимальное значение в массиве
    println("Максимальное значение в массиве: $max")
    var min = numbers.min()     // Минимальное значение в массиве
    println("Минимальное значение в массиве: $min")

    numbers.sort()              // сортировки массива с использованием метода Arrays.sort()
    numbers.fill(12)    // заполняет массив переданным значением

    // Перебор массивов. Для перебора массивов применяется цикл for:
    /*for(numbers in numbers){
        println(numbers)
    }
    println()*/

    val str = numbers.toList()
    println(str)

    val arr = str.toIntArray()
    arr[0] = 25
    arr[2] = 36
    arr[4] = 69
    arr.sort()
    for (arr in arr){
        println(arr)
    }

    max = arr.max()
    min = arr.min()
    println("min = $min, max = $max")

    arr.sortDescending()        // обратная сортировка массива
    for (arr in arr){
        println(arr)
    }

    val clone = arr.clone()
    println("Клон архива:")
    for (clone in clone){
        println(clone)
    }

    clone[3] = 14
    clone[4] = 58
    clone.sort()
    println("Архив после добавления элементов и сортировки:")
    for (clone in clone){
        println(clone)
    }

    println(arr.equals(clone))  // проверяет на идентичность массивы
    println(arr.equals(arr))

    val newarr = clone.copyOf(7)    // Меняем размер массива
    newarr[5] = 5
    newarr[6] = 105
    println("Меняем размер массива:")
    for (new in newarr){
        println(new)
    }

    newarr.sortDescending()
    println("Обратная сортировка обновленного массива:")
    for (new in newarr){
        println(new)
    }

    val arrint: Array<Int> = Array(4, {25})         // создание массива из 4 одинаковых чисел
    val name: Array<String> = Array(3, {"Bob"})     // создание массива из 3 одинаковых имен
    println("Первый массив чисел:")
    for(arrint in arrint){
        println(arrint)
    }
    println("Второй массив имен:")
    for(name in name){
        println(name)
    }
    name[0] = "Jon"
    name[1] = "Max"
    name.sort()
    println("Массив имен после сортировки:")
    for(name in name){
        println(name)
    }
    println(name.toList())


    //------------------------------------------- Двухмерные массивы ---------------------------------------------------
    // Используя два цикла, можно перебирать двухмерные массивы:
    /*val table: Array<Array<Int>> = Array(3, { Array(3, {0}) })
    table[0] = arrayOf(1, 2, 3)
    table[1] = arrayOf(4, 5, 6)
    table[2] = arrayOf(7, 8, 9)

    for(row in table){
        for(cell in row){
            print("$cell \t")
        }
        println()
    }*/
}