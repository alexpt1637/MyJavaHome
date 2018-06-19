package ru.alexpt.test.javaFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainTwo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Button btn = new Button();
        btn.setText("Click!");

        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                btn.setText("You've clicked!");
            }
        });

        Group root = new Group(btn);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setWidth(250);
        primaryStage.setHeight(200);

        primaryStage.show();
    }
}
