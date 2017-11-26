package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MyUserProject myUserProject1 = new MyUserProject();  // Создан экземпляр класса

        myUserProject1.имяПользователя();                   // определяем имя пользователя
        myUserProject1.тематикаТестирования();              // выводится тема теста
        myUserProject1.времяНачалаТеста();                  // определяем время начала тестирования

        // Начало отсчета
        long start = System.currentTimeMillis();
        System.out.println();

        //-------------------------------------выполнение программы---------------------------------------------

        QuestionApp questionApp = new QuestionApp();

        questionApp.show1();
        questionApp.result1();

        questionApp.show2();
        questionApp.result2();

        questionApp.show3();
        questionApp.result3();

        //--------------------------------окончание выполнения программы----------------------------------------

        myUserProject1.времяОкончанияТеста();               // определяем время окончания тестирования

        // Получение и запись в переменную timeWork времени выполнения теста
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения теста на экран
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");

    }
}
