package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuestionsTest {

    int n = 0, m = 0;   // Начальные значения переменных для рассчета оценки
    int k = n + 1;      // Начальное значение номера вопроса
    double p;           // Переменная для размещения процента верных ответов
//    int R;              // Номер раздела тестирования
    int a = 1;          // Начальное значение диапазона - "от"
    int b = 3;          // Конечное значение диапазона - "до"

    int R = a + (int) (Math.random() * b);  // Генерация номера раздела тестирования

    public void nameTest() throws IOException {

        // выводим тему тестирования, обращаемся к файлу "nameTest" в нужном нам разделе
        String section = "Раздел " + R + "/nameTest";           // Тематика тестирования
        File fileSection = new File(section);
        // Обращаемся к классу Scanner, считываем содержимое файла
        Scanner scanner = new Scanner(fileSection);
        String line = scanner.nextLine();
        // Выводим на экран тему тестирования
        System.out.println("Тема теста: " + line);
    };

    public int show() throws IOException {

        // обращаемся к файлам, содержащим вопросы для тестирования в нужном нам разделе
        String path = "Раздел " + R + "/Вопрос №" + k;         // Выбор вопроса
        File file = new File(path);
        FileInputStream stream = new FileInputStream(file);
        int length = stream.available();
        byte[] data = new byte[length];         // создаем байтовый массив подходящей длины, указываем его длину [length]
        stream.read(data);                      // прочитаем содержимое файла в память

        // преобразовываем байтовые данные в текст, для чего:
        String text = new String(data);         // Создаем объект типа String и в конструкторе указываем считанные из файла данные (data)
        System.out.println(text);

        System.out.println();
        k++;
        return k;
    }

    public void result() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        //----------начало чтения ответов из файла----------
        String answer = "Раздел " + R + "/Ответы";              // Выбор номера правильного ответа
        FileInputStream stream = new FileInputStream(answer);
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

        Float a = Float.valueOf(lines[m]);
        float b = a.floatValue();
        System.out.println(b);                  // для контроля вывода верного ответа после считывания

        //----------окончание чтения ответов из файла----------

        if (i == b){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 5) {
            System.out.print("Нет такого значения. ");
            result();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        m++;
//        System.out.println("n = " + n + ", m = " + m);    // контрольные значения для рассчета оценки
    }

    //----------оценка выполения теста----------



    public void rating() throws IOException {

        File file = new File("notes.txt");                 // Запись сведений в файл, создание объекта класса File
        file.createNewFile();                              // Создание файла
        FileWriter writer = new FileWriter(file);          // Создание объекта FileWriter

        System.out.println("Всего дано ответов: " + m + ", дано верных ответов: " + n);
        writer.write("Всего дано ответов: " + m + ", дано верных ответов: " + n + "\n");
        double p = (double)n / (double)m * 100;
        System.out.println("Вы набрали " + (int)p + " баллов");
        writer.write("Вы набрали " + (int)p + " баллов\n");

        if (p <= 40){
            System.out.println("Ваша оценка \"неудовлетворительно\"");
            writer.write("Ваша оценка \"неудовлетворительно\"");
            writer.flush();
            writer.close();
        } else if (p <= 60){
            System.out.println("Ваша оценка \"удовлетворительно\"");
            writer.write("Ваша оценка \"удовлетворительно\"");
            writer.flush();
            writer.close();
        } else if (p <= 80){
            System.out.println("Ваша оценка \"хорошо\"");
            writer.write("Ваша оценка \"хорошо\"");
            writer.flush();
            writer.close();
        } else {
            System.out.println("Ваша оценка \"отлично\"");
            writer.write("Ваша оценка \"отлично\"");
            writer.flush();
            writer.close();
        }
    }

    public void antirating() throws IOException {

        File file = new File("notes.txt");                 // Запись сведений в файл, создание объекта класса File
        file.createNewFile();                              // Создание файла
        FileWriter writer = new FileWriter(file);          // Создание объекта FileWriter

        writer.write("Вы не уложились в установленное время");
        writer.flush();
        writer.close();
        }
    }
