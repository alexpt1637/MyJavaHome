package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import ru.dvfu.mrcpk.java.proj01.myInterface.TestIf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question implements TestIf {

    //Текст вопроса
    String textQuestion;

    @Override
    public void result() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 2){
            System.out.println("Ваш ответ верный");
        } else {
            System.out.println("Ваш ответ не верный");
        }

    }

    @Override
    public void show() throws FileNotFoundException {

        // Обращаемся к созданному нами файлу "nameTest"
        File file = new File("Вопрос №1");
        // Обращаемся к классу Scanner, считываем содержимое файла
        Scanner scanner = new Scanner(file);
        // Выводим на экран текст вопроса
        // цикл, считывающий все строки в файле
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

            // закрываем входной поток сканера
            scanner.close();
        }
    }
}
