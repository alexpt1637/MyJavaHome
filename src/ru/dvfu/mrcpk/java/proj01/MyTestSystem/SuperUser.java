package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SuperUser extends Main {

    public SuperUser() {                            // Создан родительский класс
        String Имя;                                 // Поля (свойства) родительского класса
        int НомерПользователя;
        Date ВремяНачалаТеста, date1, date2, timeTest, time1, time2, dateNull, start;
        int v;
    }

    public void имяПользователя() throws IOException {                  // Метод, определяющий имя пользователя

        File file = new File("name.txt");                  // Запись сведений в файл, создание объекта класса File
        file.createNewFile();                              // Создание файла
        FileWriter writer = new FileWriter(file);          // Создание объекта FileWriter

        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя и нажмите Enter: ");
        String Имя = in.nextLine();
        System.out.println("Имя пользователя: " + Имя);
        writer.write("Имя пользователя: " + Имя);
        writer.flush();
        writer.close();
        // --> передача информации в класс или метод, определяющий результаты тестирования
    }

    public long времяНачалаТеста(){                 // Метод, определяющий время начала тестирования
        long curDate = System.currentTimeMillis();
        Date date1 = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон даты/времени
        sdf.applyPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Время начала теста: " + sdf.format(date1));       // dd-MM-yyyy HH:mm 08-11-2017 15:21

        // Начала отсчета
        long start = System.currentTimeMillis();
        return start;
    }

    public Date времяОкончанияТеста(){                 // Метод, определяющий время окончания тестирования
        long curDate = System.currentTimeMillis();
        Date date2 = new Date(curDate);
        SimpleDateFormat sdf = new SimpleDateFormat();

        // Передаем новый шаблон даты/времени
        sdf.applyPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println("Время окончания теста: " + sdf.format(date2));       // dd-MM-yyyy HH:mm 08-11-2017 15:21
        return date2;
    }

    // Временный метод, имитирующий выполнение программы тестирования
    public void имитацияТеста(){
        Scanner in = new Scanner(System.in);
        System.out.println("Для имитации выполнения программы введите целое число и нажмите Enter: ");
        int i = in.nextInt();
        System.out.println("Для имитации выполнения программы Вы ввели целое число: " + i);
    }

   public void раздел(){
       System.out.println("----------------------------------------------------------------------");
   }

   public void тематикаТестирования() throws FileNotFoundException {
       // Обращаемся к созданному нами файлу "nameTest"
       File file = new File("nameTest");
       // Обращаемся к классу Scanner, считываем содержимое файла
       Scanner scanner = new Scanner(file);
       String line = scanner.nextLine();
       // Выводим на экран тему тестирования
       System.out.println("Тема теста: " + line);
   }
}
