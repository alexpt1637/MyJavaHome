package ru.dvfu.mrcpk.java.proj01.MyTestSystem;

import java.io.File;
import java.io.FileNotFoundException;

public class MainTest {
    public static void main(String[] args) throws FileNotFoundException {

        QuestionApp questionApp = new QuestionApp();

        /*questionApp.show1();
        questionApp.result1();*/

        /*questionApp.show2();
        questionApp.result2();

        questionApp.show3();
        questionApp.result3();*/

        questionApp.v1();
        questionApp.v2();
        questionApp.v3();
    }
}
