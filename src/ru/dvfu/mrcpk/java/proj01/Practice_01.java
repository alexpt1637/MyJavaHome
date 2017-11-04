package ru.dvfu.mrcpk.java.proj01;

import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        //1. Hello, World!
        /* System.out.println("Hello, World!"); // Поздоровались с миром
         */

        // 2. Переменные
        /* byte num = 12; // Объявили переменную num типа byte и ввели её значение
        int i = 456;
        long l = 789456123;

        float f = 45.321f;
        double d = 987.1235; // Размер переменной данного типа в 2 раза больше, чем переменной типа float

        char ch = 'A';

        boolean is = true; // Истина
        boolean w = false; // Ложь

        String str = "Hello, World!"; // Строка

        System.out.println("Number: " + num); // Выводим на экран значение переменной, видим значение "Number: 12"
        System.out.println("Выводим на экран значение переменной d = " + d);
        System.out.println("char ch = " + ch); // Вывели на экран переменную типа char
        System.out.println("boolean is = " + is); // Видим на экране "boolean is = true"
        System.out.println("boolean w = " + w); // Видим на экране, что "boolean w = false"
        System.out.println(str); // Вывелина экран строку "Hello, World!"
        */

        // 3. Работаем с данными, введенными пользователем
        /* Scanner num = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int i = num.nextInt(); // Переменная, в которую помещается первое введенное значение
        System.out.print("Введите второе значение: ");
        int j = num.nextInt(); // Переменная, в которую помещается второе введенное значение
        System.out.print("Первое введенное значение равно: " + i); // Выводим значения на экран
        System.out.println("; Второе введенное значение равно: " + j);
        */

        /* Scanner str = new Scanner (System.in);
        String symbols;
        System.out.println("Введите с клавиатуры строку:");
        symbols = str.nextLine();
        System.out.println("Вы ввели с клавиатуры: " + symbols);
        */

        // 4. Математические операции
        // float i = 34.234f, j = 89.098f, x, y, a, b, c;
        // x = i + j;
        /* System.out.println(x);
        y = j / i;
        System.out.printf("%.3f\n", y);
        System.out.format("%.2f\n", x);
        a = i - j;
        System.out.println(a);
        b = i * j;
        System.out.format("%.1f\n", b);
        c = b % x;
        System.out.printf("%.2f", c); // Вывели на экран остаток деления b на x с точностью 2 знаков после запятой
        */

        /* x += 34f; // Увеличиваем значение x (x=i+j) на +34
        System.out.println(x);
        x--; // Уменьшаем полученное значение на 1
        System.out.println(x);
        */

        // 5. Условные операторы
        Scanner num = new Scanner(System.in);
        /* System.out.print("Введите с клавиатуры целое число: ");
        int i = num.nextInt(); // Переменная, в которую помещается первое введенное значение
        if (i != 100) {
            System.out.println("Введенное Вами значение не равно 100");
        } else {
            System.out.println("Вами введено значение 100");
            }
            */

        /* System.out.println("Укажите Ваш возраст: ");
        int i = num.nextInt(); // Переменная, в которую помещается введенное значение
        if (i < 10) {
            System.out.println("Вы ещё ребёнок");
        }
        if (i >= 10 && i < 18) {
            System.out.println("Вы подросток");
        }
        if (i >= 18) {
            System.out.println("Вы уже взрослый");
        }
        */

        /* System.out.println("Укажите Ваш рост в см: ");
        int l = num.nextInt(); // Переменная, в которую помещается введенное значение
        if (l > 160 && l < 190) {
            System.out.println("Вы нам подходите"); // Выполняется, если рост больше 160, но мньше 190 см
        }
        else if (l >= 140 && l < 160) {
            System.out.println("Может Вам в танкисты?"); // Если не выполняется первое условие, но рост от 140 до 159 см
        }
        else if (l == 160) {
            System.out.println("Вы нам подходите, это минимальное значение"); // Если не выполняется первое условие, но рост равен 160 см
        }
        else if (l == 190) {
            System.out.println("Вы нам подходите, это максимальное значение"); // Если не выполняется первое условие, но рост равен 190 см
        }
        else {
            System.out.println("Таких не берут в космонавты"); // Если не выполняются предыдущие условия
        }

        switch (l) {
            case 160:
                System.out.println("Рост 160 см"); // Выводится дополнительно, если рост 160 см
                break;
            case 190:
                System.out.println("Рост 190 см"); // Выводится дополнительно, если рост 190 см
                break;
            default:
                System.out.println("Решение принято!"); // Выводится дополнительно при значениях, отличных от 160 и 190 см
        }
        */

        // Дополнительно потренеруемся с оператором "switch":
        // Scanner num = new Scanner(System.in);
        System.out.print("Введите с клавиатуры двузначное число, равное двум десяткам: ");
        int i = num.nextInt(); // Переменная, в которую помещается введенное значение

        if (i == 20) {
            System.out.println("Верное значение"); // Выполняется при i = 20
        }
        else {
            System.out.println("Не верное значение"); // Выполняется при i != 20
        }

        switch (i) {
            case 20:
                System.out.println("Это число 20"); // Выполняется при i = 20
                break;
            default:
                System.out.println("Подумайте ещё"); // Выполняется при i != 20
        }

    }
}
