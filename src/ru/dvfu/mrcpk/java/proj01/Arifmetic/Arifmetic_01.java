package ru.dvfu.mrcpk.java.proj01.Arifmetic;

import java.util.Scanner;

public class Arifmetic_01 {
    public static void main(String[] args) {
        // 1. Ввести с клавиатуры натуральное число. Вывести на экран младший разряд числа.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры натуральное число и нажмите Enter: ");
        int x = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Младший разряд введенного числа равен: ");
        int y = x % 10;
        System.out.print(y);
        */
        // 2. Ввести с клавиатуры двузначное натуральное число. Вывести на экран количество десятков в нем.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры двузначное натуральное число и нажмите Enter: ");
        int i = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Количество десятков в введенном Вами числе равно: ");
        int j = i / 10;
        System.out.print(j);
        */
        // 3. Дано целое число n. Выведите следующее за ним четное число.
        // При решении этой задачи нельзя использовать условную инструкцию if и циклы.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры целое число n и нажмите Enter: ");
        int n = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Следующее за ним четное число равно: ");
        int m = n / 2, x = m * 2 + 2;
        System.out.print(x);
        */
        // 4. Написать программу, которая находит среднее арифметическое значение трёх вещественных чисел.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры первое вещественное число и нажмите Enter: ");
        double a = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры второе вещественное число и нажмите Enter: ");
        double b = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры третье вещественное число и нажмите Enter: ");
        double c = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Среднее арифметическое значение трёх вещественных чисел равно: ");
        double d = (a + b + c) / 3;
        System.out.print(d);
        */
        // 5. Написать программу, которая находит корень линейного уравнения ax + b = 0.
        // Корнем линейного уравнения называется значение переменной, при котором уравнение обращается в верное числовое равенство.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры значение a и нажмите Enter: ");
        double a = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры значение b и нажмите Enter: ");
        double b = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Корень линейного уравнения ax + b = 0 равен: ");
        double x = -b / a;
        System.out.print(x);
        */
        // 6. Пользователь вводит число и степень. Программа вычисляет указанную степень этого числа.
        // Bозведение числа в степень - это умножение этого числа на само себя столько раз в какой степени оно находится.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры возводимое в степень число и нажмите Enter: ");
        int a = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры значение степни и нажмите Enter: ");
        int b = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.printf("Число в указанной степени равно %.0f \n", Math.pow(a, b));
        */
        // 7. Написать программу, которая предлагает пользователю ввести радиус окружности, а затем считает площадь и длину этой окружности.
        // Число Pi задать в программе как вещественную константу: float Pi = 3.14f.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры радиус окружности r и нажмите Enter: ");
        float r = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        float Pi = 3.14f;
        System.out.print("Площадь круга с радиусом r равна: ");
        float s = Pi * r * r;
        System.out.println(s);
        System.out.print("Длина окружности с радиусом r равна: ");
        float l = 2 * Pi * r;
        System.out.print(l);
        */
        // 8. Написать программу, которая предоставляет пользователю возможность ввести с клавиатуры количество рублей,
        // и переводит его в доллары и евро.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Курсы ЦБ: USD 58.08; EUR 67.53");
        System.out.println("Введите с клавиатуры сумму в рублях, которую нужно перевести в доллары и евро и нажмите Enter: ");
        double r = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        double USD = 58.08, EUR = 67.53;
        System.out.print("Сумма в долларах равна USD: ");
        double ru = r / USD;
        System.out.printf("%.2f\n", ru);
        System.out.print("Сумма в евро равна EUR: ");
        double re = r / EUR;
        System.out.printf("%.2f\n", re);
        */
        // 9. Написать программу, которая переводит километры в сухопутные и морские мили.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры количество километров, которое нужно перевести в сухопутные и морские мили и нажмите Enter: ");
        double km = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        double sm = 1.609, mm = 1.852;
        System.out.print("Сухопутных миль: ");
        double sml = km / sm;
        System.out.printf("%.3f\n", sml);
        System.out.print("Морских миль: ");
        double mml = km / mm;
        System.out.printf("%.3f\n", mml);
        */
        // 10. Написать программу, которая находит процент P от суммы S.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры значение суммы S: ");
        double S = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры значение части от суммы S для рассчета процента: ");
        double ss = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        System.out.print("Процент P от суммы S равен: ");
        double P = S / 100 * ss;
        System.out.printf("%.2f\n", P);
        // При попытке ввести дробное значение суммы возникает ошибка "Exception in thread "main" java.util.InputMismatchException",
        // указывающая на исключение в потоке "main" Java.util.InputMismatchException.
        */
        // 11. Написать программу для определения диаметра окружности, которую можно получить из отрезка проволоки длиной Х
        // (X задает пользователь с клавиатуры, float Pi = 3.14f, X = 2 * Pi * R = Pi * D, D = X / Pi).
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры значение длины отрезка проволоки: ");
        float X = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        float Pi = 3.14f;
        System.out.println("Диаметр окружности из данного отрезка проволоки равен: ");
        float D = X / Pi;
        System.out.printf("%.2f\n", D);
        */
        // 12.	Написать программу, которая переводит указанное количество градусов по Цельсию
        // в градусы по шкале Фаренгейта, Кельвина, Реомюра и Делиля.
        // Затем реализовать перевод из градусов по Фаренгейту в градусы по Цельсию.
        /* Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры количество градусов по Цельсию: ");
        double C = in.nextInt(); // Переменная, в которую сохраняется введенное количество градусов по Цельсию.
        // точка таяния льда равна +32 °F, а точка кипения воды +212 °F. 1 °C = (212-32)/100 °F.
        System.out.println("Количество градусов по шкале Фаренгейта равно: ");
        double F = 32 + 1.8 * C;
        System.out.printf("%.1f\n", F);
        // точка таяния льда равна +273 °K. 1 °C = 1 °K.
        System.out.println("Количество градусов по шкале Кельвина равно: ");
        double K = 273 + C;
        System.out.printf("%.1f\n", K);
        */
        // 13.	Поменять местами значения переменных a и b,
        // сначала с использованием дополнительной третьей переменной, а затем – без.
        int a = 10;
        int b = 20; //Даны значения переменных a, b.
        System.out.println("Дано:   a = " + a);
        System.out.println("        b = " + b);
        System.out.println("Меняем местами значения переменных a и b,\n" +
                "сначала с использованием дополнительной третьей переменной:");
        int c = a; a = b; b = c;
        System.out.println("        a = " + a);
        System.out.println("        b = " + b);
        // Следующая часть задания:


        // Test (practice) немного потренеруемся с примитивными типами данных

        /* byte b = 123;           // 8 bit
        short sh = 12345;       // 16 bit
        int i = 12345678;       // 32 bit
        long l = 1234567890;    // 64 bit

        float f = 123.89f;      // 16 bit
        double d = 12345.78;    // 32 bit

        boolean t = true, fl = false;

        char ch = 'a';

        System.out.println("Выведем на экран: " + ch);
        */

        // Test (practice) немного потренеруемся с ссылочными типами данных
        // Строки

        /* String s1 = "Hello";    // String это по сути класс, s переменная, которая ссылается на экземпляр класса (объект) Hello!
        // Сложение строк
        String s2 = " ";
        String s3 = "John";
        String s4 = "!";

        System.out.println(s1 + s2 + s3 + s4); // или
        System.out.println("Hello" + " " + "John" + "!");
        */
    }

    public static class Arifmeticheskie_01_01 {
        public static void main(String[] args) {
            // 1. Ввести с клавиатуры натуральное число. Вывести на экран младший разряд числа.
            Scanner in = new Scanner(System.in);
            System.out.println("Введите с клавиатуры натуральное число и нажмите Enter: ");
            int x = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
            int y = x % 10;
            System.out.println("Младший разряд введенного с клавиатуры натурального числа равен: " + y);
        }
    }

    public static class Arifmeticheskie_01_13 {
        public static void main(String[] args) {
            // 13.	Поменять местами значения переменных a и b,
            // сначала с использованием дополнительной третьей переменной, а затем – без.
            int a = 10;
            int b = 20; //Даны значения переменных a, b.
            System.out.println("Дано:   a = " + a);
            System.out.println("        b = " + b);
            System.out.println("Меняем местами значения переменных a и b,\n" +
                    "сначала с использованием дополнительной третьей переменной:");
            int c = a; a = b; b = c;
            System.out.println("        a = " + a);
            System.out.println("        b = " + b);
            // Следующая часть задания:
        }
    }
}
