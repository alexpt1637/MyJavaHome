package ru.dvfu.mrcpk.java.proj01.MyClassUser;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SuperUser extends Main {

    public SuperUser() {                            // Создан родительский класс
        String Имя;                                 // Поля (свойства) родительского класса
        int НомерПользователя;
        Date ВремяНачалаТеста, date1, date2, timeTest, time1, time2;


    }

    public void имяПользователя(){                  // Метод, определяющий имя пользователя
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя и нажмите Enter: ");
        String Имя = in.nextLine();
        System.out.println("Имя пользователя: " + Имя);
        // --> передача информации в класс или метод, определяющий результаты тестирования
    }

    public void времяНачалаТеста(){                 // Метод, определяющий время начала тестирования
        long curDate = System.currentTimeMillis();
        Date date1 = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон даты/времени
        sdf.applyPattern("dd-MM-yyyy HH:mm");
        System.out.println("Время начала теста: " + sdf.format(date1));       // dd-MM-yyyy HH:mm 08-11-2017 15:21
    }

    public void времяОкончанияТеста(){                 // Метод, определяющий время окончания тестирования
        long curDate = System.currentTimeMillis();
        Date date2 = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон даты/времени
        sdf.applyPattern("dd-MM-yyyy HH:mm");
        System.out.println("Время окончания теста: " + sdf.format(date2));       // dd-MM-yyyy HH:mm 08-11-2017 15:21
    }

    // Временный метод, имитирующий выполнение программы тестирования
    public void имитацияТеста(){
        Scanner in = new Scanner(System.in);
        System.out.println("Для имитации выполнения программы введите целое число и нажмите Enter: ");
        int i = in.nextInt();
        System.out.println("Для имитации выполнения программы Вы ввели целое число: " + i);
    }

    public void времяТеста(){

    }

}
