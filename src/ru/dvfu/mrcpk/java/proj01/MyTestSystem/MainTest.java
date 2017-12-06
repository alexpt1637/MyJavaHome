package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.FileNotFoundException;
import java.io.IOException;

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

        QuestionsTest questionsTest = new QuestionsTest();
        QuestionApp questionApp = new QuestionApp();

        for (int i = 0; i < 7; i++) {
            questionsTest.show();
            questionsTest.result();
        }
        questionsTest.rating();
    }
}