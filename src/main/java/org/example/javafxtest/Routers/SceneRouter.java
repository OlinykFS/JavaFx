package org.example.javafxtest.Routers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class SceneRouter {
    private static SceneRouter instance;
    private Stage primaryStage;


    private SceneRouter() {}

    public static SceneRouter getInstance() {
        if (instance == null) {
            instance = new SceneRouter();
        }
        return instance;
    }

    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    public void switchToMenu() {
        switchScene("/org/example/javafxtest/Views/Menu-View.fxml", "Меню");
    }

    public void switchToCalculator() {
        switchScene("/org/example/javafxtest/Views/Calculator-View.fxml", "Калькулятор");
    }

    public void switchToDice() {
        switchScene("/org/example/javafxtest/Views/Dice-View.fxml", "Кости");
    }

    private void switchScene(String fxmlPath, String title) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
            javafx.scene.Parent root = fxmlLoader.load();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle(title);

            primaryStage.centerOnScreen();
            primaryStage.show();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}