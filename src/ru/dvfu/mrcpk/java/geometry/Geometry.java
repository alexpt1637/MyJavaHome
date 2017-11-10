package ru.dvfu.mrcpk.java.geometry;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Введите значение стороны прямоугольника и нажмите Enter: ");
        rectangle1.a = in.nextInt();
        System.out.println("Введите значение второй стороны прямоугольника и нажмите Enter: ");
        rectangle1.b = in.nextInt();
        rectangle1.площадь();
        rectangle1.периметр();
    }
}

class Rectangle{
    int a;          // сторона a
    int b;          // сторона b

    void площадь(){
        int S = a * b;
        System.out.println("Площадь прямоугольника равна: " + S);
    }
    void периметр(){
        int P = (a + b) * 2;
        System.out.println("Периметр прямоугольника равен: " + P);
    }
}
