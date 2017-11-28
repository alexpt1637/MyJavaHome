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
            System.out.println("Ваш ответ не верный. Нет такого значения");
            result1();
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
            System.out.println("Нет такого значения. Нет такого значения");
            result2();
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
            System.out.println("Нет такого значения. Нет такого значения");
            result3();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }

    public void v1() throws FileNotFoundException {
        show1();
        result1();
    }

    public void v2() throws FileNotFoundException {
        show2();
        result2();
    }

    public void v3() throws FileNotFoundException {
        show3();
        result3();
    }

    // *** "Вопрос №4" ***

    public void show4() throws FileNotFoundException {

        File files = new File("Вопрос №4");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
    }

    public void result4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 2){
            System.out.println("Ваш ответ верный");
        } else if (i <= 0 || i > 4) {
            System.out.println("Ваш ответ не верный. Нет такого значения");
            result4();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }

    public void v4() throws FileNotFoundException {
        show4();
        result4();
    }

    // *** "Вопрос №5" ***

    public void show5() throws FileNotFoundException {

        File files = new File("Вопрос №5");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
    }

    public void result5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 4){
            System.out.println("Ваш ответ верный");
        } else if (i <= 0 || i > 5) {
            System.out.println("Ваш ответ не верный. Нет такого значения");
            result5();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
    }

    public void v5() throws FileNotFoundException {
        show5();
        result5();
    }
}
