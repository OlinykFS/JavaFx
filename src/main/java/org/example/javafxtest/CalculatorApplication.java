package org.example.javafxtest;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Views/Calculator-View.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400,500);
        scene.getStylesheets().add(getClass().getResource("Styles/style.css").toExternalForm());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch();
    }
}