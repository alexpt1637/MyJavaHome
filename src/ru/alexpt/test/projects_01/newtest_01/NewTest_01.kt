package ru.alexpt.test.projects_01.newtest_01

fun main(args: Array<String>) {
    var x: Int = 3
    var name: String = "Name"
    x = x * 10
    var d: Double = Math.random()
    val str = String.format("%.2f", d)
    println("x = $x; random d = $str; name = $name")
    println("-------------------------------------------")

    while (x > 12){
        x = x - 10
        println("х равен: $x")
    }
    println("-------------------------------------------")

    for(x in 10..12){
        println("Теперь х равен: $x")
    }
    println("-------------------------------------------")

    if (x == 10){
        println("x должен быть равен 10 (x = $x)")
    } else {
        println("x не равен 10 (x = $x)")
    }
    println("-------------------------------------------")

    if ((x < 3) && (name.equals("Name"))){
        println("Вывод строки $name")
    }
    println("Эта строка выполняется при x = $x; name = $name")
    println("-------------------------------------------")

    x = 4   // присваиваем значение x = 4
    println("Запускаем цикл while:")
    while (x > 2){
        print("x = $x, далее: ")
        x = x - 1
        println("при x = x - 1: x = $x")
    }
    println("-------------------------------------------")

    // Пример цикла while:
    x = 1
    println("Перед началом цикла x = $x")
    while (x < 4) {
        println("Внутри цикла: x = $x")
        x = x + 1
    }
    println("После окончания цикла x = $x")
    println("-------------------------------------------")

    when(x){
        1 -> println("when(x=1): x = $x")
        2 -> println("when(x=2): x = $x")
        3 -> println("when(x=3): x = $x")
        else -> println("when(x=?): x = $x")
    }
    println("-------------------------------------------")

    x = 3
    when(x){
        3 -> println("when(x=$x): х равняется 3")
        else -> println("when(x=$x): х не равняется 3")
    }
    println("Эта строка выполняется в любом случае, x=$x")
    println("-------------------------------------------")

    x = 2
    when(x){
        3 -> println("when(x=$x): х равняется 3")
        else -> println("when(x=$x): х не равняется 3")
    }
    println("Эта строка выполняется в любом случае, x=$x")
    println("-------------------------------------------")

    // Генератор фраз
    val wordListOne: Array<String> = arrayOf("круглосуточный", "обалденный", "прикольный", "трехзвенный", "300-футовый", "взаимный", "обоюдный выигрыш", "проникающий", "умный")
    val wordListTwo: Array<String> = arrayOf("уполномоченный", "целеустремленный", "классный", "трудный", "чистый продукт", "ориентированный", "центральный", "распределенный", "фирменный")
    val wordListThree: Array<String> = arrayOf("процесс", "выход из положения", "тип структуры", "талант", "подход", "портал", "период времени", "обзор", "образец")

    // Вычисляем сколько слов в каждом списке (длину массива)
    val oneLength: Int = wordListOne.size
    val twoLength: Int = wordListTwo.size
    val threeLength: Int = wordListThree.size
    println("oneLength = $oneLength; twoLength = $twoLength; threeLength = $threeLength")

    // Генерируем три случайных числа
    val rand1: Int = (Math.random() * oneLength).toInt()
    val rand2: Int = (Math.random() * twoLength).toInt()
    val rand3: Int = (Math.random() * threeLength).toInt()
    println("rand1 = $rand1; rand2 = $rand2; rand3 = $rand3")

    // Строим фразу
    val phrase: String = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]

    // Выводим фразу на экран
    println("Всё что нам нужно, - это $phrase")
    println("-------------------------------------------")
}