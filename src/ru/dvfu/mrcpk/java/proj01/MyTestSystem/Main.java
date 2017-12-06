package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        MyUserProject myUserProject = new MyUserProject();  // Создан экземпляр класса

        myUserProject.имяПользователя();                   // определяем имя пользователя
        myUserProject.тематикаТестирования();              // выводится тема теста

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество вопросов в тесте (пока до 7): ");
        int v = in.nextInt();

        if (v > 7){
            System.out.println("Неверное количество вопросов, перезапустите тест");
            return;
        }

        myUserProject.времяНачалаТеста();                  // определяем время начала тестирования

        // Начало отсчета
        long start = System.currentTimeMillis();
        System.out.println();

        //-------------------------------------выполнение теста---------------------------------------------

        QuestionApp questionApp = new QuestionApp();
        QuestionsTest questionsTest = new QuestionsTest();

        for (int i = 0; i < v; i++) {
            questionsTest.show();
            questionsTest.result();
        }

        //--------------------------------окончание выполнения теста----------------------------------------

        myUserProject.времяОкончанияТеста();               // определяем время окончания тестирования

        // Получение и запись в переменную timeWork времени выполнения теста
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения теста на экран
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");

        long timeTest = v * 10 * 1000;

        if (timeWork <= timeTest){
            questionsTest.rating();
        } else {
            System.out.println("Вы не уложились в установленное время");
        }
    }
}
