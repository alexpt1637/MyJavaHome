package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class QuestionsTest {

    int n = 0, m = 0;   // Начальные значения переменных для рассчета оценки
    int k = n + 1;      // Начальное значение номера вопроса
    double p;           // Переменная для размещения процента верных ответов
    int R = 1;          // Номер раздела тестирования

    public int show() throws IOException {

        String path = "Раздел " + R + "/Вопрос №" + k;
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

    public void rating() {
        System.out.println("Всего дано ответов: " + m + ", дано верных ответов: " + n);
        double p = (double)n / (double)m * 100;
        System.out.println("Вы набрали " + (int)p + " баллов");

        if (p <= 40){
            System.out.println("Ваша оценка \"неудовлетворительно\"");
        } else if (p <= 60){
            System.out.println("Ваша оценка \"удовлетворительно\"");
        } else if (p <= 80){
            System.out.println("Ваша оценка \"хорошо\"");
        } else {
            System.out.println("Ваша оценка \"отлично\"");
        }
    }
}
