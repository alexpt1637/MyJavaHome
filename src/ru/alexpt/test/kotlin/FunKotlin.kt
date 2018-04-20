package ru.alexpt.test.kotlin

fun main(args: Array<String>) {

    hello()     // вызов функции hello
    factorial(4)
    factorial(5)
    factorial(6)
}

// определение функции hello
fun hello(){
    println("Hello")
}

fun factorial(n: Int){
    var result = 1
    for(d in 1..n){
        result *= d
    }
    println("Factorial of $n is equal to $result")
}