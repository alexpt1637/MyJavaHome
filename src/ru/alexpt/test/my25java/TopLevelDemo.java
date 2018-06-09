package ru.alexpt.test.my25java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TopLevelDemo {

    private static void createAndShowGUI() {
        // Создание и настройка окна
        JFrame frame = new JFrame("TopLevelDemo");
        // Настройка закрытия приложения после закрытия окна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать строку меню MenuBar. Сделать зеленый фон
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(new Color(154, 165, 127));
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        // Создать желтую метку для размещения на панели содержимого
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        // Установить строку меню и добавить метку на панель содержимого
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);

        // Отобразить окно
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Запланировать задание для потока диспетчеризации событий:
        // создание и показ этого приложения с GUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}