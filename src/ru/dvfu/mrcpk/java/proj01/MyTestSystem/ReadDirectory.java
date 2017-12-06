package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadDirectory {
    public static void main(String[] args) throws FileNotFoundException {
        File pathDir = null;
        String[] pathsFAD;

        try {
            // создание нового объекта file
            pathDir = new File("Раздел 1/");

            // массив файлов и папок
            pathsFAD = pathDir.list();

            for(String path:pathsFAD){
                // вывод списка файлов и каталогов
                System.out.println(path);
            }
        }catch (Exception e){
            // если произошла ошибка
            e.printStackTrace();
        }
    }
}
