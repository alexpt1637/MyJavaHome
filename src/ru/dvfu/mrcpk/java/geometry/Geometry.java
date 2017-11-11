package ru.dvfu.mrcpk.java.geometry;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Rectangle rectangle1 = new Rectangle();
        System.out.println("Введите значение стороны прямоугольника (в см) и нажмите Enter: ");
        rectangle1.a = in.nextInt();
        System.out.println("Введите значение второй стороны прямоугольника и нажмите Enter: ");
        rectangle1.b = in.nextInt();
        /*rectangle1.значение();*/
        rectangle1.площадь();
        rectangle1.периметр();
        rectangle1.цвет();
        rectangle1.рисование();

        /*rectangle1.toString();*/  // Посмотреть тему переопределения метода toString
    }
}

class Rectangle{
    int a;          // сторона a
    int b;          // сторона b
    String color = "красный";

    void площадь() {
        if (a == b) {
            int S1 = a * a;
            System.out.println("Это квадрат, его площадь равна " + S1 + " кв.см");
        } else {
            int S = a * b;
            System.out.println("Площадь прямоугольника равна " + S + " кв.см");
        }
    }

    void периметр(){
        if (a == b) {
            int P1 = a * 4;
            System.out.println("Периметр квадрата равен " + P1 + " см");
        } else {
            int P = (a + b) * 2;
            System.out.println("Периметр прямоугольника равен " + P + " см");
        }
    }

    void цвет(){
        if (a == b) {
            System.out.println("Цвет квадрата: " + color);
        } else {
            System.out.println("Цвет прямоугольника: " + color);
        }
    }

    void рисование() {
        if (a == b) {
            System.out.println("Рисуем квадрат со сторонами " + a + " см");
        } else {
            System.out.println("Рисуем прямоугольник со сторонами " + a + " и " + b + " см");
        }
    }

    /*void значение() {
        if (a < 0 | b < 0) {
            System.out.println("Хорошо, продолжим вычисления");
        } else {
            System.out.println("Введенные значения некорректны, полученным результатм доверять нельзя");
        }
    }*/
}