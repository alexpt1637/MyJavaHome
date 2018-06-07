package ru.alexpt.test.testJFrameJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class My25 {
    public static void main(String[] args) {
        System.out.println("It is program My");
        MyFrame frame = new MyFrame(0,0);
        MyFrame frame2 = new MyFrame(40,40);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);         // вместо устаревшего метода frame.show();
        frame2.setVisible(true);
    }
}

class MyFrame extends JFrame{
    // создаем конструктор
    public MyFrame(int x, int y){
//        setSize(300,200);
//        setLocation(x, y);
        // получаем данные разрешения нашего экрана
        Toolkit kit = Toolkit.getDefaultToolkit();
        // сохраняем данные разрешения нашего экрана в переменную
        Dimension screenSize = kit.getScreenSize();
        // устанавливаем переменные оси координат x, y
        int lx = screenSize.width;      // положение окна по оси х
        int ly = screenSize.height;     // положение окна по оси у
        setBounds(x * lx / 100, y * ly / 100,300,200);
    }
}
