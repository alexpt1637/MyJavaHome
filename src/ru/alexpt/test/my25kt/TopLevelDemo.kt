package ru.alexpt.test.my25kt

import java.awt.*
import java.awt.event.*
import javax.swing.*

fun main(args: Array<String>) {
    visible()
}

fun createAndShowGUI() {
        // Создание и настройка окна
        val frame = JFrame("TopLevelDemo")
        // Настройка закрытия приложения после закрытия окна
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        // Создать строку меню MenuBar. Сделать зеленый фон
        val greenMenuBar = JMenuBar()
        greenMenuBar.isOpaque = true
        greenMenuBar.background = Color(154, 165, 127)
        greenMenuBar.preferredSize = Dimension(200, 20)

        // Создать желтую метку для размещения на панели содержимого
        val yellowLabel = JLabel()
        yellowLabel.isOpaque = true
        yellowLabel.background = Color(248, 213, 131)
        yellowLabel.preferredSize = Dimension(200, 180)

        // Установить строку меню и добавить метку на панель содержимого
        frame.jMenuBar = greenMenuBar
        frame.contentPane.add(yellowLabel, BorderLayout.CENTER)

        // Отобразить окно
        frame.pack()
        frame.isVisible = true
}

fun visible(){
    // Запланировать задание для потока диспетчеризации событий:
    // создание и показ этого приложения с GUI
    javax.swing.SwingUtilities.invokeLater { createAndShowGUI() }
}