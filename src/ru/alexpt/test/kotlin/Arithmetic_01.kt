package ru.alexpt.test.kotlin

import java.util.*

fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    println("Введите с клавиатуры натуральное число (x) и нажмите Enter: ")
    val x = `in`.nextInt()
    vvod_01(x)          // вывести на экран младший разряд числа
    vvod_02(x)          // вывести на экран количество десятков в нем
    vvod_03(x)          // вывести следующее за ним четное число

    println("Введите с клавиатуры последовательно три числа и нажмите Enter: ")
    val a = `in`.nextInt()
    val b = `in`.nextInt()
    var c = `in`.nextInt()
    vvod_04(a, b, c)    // вычислить среднее арифметическое значение трёх вещественных чисел
    vvod_05(a, b)       // вычислить корень линейного уравнения ax + b = 0
    vvod_06(a, b)       // вычислить указанную степень числа
    vvod_07(a)          // рассчитать площадь круга и длину окружности
    vvod_08(x)          // количество рублей перевести в доллары и евро
    println("x. Результат однострочной функции: сумма чисел (а = $a, в = $b) равна: " + min_vvod(a, b))
    c = min_vvod(a, b)  // присвоение переменной результата однострочной функции (переопределение переменной)
    println("x. Присвоенное переменной 'c' значение однострочной функции равно: $c")
    vvod_09(x)          // перевести километры в сухопутные и морские мили
    val P = vvod_10(a, b)
    println("10. $b процента(ов) от числа S ($a) равняется $P")
    val d = vvod_11(c).toInt()
    println("11. Диаметр окружности, которую можно получить из отрезка проволоки длиной $c см равен D = $d см")
    vvod_12(c)          // перевод указанного количества градусов по Цельсию в градусы по шкале Фаренгейта, Кельвина
    vvod_13(a, b)       // меняем местами значения переменных a и b
}

fun vvod_01 (x: Int) {
    val y = x % 10
    println("1. Младший разряд натурального числа $x равен: $y")
}

fun vvod_02 (x: Int){
    val j = x / 10
    println("2. Количество десятков в числе $x равно: $j")
}

fun vvod_03 (x: Int){
    val m = x / 2
    val n = m * 2 + 2
    println("3. Следующее четное за $x число равно: $n")
}

fun vvod_04 (a: Int, b: Int, c: Int){
    val d = (a.toDouble() + b.toDouble() + c.toDouble()) / 3
    println("4. Среднее арифметическое значение трёх вещественных чисел равно: $d")
}

fun vvod_05 (a: Int, b: Int){
    val x = -b.toDouble() / a.toDouble()
    println("5. Корень линейного уравнения ax + b = 0 равен: $x")
}

fun vvod_06 (a: Int, b: Int){
    val c = Math.pow(a.toDouble(), b.toDouble())
    println("6. Число (a = $a) в степени $b равно: $c")
}

fun vvod_07 (a: Int){
    val Pi = 3.14; val R = a.toDouble()
    val S = Pi * R * R; val s = S - S % 0.01
    val L = 2 * Pi * R; val l = L - L % 0.01
    println("7. При R = $a см площадь круга равна: $s кв.см, длина окружности: $l см")
}

fun vvod_08 (x: Int){
    val USD = 61.41; val EUR = 75.47
    val U = x.toDouble() / USD; val u = U - U % 0.01
    val E = x.toDouble() / EUR; val e = E - E % 0.01
    println("8. Сумма в рублях ($x руб.) равна $u долларам или $e евро")
}

fun min_vvod (a: Int, b: Int) = a + b

fun vvod_09 (x: Int){
    val sm = 1.609; val mm = 1.852
    val sml = x / sm; val sM = sml - sml % 0.01
    val mml = x / mm; val mM = mml - mml % 0.01
    println("9. В $x км. сухопутных миль - $sM, морских миль - $mM")
}

fun vvod_10 (a: Int, b: Int) = a.toDouble() / 100 * b.toDouble()

fun vvod_11 (c: Int) = c / 3.14

fun vvod_12 (c: Int){
    // точка таяния льда равна +32 °F, а точка кипения воды +212 °F. 1 °C = (212-32)/100 °F
    val F = 32 + 1.8 * c; val f = F.toInt()
    println("12. Количество градусов по Цельсию в градусах по шкале Фаренгейта равно: $f °F")
    // точка таяния льда равна +273 °K. 1 °C = 1 °K
    val K = 273 + c
    println("Количество градусов по Цельсию в градусах по шкале Кельвина равно: $K °K")
}

fun vvod_13 (a: Int, b: Int){
    println("13. Дано: a = $a, b = $b")
    val c = a; val a = b; val b = c
    println("Меняем местами значения переменных a и b: a = $a, b = $b")
}