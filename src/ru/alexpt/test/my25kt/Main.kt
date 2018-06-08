package ru.alexpt.test.my25kt

fun main(args: Array<String>) {
    val app = SimpleGUI()
    app.isVisible = true

    val frame2 = MyFrame(25,25)
    frame2.title = "Heart"
    frame2.isVisible = true
}