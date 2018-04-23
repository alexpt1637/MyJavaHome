package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)

    println("Введите с клавиатуры два 3-значных числа:")
    val x = `in`.nextInt()
    val y = `in`.nextInt()
    mod_01(x, y)         // меняем средние цифры значений x и y

    println("Введите с клавиатуры 4-значное число:")
    val z = `in`.nextInt()
    mod_02(z)           // подсчитать сумму первой и третьей цифры и разность второй и четвертой

    println("Введите с клавиатуры 3-значное число:")
    val q = `in`.nextInt()
    mod_03(q)           // ввести с клавиатуры 3-значное число и удалить из него среднюю цифру

    println("Введите сумму денежного вклада в рублях, а также процент годовых, которые выплачивает банк:")
    val r = `in`.nextInt()
    val p: Double = `in`.nextDouble()
    mod_04(r, p)        // сумма денег, выплачиваемых банком вкладчику каждый месяц
}

fun mod_01(x: Int, y: Int){
    val x1 = x % 10
    val x2 = (x - x1) % 100
    val x3 = x - x1 - x2
    val y1 = y % 10
    val y2 = (y - y1) % 100
    val y3 = y - y1 - y2
//    println("x = $x, x1 = $x1, x2 = $x2, x3 = $x3")
//    println("y = $y, y1 = $y1, y2 = $y2, y3 = $y3")
    val xx = x1 + y2 + x3
    val yy = y1 + x2 + y3
    println("Меняем средние цифры значений x и y: $xx, $yy")
}

fun mod_02(z: Int){
    val z1 = z % 10
    val z2 = (z - z1) % 100 / 10
    val z3 = (z - z1 - z2) % 1000 / 100
    val z4 = (z - z1 - z2 - z3) % 10000 / 1000
//    println("z = $z, z1 = $z1, z2 = $z2, z3 = $z3, z4 = $z4")
    val sum = z1 + z3   // подсчитать сумму первой и третьей цифры
    val dif = z2 - z4   // подсчитать разность второй и четвертой
    println("Сумма первой и третьей цифры: $sum, разность второй и четвертой: $dif")
}

fun mod_03(q: Int){
    val q1 = q % 10
    val q2 = q % 100 /10
    val q3 = q % 1000 / 10 - q2
//    println("q = $q, q3 = $q3, q2 = $q2, q1 = $q1")
    val sum = q1 + q3   // ввести с клавиатуры 3-значное число и удалить из него среднюю цифру
    println("Удалим из 3-значного числа $q среднюю цифру: $sum")
}

fun mod_04(r: Int, p: Double){
    // Определить сумму денег, выплачиваемых банком вкладчику каждый месяц
    val s: Double = r / 100 * p / 12
    println("Сумма денег, выплачиваемых банком вкладчику каждый месяц: $s руб.")
}