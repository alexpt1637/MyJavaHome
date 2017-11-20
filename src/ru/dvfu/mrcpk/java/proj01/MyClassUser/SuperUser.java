package ru.dvfu.mrcpk.java.proj01.MyClassUser;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SuperUser extends Main {

    public SuperUser() {                            // Создан родительский класс
        String Имя;                                 // Поля (свойства) родительского класса
        int НомерПользователя;
        Data ВремяНачалаТеста;
    }

    public void имяПользователя(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя и нажмите Enter: ");
        String Имя = in.nextLine();
        System.out.println("Имя пользователя: " + Имя);
    }

    public void времяНачалаТеста(){                 // Создан метод, определяющий время начала тестирования
        long curDate = System.currentTimeMillis();
        Date date = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон даты/времени
        sdf.applyPattern("dd-MM-yyyy HH:mm");
        System.out.println("Время начала теста: " + sdf.format(date));       // dd-MM-yyyy HH:mm 08-11-2017 15:21
    }


}
