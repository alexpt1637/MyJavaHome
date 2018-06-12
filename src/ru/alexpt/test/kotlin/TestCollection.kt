package ru.alexpt.test.kotlin

fun main(args: Array<String>) {
    // List представляет неизменяемую (immutable) коллекцию

    var numbers : List<Int> = listOf(1, 2, 3, 4, 5)

    // перебор списка
    for (n in numbers){
        print(n)
    }
    println()

    println("get(Index): возвращает элемент по индексу: " + numbers.get(1))
    println("indexOf(2): возвращает первый индекс элемента: " + numbers.indexOf(2))

    // Изменяемые списки
    var numbers2: MutableList<Int> = mutableListOf(5, 6, 7)

    numbers2.add(12)
    numbers2.add(0, 23)
    numbers2.addAll(0, listOf(-3, -2, -1))
    numbers2.removeAt(0)
    numbers2.remove(5)

    for (n in numbers2){ println(n) }

    var numbers1 : ArrayList<Int> = arrayListOf(1, 2, 3, 4, 5)
    numbers1.add(4)
    numbers1.clear()
}