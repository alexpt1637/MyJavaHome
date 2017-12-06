package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class QuestionApp extends Question {

    int n = 0, m = 0;   // Начальные значения переменных для рассчета оценки
    int k = n++;
    double p;           // Переменная для размещения процента верных ответов

    public int show1() throws FileNotFoundException {

        File files = new File("Раздел 1/Вопрос №1");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        m++;
        return m;
    }

    public int show2() throws FileNotFoundException {

        File files = new File("Раздел 1/Вопрос №2");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        m++;
        return m;
    }

    public int show3() throws FileNotFoundException {

        File files = new File("Раздел 1/Вопрос №3");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        m++;
        return m;
    }

    public int result1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 1){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 3) {
            System.out.print("Нет такого значения. ");
            result1();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        return n;
    }

    public int result2() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 2){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 3) {
            System.out.print("Нет такого значения. ");
            result2();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        return n;
    }

    public int result3() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 3){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 3) {
            System.out.print("Нет такого значения. ");
            result3();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        return n;
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

    public int show4() throws FileNotFoundException {

        File files = new File("Раздел 1/Вопрос №4");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        m++;
        return m;
    }

    public int result4() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 2){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 4) {
            System.out.print("Нет такого значения. ");
            result4();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        return n;
    }

    public void v4() throws FileNotFoundException {
        show4();
        result4();
    }

    // *** "Вопрос №5" ***

    public int show5() throws FileNotFoundException {

        File files = new File("Раздел 1/Вопрос №5");
        Scanner scanner = new Scanner(files);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        System.out.println();
        m++;
        return m;
    }

    public int result5() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер ответа и нажмите Enter: ");
        int i = in.nextInt();

        if (i == 4){
            System.out.println("Ваш ответ верный");
            n++;
        } else if (i <= 0 || i > 5) {
            System.out.print("Нет такого значения. ");
            result5();
        } else {
            System.out.println("Ваш ответ не верный");
        }
        System.out.println();
        return n;
    }

    public void v5() throws FileNotFoundException {
        show5();
        result5();
    }

    public void оценка(){
        System.out.println("Дано верных ответов: " + n);
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
