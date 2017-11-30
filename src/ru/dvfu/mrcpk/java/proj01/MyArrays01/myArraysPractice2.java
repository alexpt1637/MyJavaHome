package ru.dvfu.mrcpk.java.proj01.MyArrays01;

public class myArraysPractice2 {
    public static void main(String[] args) {

        int[] massiv = new int[10];                         // одномерный пустой массив
        int[][] table1 = new int[3][5];                     // двумерный пустой массив
        int[][] table2 = new int[][]{{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};  // двумерный заполненный массив

        // выводим на экран длину массива
        System.out.println("Длина массива: " + table2.length);

        // замена значения по индексу (присвоение)
        table2[1][3] = 0;

        // выводим на экран содержамое двумерного массива
        for (int i = 0; i <= 2; i++) {                      // пробег по строкам
            for (int j = 0; j <= 4; j++) {                  // пробег по столбцам, используется вложенный цикл
                System.out.print(table2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        showTriangle();
    }

    // двумерный несимметричный массив
    private static void showTriangle() {
        char[][] tArray = new char[5][];
        tArray[0] = new char[1];
        tArray[1] = new char[2];
        tArray[2] = new char[3];
        tArray[3] = new char[2];
        tArray[4] = new char[1];

        // заполнение всех элементов символом *
        for (int i = 0; i < tArray.length; i++){
            for (int j = 0; j < tArray[i].length; j++){
                tArray[i][j] = '*';
            }
        }

        // вывод на экран треугольника
        for (int i = 0; i < tArray.length; i++){
            for (int j = 0; j < tArray[i].length; j++){
                System.out.print(tArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
