package ru.alexpt.test.kotlin

fun main(args: Array<String>) {

    hello()                 // вызов функции hello
    factorial(5)        // произведение всех натуральных чисел от 1 до n включительно

    displayUser("Tom", 23)      // Предача параметров
    displayUser("Alice", 19)
    displayUser("Kate", 25)

    displayUser2("Tom", 23, "Manager")
    displayUser2("Alice", 21)
    displayUser2("Kate")

    // используя именованные аргументы, мы можем переопределить порядок их передачи параметрам:
    displayUser2(name="Tom", position="Manager", age=28)
    displayUser2(age=21, name="Alice")
    displayUser2("Kate", position="Middle Developer")
    // Часть аргументов могут передаваться параметрам по позиции.
    // Но если какой-то аргумент передан по имени, то остальные также должны передаваться по имени соответствующих параметров
    println()

    sum(12, 24)
    sum(225, 336)
    sum(b=458, a=654)
    println()

    printStrings("Tom", "Bob", "Sam")    // Функция может принимать переменное количество параметров одного типа
    println()
    printStrings("Kotlin", "JavaScript", "Java", "C#", "C++")
    println()

    sum2(1, 2, 3, 4, 5)                 // подсчет суммы неопределенного количества чисел
    sum2(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println()

    // Оператор * (spread operator) позволяет передать параметру в качестве значения элементы из массива
    val users = arrayOf("Tom", "Bob", "Alice")
    printUserGroup3("MO-011", *users, count=3)
    println()

    // Так как функция возвращает значение, то при ее вызове это значение можно присвоить переменной:
    val a = factorial2(4)
    val b = factorial2(5)
    val c = factorial2(6)
    println("Возвращаемые значения: a = $a, b = $b, c = $c")
    println()

    // Однострочные функции (single expression function)
    val a1 = double(5)
    val b1 = double(6)
    println("a = $a1, b = $b1")     // a = 25, b = 36
    println()

    val S_circle = areaCircle(15)
    println("Площадь круга с радиусом R равна $S_circle кв.см.")

    val L_circle = circumference(15)
    println("Длина окружности с радиусом R равна $L_circle см.")

    var D_circle = diameter(15)
    println("Диаметр круга с радиусом R равен $D_circle см.")
    println()

    // Лямбда-выражения могут передаваться в качестве параметра в функции.
    // Лямбда-выражение можно сохранить в обычную переменную и затем вызывать через имя этой переменной как обычную функцию.
    var helloBob = {println("hello, Bob")}
    helloBob()
    helloBob = {println("Переопределение переменной с сохраненным лямбда-выражением")}
    helloBob()

    helloBob = {println("Hello, Grey")}
    helloBob()
    println()

    D_circle = diameter(25)
    println("Диаметр круга с радиусом R равен $D_circle см.")
    println()

    // Локальные функции
    val a2 = isFirstGreater(10.0, 10.0, 20.0, 20.0)
    val b2 = isFirstGreater(20.0, 20.0, 10.0, 10.0)
    println("a = $a2, b = $b2")

    // Ограничение количества знаков после запятой (val str = String.format("%.2f", d))
    rand()
}

//-----------------------------------------------------/ fun /----------------------------------------------------------
// определение функции hello
fun hello(){
    println("Hello")
}

fun factorial(n: Int){      // Через параметры функция может получать некоторые значения извне
    var result = 1          // Значения, которые передаются параметрам функции, назвают аргументами
    for(d in 1..n){
        result *= d         // *= присваивание после умножения
    }
    println("Факториал $n равен $result")
}

fun displayUser(name: String, age: Int){
    println("Name: $name, Age: $age")
}

// мы обязательно должны предоставить для каждого параметра какое-то определенное значение
// мы можем определить какие-то параметры функции как необязательные и установить для них значения по умолчанию:

fun displayUser2(name: String, age: Int = 18, position: String = "Visitor"){
    println("Name: $name, Age: $age, Position: $position")
}

fun sum (a: Int, b: Int){
    var c = a + b
    println("Сумма значений a + b = $c")
}

// Функция может принимать переменное количество параметров одного типа. Для определения таких параметров применяется ключевое слово vararg

fun printStrings(vararg strings: String){
    for(str in strings)
        println(str)
}

// подсчет суммы неопределенного количества чисел:

fun sum2(vararg numbers: Int){
    var result=0
    for(n in numbers)
        result += n
    println("Сумма чисел равна $result")
}

// Оператор * (spread operator) (не стоит путать со знаком умножения) позволяет передать параметру в качестве значения элементы из массива:

fun printUserGroup3(group: String, vararg users: String, count:Int){
    println("Count: $count")
    for(user in users)
        println(user)
}

fun factorial2(n: Int) : Int{   // функция возвращает значение типа Int
    var result = 1
    for(d in 1..n){
        result *= d
    }
    return result               // возвращение значения
}

// Однострочные функции (single expression function) используют сокращенный синтаксис определения функции в виде одного выражения.
// Эта форма позволяет опустить возвращаемый тип и оператор return.
// Значение этого выражения будет возвращаться функцией. При этом оператор return не используется.

fun double(x: Int) = Math.pow(x.toDouble(), 2.0)

fun areaCircle (R: Int) = Math.PI * Math.pow(R.toDouble(), 2.0)

fun circumference (R: Int) = 2 * Math.PI * R

fun diameter (R: Int) = 2 * R

// Локальные функции
// Одни функции могут быть определены внутри других функций. Внутренние или вложенные функции еще называют локальными
// функция принимает на вход основание и высоту двух треугольников и должна вычислить, больше ли площадь первого треугольника, чем второго:

fun isFirstGreater(base1: Double, height1: Double, base2: Double, height2: Double): Boolean{
    fun square(base: Double, height: Double) = base * height / 2
    return square(base1, height1) > square(base2, height2)
}

// Ограничение количества знаков после запятой
fun rand(){
    val d: Double = Math.random()
    val str = String.format("%.2f", d)
    val i = (d * 100).toInt()
    println("random d = $str; i = $i")
}