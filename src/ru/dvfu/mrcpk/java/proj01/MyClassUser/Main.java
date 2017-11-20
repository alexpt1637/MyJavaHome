package ru.dvfu.mrcpk.java.proj01.MyClassUser;

public class Main {
    public static void main(String[] args) {

        MyUserProject myUserProject = new MyUserProject();  // Создан экземпляр дочернего класса

        myUserProject.времяНачалаТеста();                   // Вызван унаследованный от родительского класса метод
    }
}
