package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import ru.dvfu.mrcpk.java.proj01.myInterface.TestIf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionApp extends Question {

    public void show1() throws FileNotFoundException {

        File files = new File("Вопрос №1");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
    }

    public void show2() throws FileNotFoundException {

        File files = new File("Вопрос №2");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
    }

    public void show3() throws FileNotFoundException {

        File files = new File("Вопрос №3");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
    }

    public void result1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 1){
            System.out.println("Ваш ответ верный");
        } else if (i <= 0 || i > 3) {
            System.out.println("Нет такого значения");
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }

    public void result2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 2){
            System.out.println("Ваш ответ верный");
        } else if (i <= 0 || i > 3) {
            System.out.println("Нет такого значения");
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }

    public void result3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 3){
            System.out.println("Ваш ответ верный");
        } else if (i <= 0 || i > 3) {
            System.out.println("Нет такого значения");
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }
}
