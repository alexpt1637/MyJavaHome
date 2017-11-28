package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import ru.dvfu.mrcpk.java.proj01.myInterface.TestIf;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question implements TestIf {

    //Текст вопроса
    String textQuestion;

    @Override
    public void result() {
    }

    @Override
    public void show() throws FileNotFoundException {
    }
}
