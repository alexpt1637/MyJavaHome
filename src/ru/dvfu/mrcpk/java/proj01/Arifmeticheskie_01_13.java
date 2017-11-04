package ru.dvfu.mrcpk.java.proj01;

public class Arifmeticheskie_01_13 {
    public static void main(String[] args) {
        // 13.	Поменять местами значения переменных a и b,
        // сначала с использованием дополнительной третьей переменной, а затем – без.
        int a = 10;
        int b = 20; //Даны значения переменных a, b.
        System.out.println("Дано:   a = " + a);
        System.out.println("        b = " + b);
        System.out.println("Меняем местами значения переменных a и b,\n" +
                "сначала с использованием дополнительной третьей переменной:");
        int c = a; a = b; b = c;
        System.out.println("        a = " + a);
        System.out.println("        b = " + b);
        // Следующая часть задания:
    }
}
