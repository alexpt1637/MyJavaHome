package ru.alexpt.test.my25kt

import java.awt.Frame
import java.awt.Graphics
import java.awt.Toolkit
import javax.swing.JFrame
import javax.swing.JPanel

fun main(args: Array<String>) {
    println("It is program My")
    val frame = MyFrame(0,0)
    val frame2 = MyFrame(25,25)
    val frame3 = MyFrame(50,50)
    // создаем текст строки заголовка первого окна
    frame.title = "Main frame"
    // делаем первое окно не изменяемым по размеру
//    frame.isResizable = false      // false - значит что окно не изменяемое
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE // прекращение работы программы вцелом
    frame.isVisible = true      // вместо устаревшего метода frame.show()
    // меняем иконку второго окна
    val kit = Toolkit.getDefaultToolkit()
    val im = kit.getImage("heart.png")
    frame2.iconImage = im
    // запускаем второе окно в нормальном размере
    frame2.extendedState = Frame.NORMAL
    // создаем текст строки заголовка второго окна
    frame2.title = "Heart"
    frame2.isVisible = true
    // создаем третье окно без атрибутов (декораций) чистое
//    frame3.isUndecorated = true    // метод очистил третье окно
    val im3 = kit.getImage("ic_launcher.gif")
    frame3.iconImage = im3
    frame3.extendedState = Frame.ICONIFIED      // окно в свернутом виде
    frame3.title = "Smiley"
    frame3.isVisible = true
}

internal class MyFrame// создаем конструктор
(x: Int, y: Int) : JFrame() {
    init {
//        setSize(300, 200)                 // инициализация размера окна
//        setLocation(x, y)                 // инициализация положения окна
        // получаем данные разрешения нашего экрана
        val kit = Toolkit.getDefaultToolkit()
        // сохраняем данные разрешения нашего экрана в переменную
        val screenSize = kit.screenSize
        // устанавливаем переменные оси координат x, y
        val lx = screenSize.width      // положение окна по оси х
        val ly = screenSize.height     // положение окна по оси у
        setBounds(x * lx / 100, y * ly / 100, 300, 200)
        // создадим панель для размещения элементов (надписи, кнопки, переключатели)
        val panel = MyPanel()
        // создаем клиентскую часть окна (фрея)
        val pane = contentPane
        // свяжем панель и клиентскую часть окна с помощью метода add
        pane.add(panel)
    }
}

internal class MyPanel : JPanel() {
    public override fun printComponent(g: Graphics) {     // g - объект класса Graphics
        // обратимся к родительской реализации метода (super)
        super.printComponent(g)
        // приступим непосредственно к рисованию строки
        g.drawString("It is text", 55, 55)
    }
}