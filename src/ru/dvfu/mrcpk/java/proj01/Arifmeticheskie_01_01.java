package ru.dvfu.mrcpk.java.proj01;

import java.util.Scanner;

public class Arifmeticheskie_01_01 {
    public static void main(String[] args) {
        // 1. Ввести с клавиатуры натуральное число. Вывести на экран младший разряд числа.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры натуральное число и нажмите Enter: ");
        int x = in.nextInt(); // Переменная, в которую сохраняется введенное значение.
        int y = x % 10;
        System.out.println("Младший разряд введенного с клавиатуры натурального числа равен: " + y);
    }
}
