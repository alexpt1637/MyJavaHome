package ru.dvfu.mrcpk.java.geometry;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       /* Rectangle rectangle1 = new Rectangle();
        System.out.println("Введите значение стороны прямоугольника (в см) и нажмите Enter: ");
        rectangle1.a = in.nextInt();
        System.out.println("Введите значение второй стороны прямоугольника и нажмите Enter: ");
        rectangle1.b = in.nextInt();
        *//*rectangle1.значение();*//*
        rectangle1.площадь();
        rectangle1.периметр();
        rectangle1.цвет();
        rectangle1.рисование();*/

        /*rectangle1.toString();*/  // Посмотреть тему переопределения метода toString

        Circumference circumference1 = new Circumference();
        System.out.println("Введите значение радиуса (в см) и нажмите Enter: ");
        circumference1.R = in.nextInt();
        circumference1.площадьКруга();
        circumference1.диаметр();
        circumference1.длинаОкружности();
        circumference1.объемШара();
    }
}

class Rectangle{
    int a;          // сторона a
    int b;          // сторона b
    String color = "выбираем цвет фигуры";

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
        if (a >= 0 | b >= 0) {
            System.out.println("Хорошо, продолжим вычисления");
        } else {
            System.out.println("Введенные значения некорректны, полученным результатм доверять нельзя");
        }
    }*/
}

class Circumference {
    double R;      // Радиус круга (окуржности)
    double Pi = 3.14;

    void площадьКруга(){
        if (R >= 0){
            double S = Pi * R * R;
            System.out.printf("Площадь круга с радиусом R (кв.см) равна: " + "%.2f\n", S);
        } else {
            System.out.println("Введите корректное значение");
        }
    }

    void диаметр(){
        if (R >= 0){
            double d = 2 * R;
            System.out.printf("Диаметр круга с радиусом R (см) равен: " + "%.2f\n", d);
        } else {
            System.out.println("Введите корректное значение");
        }
    }

    void длинаОкружности(){
        if (R >= 0){
            double l = 2 * Pi * R;
            System.out.printf("Длина окружности с радиусом R (см) равна: " + "%.2f\n", l);
        } else {
            System.out.println("Введите корректное значение");
        }
    }

    void объемШара(){
        if (R >= 0){
            double v = (Pi * R * R * R) * 4 / 3;
            double v1 = (Pi * R * R * R) * 4 / 3 / 1000000;
            System.out.printf("Объем шара с радиусом R (куб.см) равен: " + "%.2f\n", v);
            System.out.printf("Объем шара с радиусом R (куб.м) равен: " + "%.5f\n", v1);
        } else {
            System.out.println("Введите корректное значение");
        }
    }
}