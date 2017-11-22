package ru.dvfu.mrcpk.java.proj01.MyClassUser;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyUserProject extends SuperUser {  // Создан дочерний класс от родительского

    long start;

    public Long началоОтсчета(){
        // Начало отсчета
        long start = System.currentTimeMillis();
        return start;
    }

    public void времяТеста(){
        // Получение и запись в переменную timeWork времени работы программы
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения работы кода на экран
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");
    }


/*    // Временный метод, имитирующий выполнение программы тестирования
    public void имитацияТеста2(){
        SuperUser superUser1 = new SuperUser();
        // SuperUser superUser2 = new SuperUser();

        superUser1.имитацияТеста();
        // superUser2.имитацияТеста();
    }*/

}
