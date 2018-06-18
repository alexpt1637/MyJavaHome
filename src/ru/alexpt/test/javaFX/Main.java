package ru.alexpt.test.javaFX;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;
import ru.dvfu.mrcpk.java.proj01.MyTestSystem.Test;

public class Main extends Application {

    // в методе main, чтобы запустить само приложение JavaFX, представленное классом Application, вызывается метод launch():
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {   // передается объект Stage, который представляет пользовательский интерфейс
        // На десктопах Stage будет представлять графическое окно
        // При запуске приложения среда JavaFX будет вызывать данный метод (start) и передавать в него объект Stage

        // установка надписи
        Text text = new Text("Hello from JavaFX!");
        // мы используем визуальный компонент javafx.scene.text.Text, который представляет простую текстовую надпись
        // При создании элемента Text мы можем передать ему выводимый текст, а также настроить его положение с помощью его методов:
        text.setLayoutY(80);    // установка положения надписи по оси Y
        text.setLayoutX(100);   // установка положения надписи по оси X

        // Все визуальные элементы, которые мы хотим отобразить в Stage, помещаются в объект javafx.scene.Scene или на сцену.
        // Scene - это контейнер верхнего уровня для всех графических элементов. Однако напрямую в Scene объект Text мы поместить не можем.
        // Класс Scene предусматривает установку корневого элемента или контейнера, который содержит все остальные элементы.

        // Таким образом, вначале элемент Text помещается в элемент Group, который представляет контейнер для группы элементов.
        // Затем элемент Group устанавливается в качестве корневого элемента Scene. И в конце элемент Scene устанавливается для объекта Stage.
        Group group = new Group(text);      // создание и установка группы элементов
        Scene scene = new Scene(group);     // создание сцены
        primaryStage.setScene(scene);              // установка сцены для объекта Stage

        // В конце метода start мы можем настроить объект Stage, например, задать заголовок окна, а также его размеры:
        primaryStage.setTitle("First Application");// установка заголовка окна
        primaryStage.setWidth(300);                // установка ширины окна
        primaryStage.setHeight(250);               // установка длины окна
        primaryStage.show();                       // отображаем окно на экране устройства
        // С помощью метода show объект Stage отображается на экране устройства
        primaryStage.toBack();              // перемещает окно на задний план
    }
}
