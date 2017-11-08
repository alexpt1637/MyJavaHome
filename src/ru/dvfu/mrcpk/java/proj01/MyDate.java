package ru.dvfu.mrcpk.java.proj01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        /* Date date = new Date();         // Объявлен и создан класс Date (конструктор по умолчанию)
        System.out.println(date);       // Вывод текущего значения в формате 'Wed Nov 08 12:53:54 VLAT 2017' - вывод метки времени когда объект был создан
        */

        // after(Date when)             // Метод сравнивает дату с текущей                  'boolean'
        // before(Date when)            // Метод сравнивает дату с текущей как и after()    'boolean'
        // clone()                      // Метод клонирует дату, создает другой объект с текущим значением 'Object'
        // compareTo(Date anotherDate)  // Метод сортировки значения по дате                'int'
        // equals(Object obj)           // Метод сравнивает две даты на идентичность        'boolean'
        // detTime()                    // Возвращает значение в миллисекундах              'long'
        // toInstant()
        // toString()                   // Представление в строковом формате                'String'
        // setTime(long time)           //      'void'

        // Ссылка по SimpleDateFormat() - https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        // Получим текущее время в миллисекундах
        long curDate = System.currentTimeMillis();
        Date date = new Date(curDate);
        // System.out.println(curDate);        // Вывод текущего значения в миллисекундах '1510113893366'
        // System.out.println(date);           // Вывод текущего значения в стандартном виде
        // System.out.println(date.getTime()); // Возвращает значение в миллисекундах '1510113893366'

        // System.out.println("Выведем текущее значение в стандартном виде: " + date);

        // Подключим SimpleDateFormat

        /*
         G	Целеуказатель эпохи	            Текст	                AD
         y	Год	                            Год	                    1996; 96
         Y	Неделя в году	                Год	                    2009; 09
         M	Месяц в году	                Месяц	                July; Jul; 07
         w	Недель в год	                Количество	            27
         W	Недель в месяце	                Количество	            2
         D	День в году	                    Количество	            189
         d	День в месяце	                Количество	            10
         F	День недели в месяце	        Количество	            2
         E	Название дня недели	            Текст	                Tuesday; Tue
         u	Номер дня недели (1 = понедельник, ..., 7 = воскресенье)	Количество	1
         a	АМ/ПМ маркер	                Текст	                PM
         H	В час дня (0-23)	            Количество	            0
         k	Час в сутках (1-24)	            Количество	            24
         K	В час утра/вечера (0-11)	    Количество	            0
         h	В час утра/вечера (1-12)	    Количество	            12
         m	Минута в часе	                Количество	            30
         s	Секунда в минуте	            Количество	            55
         S	Миллисекундный	                Количество	            978
         z	Часовой пояс	Общие           Часовой пояс	        Pacific Standard Time; PST; GMT-08:00
         Z	Часовой пояс	Зоны с RFC 822 раз	-0800
         X	Часовой пояс	Зоны времени ISO 8601	-08; -0800; -08:00
         */

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy - MM - dd HH:mm:ss:SSS");

        // Проводим преобразование в нужный нам формат даты и времени
        System.out.println("default pattern " + date);                          // default pattern Wed Nov 08 15:10:01 VLAT 2017
        System.out.println("yyyy - MM - dd HH:mm:ss:SSS " + sdf.format(date));   // yyyy - MM - dd HH:mm:ss:SS 2017 - 11 - 15:10:01:711

        // Передаем новый шаблон
        sdf.applyPattern("dd-MM-yy HH:mm");
        System.out.println("dd-MM-yy HH:mm " + sdf.format(date));       // dd-MM-yy HH:mm 08-11-17 15:21
    }
}
