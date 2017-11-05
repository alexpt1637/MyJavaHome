package ru.dvfu.mrcpk.java.proj01;

public class MyArrays {

    public static void main(String[] args) {

        /* int number = 10;                    // примитивный тип данных -> целое число [10] в "коробке" number
        String str = "Hello! The Number: ";    // пример создания строки
        System.out.println(str + number);      // пример вывода строки и числа 10 на экран
        */

        // int[] number = new int[5];          // создан массив number -> [массив], ссылочный тип данных
                    // [5] - размер массива, массив пока не инициализирован (пустой), индексы его элементов 0 ... 4
        // System.out.println(number[0]);      // вывод на эеран первого элемента массива, видим "0" (по умолчанию)
        // System.out.println(number[4]);      // вывод на эеран пятого элемента массива, видим "0", т.к. массив пустой

        // Инициализация массива:
        /* for (int i = 0; i < number.length; i++){
            number[i] = i*12;
        }
        */
        /* for (int i = 0; i < number.length; i++){     // i = 0 - объявлена переменная, счетчик
                                                        // i < number.length - объявлена длина массива
                                                        //
            System.out.println(number[i]);      // вывод на эеран всех элементов массива
        }
        System.out.println();                   // отделим следующий пример пустой строкой
        int[] num = {1,2,3};                    // зададим массив с известными нам числами
        for (int i = 0; i < num.length; i++){
            System.out.println(num[i]);         // вывод на эеран всех элементов массива 1 2 3
        }
        System.out.println();                   // отделим следующий пример пустой строкой
            System.out.println(num[2]);         // вывод на эеран третьего элемента массива с индексом 2
        */

        String[] strings = new String[3];   // Создано 3 пустых ячеек массива strings
        strings[0] = "привет, ";
        strings[1] = "пока ";
        strings[2] = "я дома";
        /* System.out.print(strings[0]);
        System.out.print(strings[1]);
        System.out.print(strings[2]);
        */

        /* for (int i = 0; i<strings.length; i++) {
            System.out.print(strings[i]);
        }
        */

        for (String string:strings) {   // String - типданных, string - имя переменной (может быть любое), strings - имя массива
            System.out.print(string);   // вывод массива на экран в одну строку
        }
        System.out.println();           // отделим следующий пример пустой строкой

        // Выведем на экран сумму значений ячеек массива
        int[] num1 = {1,2,3};           // имеем массив с инициализированными значениями
        int sum = 0;                    // имеем переменную sum = 0
        for(int x:num1){
            sum = sum+x;                // на каждой операции цикла прибавляем следующее значение к предыдущему
        }
        System.out.println();           // отделим следующий пример пустой строкой
        System.out.println(sum);        // вывели на экран сумму значений в массиве

        System.out.println();           // отделим следующий пример пустой строкой
        
    }
}
