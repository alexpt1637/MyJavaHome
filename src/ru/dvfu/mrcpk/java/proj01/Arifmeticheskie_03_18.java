package ru.dvfu.mrcpk.java.proj01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Arifmeticheskie_03_18 {
    public static void main(String[] args) {
// 18. Какая дата будет через N дней? Рекомендуется использование типа GregorianCalendar.
        Scanner in = new Scanner(System.in);

        /*Days days1 = new Days();
        System.out.println("Введите с клавиатуры число дней: ");
        days1.N = in.nextInt();              // Сохраняем в переменной N введенное пользователем значение
        days1.times();*/

        Days days2 = new Days();
        days2.N = 0;
        days2.times();
    }
}

class Days {
    long N;

    void times(){
        long curDate = System.currentTimeMillis();
        Date date = new Date(curDate);
        // System.out.println(curDate);        // Получаем текущее значение даты и времени в миллисекундах
        // Задаем значение lond для N-го числа дней

        long Nms = N * 1000 * 60 * 60 * 24; // Переводим введенное количество дней в миллисекунды
        long msDate = curDate + Nms;        // Добавляем их к текущему значению даты и времени в миллисекундах

        // Класс SimpleDateFormat позволяет форматировать любые пользовательские шаблоны для даты и времени
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");      // Задаем шаблон для даты

        // Проводим преобразование в нужный нам формат даты и времени
        if (N > 0){
            System.out.println("Через указанное количество дней наступит " + sdf.format(msDate));
        } else if (N == 0) {
            System.out.println("Сегодня " + sdf.format(msDate));
        } else {
            System.out.println("Указанное количество дней назад было " + sdf.format(msDate));
        }

    }
}
