package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTest {
    public static void main(String[] args) throws IOException {

        /*QuestionApp questionApp = new QuestionApp();

        questionApp.v1();
        questionApp.v2();
        questionApp.v3();
        questionApp.v4();
        questionApp.v5();
        questionApp.оценка();*/

        FileInputStream stream = new FileInputStream("Раздел 1/Вопросы 2.txt");
        // далее считываем данные из файла, для чего:
        int length = stream.available();        // вычисляем длину файла 'length'
        byte[] data = new byte[length];         // создаем байтовый массив подходящей длины, указываем его длину [length]
        stream.read(data);                      // прочитаем содержимое файла в память

        // преобразовываем байтовые данные в текст, для чего:
        String text = new String(data);         // Создаем объект типа String и в конструкторе указываем считанные из файла данные (data)
//        System.out.println(text);

        // делим массив на строки, создав для этого цикл
        String[] lines = text.split("\n");
        for (String line : lines){              // for (Тип имя : имя массива)
            System.out.println(line);
            //
        }
    }
}