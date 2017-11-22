package ru.dvfu.mrcpk.java.proj01.MyClassUser;

public class Main {
    public static void main(String[] args) {

        MyUserProject myUserProject1 = new MyUserProject();  // Создан экземпляр дочернего класса

        myUserProject1.имяПользователя();                   // определяем имя пользователя
        myUserProject1.времяНачалаТеста();                  // определяем время начала тестирования

        // myUserProject1.имитацияТеста();                     // имитации выполнения программы
        myUserProject1.имитацияТеста2();                    // имитации выполнения программы из MyUserProject


        myUserProject1.времяОкончанияТеста();               // определяем время окончания тестирования

    }
}
