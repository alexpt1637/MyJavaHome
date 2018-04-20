package ru.alexpt.test.kotlin

import java.text.SimpleDateFormat
import java.util.*

// main() — точка входа в приложение
fun main(args : Array<String>) {
    //--------------------------------------------- Пример работы с датами ---------------------------------------------

    val date1 = "21092009"      // Рабочее исходное значение начальной даты
    val date2 = "21092010"

    // ---------------------------------------- Количество дней между датами -------------------------------------------

    val format = SimpleDateFormat("ddMMyyyy")
    val `in` = Scanner(System.`in`)

    println("Введите дату в формате \"ddMMyyyy\": ")
    val date3 = `in`.nextLong()

    var dateOne: Date? = null    // в данную переменную записываем значение, полученное после преобразования
    var dateTwo: Date? = null
    var dateThree: Date? = null

    try {
        dateOne = format.parse(date1)
        dateTwo = format.parse(date2)
        dateThree = format.parse(date3.toString())
    } catch (e: Exception) {
        e.printStackTrace()
    }

    //------------------------------- Количество дней между датами в миллисекундах -------------------------------------

    val difference = dateThree!!.getTime() - dateOne!!.getTime()
    println("Количество дней между датами в миллисекундах: " + difference)

    val days = (difference / (24 * 60 * 60 * 1000)).toInt() // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
    // Вывод разницы между датами в днях на экран
    println("Промежуточное значение $days дней")

    val yars = days / 365
    println("Промежуточное значение $yars лет")

    val months = (days - yars * 365) / 30
    println("Страховой стаж: $yars лет $months мес.")

    //----------------------------- Результат рассчета: Страховой стаж: _ лет _ мес. -----------------------------------

    val result = IntArray (3)   // Объявление архива из трех элементов
    result[0] = yars
    result[1] = months
    result[2] = days

    for(result in result){      // Вывод элементов архива
        println(result)
    }

    result[1] = 55555
    println("Второй элемент массива: " + result[1])
}