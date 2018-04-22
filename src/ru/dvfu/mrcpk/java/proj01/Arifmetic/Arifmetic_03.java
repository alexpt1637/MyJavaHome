package ru.dvfu.mrcpk.java.proj01.Arifmetic;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Arifmetic_03 {
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

        /* System.out.println("Введите с клавиатуры первое дробное число: ");
        float a = in.nextFloat();       // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры второе дробное число: ");
        float b = in.nextFloat();       // Переменная, в которую сохраняется введенное значение.

        // float a = 12.23f, b = 45.56f;    // Проверочные рассчетные значения.

        float a1 = a * 100 % 100;
        float b1 = b * 100 % 100;
        // System.out.println(a1);
        // System.out.println(b1);

        float d = (a1 + b1) / 100, c = a + b - d;
        System.out.println("Сумма целых частей двух чисел: " + c); // Сумма дробных частей двух чисел
        System.out.println("Сумма дробных частей двух чисел: " + d); // Сумма дробных частей двух чисел
        */

        // 4. Пользователь вводит с клавиатуры массу в тоннах (дробное число).
        // Вывести по отдельности количество тонн, килограмм, грамм (например, ввести 126.456789т - получить и вывести 126т 456кг 789г)

        /* System.out.println("Введите с клавиатуры массу в тоннах (дробное число): ");
        double m = in.nextDouble();   // Переменная, в которую сохраняется вводимое значение

        // double m = 126.456789;               // Проверочное значение

        int t = (int) m;
        double kg1 = (m - t) * 1000;
        int kg = (int) kg1;
        double g1 = (kg1 - kg) * 1000;
        int g = (int) g1;

        System.out.print("В введенной массе: ");
        System.out.print(t + " т ");
        System.out.print(kg + " кг ");
        System.out.print(g + " г");
        */

        // 5. Пользователь вводит с клавиатуры время в секундах.
        // Перевести это значение в дни, часы, минуты и секунды. Например, 43512 секунд – это 12 часов, 5 минут и 12 секунд.

        /* System.out.println("Введите с клавиатуры время в секундах: ");
        // int sec = in.nextInt();       // Переменная, в которую сохраняется введенное значение.

        int sec = 1256112;
        int d = (sec / (60 * 60 * 24)) % 24;
        int h = (sec / (60 * 60)) % 24;
        int m = (sec / 60) % 60;
        int s = sec % 60;

        System.out.println("Значение в днях, часах, минутах и секундах:");
        System.out.println("Дней: " + d);
        System.out.println("Часов: " + h);
        System.out.println("Минут: " + m);
        System.out.println("Секунд: " + s);
        */

        // 6. Пользователь вводит с клавиатуры расстояние до аэропорта (в километрах, может быть вещественное значение) и время,
        // за которое нужно доехать (в минутах). Вычислить скорость (км/ч), с которой нужно ехать.

        // double l = 50, mm = 90;  // Проверочные значения

        /* System.out.println("Введите с клавиатуры расстояние до аэропорта (в километрах): ");
        double l = in.nextInt();       // Переменная, в которую сохраняется введенное значение.
        System.out.println("Введите с клавиатуры время, за которое нужно доехать (в минутах): ");
        double mm = in.nextInt();       // Переменная, в которую сохраняется введенное значение.

        double hh = (mm / 60) % 60, S = l / hh;

        System.out.println("Скорость (км/ч), с которой нужно ехать: " + S);
        */

        // 18. Какая дата будет через N дней? Рекомендуется использование типа GregorianCalendar.

        // Дополнительно вывод дня недели даты на экран

        /* String date = "07.11.2017";

        // Переводим строку в дату
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Вывод дня недели даты на экран
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
        */

        // 18. Какая дата будет через N дней? Рекомендуется использование типа GregorianCalendar.

        long curDate = System.currentTimeMillis();
        Date date = new Date(curDate);
        // System.out.println(curDate);        // Получаем текущее значение даты и времени в миллисекундах
        // Задаем значение lond для N-го числа дней
        System.out.println("Введите с клавиатуры число дней: ");
        long N = in.nextInt();              // Сохраняем в переменной N введенное пользователем значение
        long Nms = N * 1000 * 60 * 60 * 24; // Переводим введенное количество дней в миллисекунды
        long msDate = curDate + Nms;        // Добавляем их к текущему значению даты и времени в миллисекундах

        // Класс SimpleDateFormat позволяет форматировать любые пользовательские шаблоны для даты и времени
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");      // Задаем шаблон для даты

        // Проводим преобразование в нужный нам формат даты и времени
        System.out.println("Через указанное количество дней наступит " + sdf.format(msDate));
    }
}