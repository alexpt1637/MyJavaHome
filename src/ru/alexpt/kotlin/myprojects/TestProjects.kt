package ru.alexpt.kotlin.myprojects

fun main(args: Array<String>) {
    println("en:")
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
    println("d = $d"); println("d1 = $d1")
}