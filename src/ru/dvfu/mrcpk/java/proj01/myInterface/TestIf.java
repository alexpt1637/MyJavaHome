package ru.dvfu.mrcpk.java.proj01.myInterface;

import java.io.File;
import java.io.FileNotFoundException;

public interface TestIf {

    // Название теста
    String nameTest = "Космонавтика";

    // Текст вариантов вопросов
    String textQuestion = new String();

    // Текст вариантов ответов
    String textOption = new String();

    void result();
    void show() throws FileNotFoundException;
}