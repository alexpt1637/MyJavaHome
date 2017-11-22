package ru.dvfu.mrcpk.java.proj01.MyClassUser;

import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        MyUserProject myUserProject1 = new MyUserProject();  // Создан экземпляр дочернего класса

        myUserProject1.имяПользователя();                   // определяем имя пользователя
        myUserProject1.времяНачалаТеста();                  // определяем время начала тестирования

        // Начало отсчета
        long start = System.currentTimeMillis();

        /*myUserProject1.началоОтсчета();*/

        myUserProject1.раздел();

        //--------------------------------имитации выполнения программы-----------------------------------------
        myUserProject1.имитацияТеста();                     // имитации выполнения программы
        //--------------------------------имитации выполнения программы-----------------------------------------

        myUserProject1.раздел();

        myUserProject1.времяОкончанияТеста();               // определяем время окончания тестирования

        /*myUserProject1.времяТеста();*/                    // Не получилось получить время!!!!!!!!!!!

        // Получение и запись в переменную timeWork времени выполнения теста
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения теста на экран
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");

    }
}
