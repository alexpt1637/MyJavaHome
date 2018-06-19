package ru.alexpt.test.my27java;

import javax.swing.*;
import java.awt.*;

public class My27 {
    public static void main(String[] args) {
        System.out.println("It is program My");
        MyFrame frame = new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyFrame extends JFrame{
    public MyFrame(){
        setTitle("MainOne frame");
        setSize(500,500);
        MyPanel panel = new MyPanel();
        Container pane = getContentPane();
        pane.add(panel);
    }
}

class MyPanel extends JPanel{

}
