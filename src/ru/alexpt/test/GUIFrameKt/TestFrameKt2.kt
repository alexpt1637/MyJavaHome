package ru.alexpt.test.GUIFrameKt

import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.JLabel

// статический метод main – точка входа приложения, с него начинается выполнение
fun main(args: Array<String>) {
    javax.swing.SwingUtilities.invokeLater { createGUI() }
}

fun createGUI() {
    // первой строкой метода createGUI мы говорим системе, чтобы окно полностью рисовалось Swing
    // иначе окно будет определяться самой операционной системой – Swing доверит рисовать окно ей
    JFrame.setDefaultLookAndFeelDecorated(true)

    // создаем само окно и указываем текст, который будет располагаться в его заголовке
    val frame = JFrame("Test frame")

    // говорим системе, как отреагировать на закрытие окна.
    // Сейчас нам необходимо, чтобы при закрытии окна закрывалось и приложение
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val y = sum()   // сохраняем в переменную результат работы функции sum()

    // создаем текстовый лейбл с помощью JLabel,
    // указывая при этом какой текст мы хотим в нем видеть, и размещаем на форме
    val label = JLabel("The result of the function: y = $y")    // выводим результат работы функции sum()

    // у объекта JFrame есть специальная панель content pane, на которой должны размещаться все остальные дочерние компоненты.
    // с помощью вызова getContentPane мы получаем эту панель и добавляем лейбл уже на нее
    frame.contentPane.add(label)

    // устанавливаем размер окна
    frame.preferredSize = Dimension(200, 100)

    // показываем окно пользователю
    frame.pack()
    frame.isVisible = true
}

fun sum(): Int{
    val x = 25 + 5
    return x
}