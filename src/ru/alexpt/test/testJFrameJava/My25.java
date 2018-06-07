package ru.alexpt.test.testJFrameJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class My25 {
    public static void main(String[] args) {
        System.out.println("It is program My");
        MyFrame frame = new MyFrame(0,0);
        MyFrame frame2 = new MyFrame(30,30);
        MyFrame frame3 = new MyFrame(60,60);
        // создаем текст строки заголовка первого окна
        frame.setTitle("Main frame");
        // делаем первое окно не изменяемым по размеру
        frame.setResizable(false);      // false - значит что окно не изменяемое
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);         // вместо устаревшего метода frame.show();
        // меняем иконку второго окна
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image im = kit.getImage("heart.png");
        frame2.setIconImage(im);
        // запускаем второе окно в максимально возможном размере
        frame2.setExtendedState(Frame.MAXIMIZED_BOTH);
        // создаем текст строки заголовка второго окна
        frame2.setTitle("Heart");
        frame2.setVisible(true);
        // создаем третье окно без атрибутов (декораций) чистое
        frame3.setUndecorated(true);    // метод очистил третье окно
        frame3.setVisible(true);
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
