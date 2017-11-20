package ru.dvfu.mrcpk.java.proj01.MyClassUser;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SuperUser extends Main {

    public SuperUser() {                            // Создадим родительский класс
        String Имя;                                 // Поля (свойства) родительского класса
        int НомерПользователя;
        Data ВремяНачалаТеста;
    }

    public void времяНачалаТеста(){                 // Создадим метод, определяющий время начала тестирования
        long curDate = System.currentTimeMillis();
        Date date = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон
        sdf.applyPattern("dd-MM-yyyy HH:mm");
        System.out.println("Время начала теста: " + sdf.format(date));       // dd-MM-yyyy HH:mm 08-11-2017 15:21
    }


}
