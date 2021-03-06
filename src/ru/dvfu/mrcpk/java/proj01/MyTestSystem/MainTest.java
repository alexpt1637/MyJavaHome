package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        // ---------- По отдельным файлам для вопросов ----------

        /*QuestionApp questionApp = new QuestionApp();
        questionApp.v1();
        questionApp.v2();
        questionApp.v3();
        questionApp.v4();
        questionApp.v5();
        questionApp.оценка();*/

        // ---------- Чтение одного файла для всех вопросов ----------

        /*int r = 4;

        FileInputStream stream = new FileInputStream("Раздел 1/Ответы");
        // далее считываем данные из файла, для чего:
        int length = stream.available();        // вычисляем длину файла 'length'
        byte[] data = new byte[length];         // создаем байтовый массив подходящей длины, указываем его длину [length]
        stream.read(data);                      // прочитаем содержимое файла в память

        // преобразовываем байтовые данные в текст, для чего:
        String text = new String(data);         // Создаем объект типа String и в конструкторе указываем считанные из файла данные (data)
//        System.out.println(text);

        // делим массив на строки, создав для этого цикл
        String[] lines = text.split("\n");
//        for (String line : lines){              // for (Тип имя : имя массива)
//            System.out.println(line);
//        }
        System.out.println(lines[r]);*/

        // ---------- Пробуем следующий вариант ---------- УДАЧНЫЙ ---------- из него делаем метод!

        /*int k = 1;

        String path = "Раздел 1/Вопрос №" + k;

        File file = new File(path);
//        System.out.println(file);

//        Scanner scanner = new Scanner(file);
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        FileInputStream stream = new FileInputStream(file);
        int length = stream.available();
        byte[] data = new byte[length];         // создаем байтовый массив подходящей длины, указываем его длину [length]
        stream.read(data);                      // прочитаем содержимое файла в память

        // преобразовываем байтовые данные в текст, для чего:
        String text = new String(data);         // Создаем объект типа String и в конструкторе указываем считанные из файла данные (data)
        System.out.println(text);*/

        // ---------- Отрабатываем методы тестирования ----------

        /*QuestionsTest questionsTest = new QuestionsTest();
        QuestionApp questionApp = new QuestionApp();

        for (int i = 0; i < 7; i++) {
            questionsTest.show();
            questionsTest.result();
        }
        questionsTest.rating();*/

        // ---------- Отрабатываем запись сведений в файл -------------

        /*File file = new File("notes.txt");                 // Создание объекта класса File
        file.createNewFile();                              // Создание файла
        FileWriter writer = new FileWriter(file);*/          // Создание объекта FileWriter

        // Запись содержимого в файл

        /*String testWrite = "Это простой пример, в котором мы осуществляем\nс помощью языка Java запись в файл.\n\nЧтение из файла отработаем дополнительно.\n";

        writer.write(testWrite);
        writer.flush();
        writer.close();

        System.out.println(testWrite);  // Выводим записанный текст в консоль для контроля*/

        /*String testWrite2 = "Это изменённый текст для тестирования записи в файл";

        writer.write(testWrite2);
        writer.flush();
        writer.close();

        System.out.println(testWrite2);  // Выводим записанный текст в консоль для контроля*/

        //--------------------------- Генерация номера раздела тестирования ------------------------------

        // Random test
        /*int a = 1;          // Начальное значение диапазона - "от"
        int b = 3;          // Конечное значение диапазона - "до"

        int R = a + (int) (Math.random() * b);  // Генерация номера раздела тестирования

        System.out.println("Номер выбранного раздела: " + R);

        writer.write("Номер выбранного раздела: " + R);
        writer.flush();
        writer.close();*/

        // ---------------------------- Количество дней между датами --------------------------------------

        String date1 = "21092009";
        String date2 = "21092010";

        SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy");
        Scanner in = new Scanner(System.in);

        System.out.println("Введите дату в формате \"ddMMyyyy\": ");
        long date3 = in.nextLong();

        Date dateOne = null;    // в данную переменную записываем значение, полученное после преобразования
        Date dateTwo = null;
        Date dateThree = null;

        try {
            dateOne = format.parse(date1);
            dateTwo = format.parse(date2);
            dateThree = format.parse(String.valueOf(date3));
        } catch (Exception e) {
            e.printStackTrace();
        }

        //---------------------- Количество дней между датами в миллисекундах ---------------------------------

        long difference = dateThree.getTime() - dateOne.getTime();

        System.out.println("Количество дней между датами в миллисекундах: " + difference);

        //-------------- Перевод количества дней между датами из миллисекунд в дни ----------------------------

        int days =  (int)(difference / (24 * 60 * 60 * 1000)); // миллисекунды / (24ч * 60мин * 60сек * 1000мс)
        // Вывод разницы между датами в днях на экран
        System.out.println(days + " дн.");

        int yars = days / 365;
//        System.out.println(yars + " лет");

        int months = (days - yars * 365) / 30;
        System.out.println("Страховой стаж: " + yars + " лет " + months + " мес.");

        //-----------------------------------------------------------------------------------------------------



    }
}