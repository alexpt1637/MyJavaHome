package ru.dvfu.mrcpk.java.proj01.myInterface;

import java.io.FileNotFoundException;

public interface TestIf {

    // Название теста
    String nameTest = new String();


    // Текст вариантов вопросов
    String textQuestion = new String();

    // Текст вариантов ответов
    String textOption = new String();

    void result();
    void show() throws FileNotFoundException;
}
