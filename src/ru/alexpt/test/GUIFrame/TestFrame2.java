package ru.alexpt.test.GUIFrame;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestFrame2 {

    public static void createGUI() {
        // первой строкой метода createGUI мы говорим системе, чтобы окно полностью рисовалось Swing
        // иначе окно будет определяться самой операционной системой – Swing доверит рисовать окно ей
        JFrame.setDefaultLookAndFeelDecorated(true);

        // создаем само окно и указываем текст, который будет располагаться в его заголовке
        JFrame frame = new JFrame("Test frame");

        // говорим системе, как отреагировать на закрытие окна.
        // Сейчас нам необходимо, чтобы при закрытии окна закрывалось и приложение
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // создаем текстовый лейбл с помощью JLabel,
        // указывая при этом какой текст мы хотим в нем видеть, и размещаем на форме
        JLabel label = new JLabel("The test label");

        // у объекта JFrame есть специальная панель content pane, на которой должны размещаться все остальные дочерние компоненты.
        // с помощью вызова getContentPane мы получаем эту панель и добавляем лейбл уже на нее
        frame.getContentPane().add(label);

        // устанавливаем размер окна
        frame.setPreferredSize(new Dimension(200, 100));

        // показываем окно пользователю
        frame.pack();
        frame.setVisible(true);
    }

    // статический метод main – точка входа приложения, с него начинается выполнение
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
