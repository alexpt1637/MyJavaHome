package ru.alexpt.test.my25kt

import javax.swing.*
import java.awt.*
import java.awt.event.*

class SimpleGUI : JFrame("Simple Example") {
    private val button = JButton("Press")
    private val input = JTextField("", 5)
    private val label = JLabel("Input:")
    private val radio1 = JRadioButton("Select this")
    private val radio2 = JRadioButton("Select that")
    private val check = JCheckBox("Check", false)

    // конструктор класса
    init {
        this.setBounds(100, 100, 250, 100)
        this.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        val container = this.contentPane
        container.layout = GridLayout(3, 2, 2, 2)
        container.add(label)
        container.add(input)

        val group = ButtonGroup()
        group.add(radio1)
        group.add(radio1)
        container.add(radio1)
        radio2.isSelected = true
        container.add(radio2)
        container.add(check)
        button.addActionListener(ButtonEventListener())
        container.add(button)
    }

    internal inner class ButtonEventListener : ActionListener {

        override fun actionPerformed(e: ActionEvent) {
            var message = ""
            message += "Button was presed\n"
            message += "Text is: " + input.text + "\n"
            message += (if (radio1.isSelected) "Radio #1 " else "Radio #2 ") + "is selected\n"
            message += "Checkbox is " + if (check.isSelected) "checked" else "unchecked"
            JOptionPane.showMessageDialog(null, message, "Output", JOptionPane.PLAIN_MESSAGE)
        }
    }
}