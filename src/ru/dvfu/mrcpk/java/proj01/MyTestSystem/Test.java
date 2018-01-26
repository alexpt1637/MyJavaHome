package ru.dvfu.mrcpk.java.proj01.MyTestSystem;


import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test
{
    public int i = 5;
    public static void main(String args[])
    {
        class Foo
        {
            public int i = 3;
        }
        Object o = (Object)new Foo();
        Foo foo = (Foo)o;
        System.out.println("i = " + foo.i);
    }
}








