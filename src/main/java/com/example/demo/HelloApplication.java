package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    static Stage  MainStage;
    static int Height = 500;
    static int Width = 800;
    static String DarkTheme;
    @Override
    public void start(Stage stage) throws IOException {
        MainStage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Width,Height );
        stage.setTitle("OopGram");
        stage.setScene(scene);

        Image image = new Image("C:\\Users\\mhmeh\\Desktop\\oop project\\demo\\src\\main" +
                "\\resources\\icons8-instagram-40.png");

        stage.getIcons().add(image);
        stage.setResizable(false);
        stage.show();
    }

    public static Stage getMainStage() {
        return MainStage;
    }

    public static void main(String[] args) {
        launch();
    }
}