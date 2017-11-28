package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException {

        QuestionApp questionApp = new QuestionApp();

        questionApp.v1();
        questionApp.v2();
        questionApp.v3();
        questionApp.v4();
        questionApp.v5();

        questionApp.оценка();
    }
}
