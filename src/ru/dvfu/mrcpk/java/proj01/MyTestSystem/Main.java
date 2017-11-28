package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        MyUserProject myUserProject1 = new MyUserProject();  // Создан экземпляр класса

        myUserProject1.имяПользователя();                   // определяем имя пользователя
        myUserProject1.тематикаТестирования();              // выводится тема теста
        myUserProject1.времяНачалаТеста();                  // определяем время начала тестирования

        // Начало отсчета
        long start = System.currentTimeMillis();
        System.out.println();

        //-------------------------------------выполнение теста---------------------------------------------

        QuestionApp questionApp = new QuestionApp();

        questionApp.v1();
        questionApp.v2();
        questionApp.v3();
        questionApp.v4();
        questionApp.v5();

        //--------------------------------окончание выполнения теста----------------------------------------

        myUserProject1.времяОкончанияТеста();               // определяем время окончания тестирования

        // Получение и запись в переменную timeWork времени выполнения теста
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения теста на экран
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");

        long timeTest = 60 * 1000;

        if (timeWork <= timeTest){
            questionApp.оценка();
        } else {
            System.out.println("Вы не уложились в установленное время");
        }
    }
}
