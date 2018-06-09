package ru.alexpt.test.my25kt

fun main(args: Array<String>) {
    my25()
    simpleGUI()
}

fun simpleGUI(){
    val app = SimpleGUI()
    app.isVisible = true
}