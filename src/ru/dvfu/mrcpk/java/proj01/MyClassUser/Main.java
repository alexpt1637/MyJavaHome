package ru.dvfu.mrcpk.java.proj01.MyClassUser;

public class Main {
    public static void main(String[] args) {

        MyUserProject myUserProject1 = new MyUserProject();  // Создан экземпляр дочернего класса

        myUserProject1.имяПользователя();                   // Вызван унаследованный от родительского класса метод
        myUserProject1.времяНачалаТеста();                   // Вызван унаследованный от родительского класса метод
    }
}
