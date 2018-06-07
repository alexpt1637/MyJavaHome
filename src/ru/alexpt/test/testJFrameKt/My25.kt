package ru.alexpt.test.testJFrameKt

import java.awt.Toolkit
import javax.swing.JFrame

fun main(args: Array<String>) {
    println("It is program My")
    val frame = MyFrame(0,0)
    val frame2 = MyFrame(40,40)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE // прекращение работы программы вцелом
    frame.isVisible = true      // вместо устаревшего метода frame.show()
    frame2.isVisible = true
}

internal class MyFrame// создаем конструктор
(x: Int, y: Int) : JFrame() {
    init {
//        setSize(300, 200)   // инициализация размера окна
//        setLocation(x, y)                 // инициализация положения окна
        // получаем данные разрешения нашего экрана
        val kit = Toolkit.getDefaultToolkit()
        // сохраняем данные разрешения нашего экрана в переменную
        val screenSize = kit.screenSize
        // устанавливаем переменные оси координат x, y
        val lx = screenSize.width      // положение окна по оси х
        val ly = screenSize.height     // положение окна по оси у
        setBounds(x * lx / 100, y * ly / 100, 300, 200)
    }
}