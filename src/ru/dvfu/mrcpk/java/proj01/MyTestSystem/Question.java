package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import ru.dvfu.mrcpk.java.proj01.myInterface.TestIf;

import java.io.FileNotFoundException;

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
