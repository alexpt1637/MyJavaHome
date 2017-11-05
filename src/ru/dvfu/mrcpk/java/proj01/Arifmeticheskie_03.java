package ru.dvfu.mrcpk.java.proj01;

import java.util.Scanner;

public class Arifmeticheskie_03 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1. Марафонец прошел S километров со скоростью V метров в секунду (расстояние и скорость вводятся с клавиатуры).
        // Определить, сколько времени он был в пути (часов, минут, секунд)?

        /* System.out.println("Введите с клавиатуры расстояние, пройденное марафонцем (км): ");
        int S = in.nextInt();       // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры скорость марафонца (м/с): ");
        int V = in.nextInt();       // Переменная, в которую сохраняется введенное значение.
        int sec = S * 1000 / V;     // Время в секундах, которое бежал марафонец

        int h = (sec / (60 * 60)) % 24;
        int m = (sec / 60) % 60;
        int s = sec % 60;

        // System.out.println(h); // Предварительный рассчет
        // System.out.println(m); // Предварительный рассчет
        // System.out.println(s); // Предварительный рассчет
        // int res = h * 60 * 60 + m * 60 + s * 1;      // Проверка правильности рассчетов
        // System.out.println(res);

        System.out.println("Марафонец был в пути:");
        System.out.println("Часов: " + h);
        System.out.println("Минут: " + m);
        System.out.println("Секунд: " + s);
        */

        // 2. Пользователь вводит с клавиатуры два дробных числа. Вывести на экран сумму целых частей и сумму дробных.

        // System.out.println("Введите с клавиатуры первое дробное число: ");
        // float a = in.nextFloat();       // Переменная, в которую сохраняется введенное значение.
        // System.out.println("Введите с клавиатуры второе дробное число: ");
        // float b = in.nextFloat();       // Переменная, в которую сохраняется введенное значение.

        float a = 12.23f, b = 45.56f;

        float a1 = a * 100 % 100;
        float b1 = b * 100 % 100;
        System.out.println(a1);
        System.out.println(b1);

        float d = (a1 + b1) / 100;
        System.out.println("Сумма дробных частей двух чисел: " + d); // Сумма дробных частей двух чисел
    }
}