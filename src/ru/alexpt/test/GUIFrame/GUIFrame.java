package ru.alexpt.test.GUIFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIFrame extends JFrame {
    private JButton button1;
    private JPanel rootPanel;

    public GUIFrame() {
        setSize(300, 200);  // инициализация размера окна
        setContentPane(rootPanel);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        button1.setToolTipText ("результат выводится в панель компилятора");
        ActionListener actionListener = new TestActionListener();
        button1.addActionListener(actionListener);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        new GUIFrame();
    }

    public static class TestActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //Код, который нужно выполнить при нажатии
            int a = 45;
            int b = 5;
            int c = a / b;
            System.out.println("c = " + c);


        }
    }
}
