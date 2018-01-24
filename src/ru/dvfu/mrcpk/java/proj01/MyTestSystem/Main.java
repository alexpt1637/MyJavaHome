package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        MyUserProject myUserProject = new MyUserProject();  // Создан экземпляр класса
        QuestionsTest questionsTest = new QuestionsTest();
//        QuestionApp questionApp = new QuestionApp();      // Не используется, только на начальном этапе разработки

        myUserProject.имяПользователя();                    // определяем имя пользователя
        questionsTest.nameTest();                           // выводится тема теста

        //---------------------------определяем количество вопросов в тесте---------------------------------
        // раздел включен временно для упрощения тестирования работы программы (сокращения времени на пробный запуск)

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество вопросов в тесте (до 10): ");
        int v = in.nextInt();

        if (v > 10){
            System.out.println("Неверное количество вопросов, пожалуйста перезапустите тест");
            return;
        }

        //----------------------------определяем время начала тестирования----------------------------------

        myUserProject.времяНачалаТеста();                  // определяем время начала тестирования

        // Начало отсчета
        long start = System.currentTimeMillis();
        System.out.println();

        //-------------------------------------выполнение теста---------------------------------------------

        for (int i = 0; i < v; i++) {
            questionsTest.show();
            questionsTest.result();
        }

        //--------------------------------окончание выполнения теста----------------------------------------

        myUserProject.времяОкончанияТеста();               // определяем время окончания тестирования

        // Получение и запись в переменную timeWork времени выполнения теста
        long timeWork = System.currentTimeMillis() - start;

        // Передаем новый шаблон времени
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("mm:ss");

        // Вывод времени выполнения теста на экран и запись в файл
        System.out.println("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");

        File file = new File("time.txt");                  // Запись сведений в файл, создание объекта класса File
        file.createNewFile();                              // Создание файла
        FileWriter writer = new FileWriter(file);          // Создание объекта FileWriter

        long timeTest = v * 10 * 1000;

        if (timeWork <= timeTest){
            questionsTest.rating();
            writer.write("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)");
            writer.flush();
            writer.close();
        } else {
            questionsTest.antirating();
            System.out.println("Вы не уложились в установленное время");
            writer.write("Время выполнения теста: " + sdf.format(timeWork) + " (минут:секунд)\nВы не уложились в установленное время");
            writer.flush();
            writer.close();
        }
    }
}
