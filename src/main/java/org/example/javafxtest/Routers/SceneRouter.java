package org.example.javafxtest.Routers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneRouter {
    private static SceneRouter instance;
    private Stage primaryStage;
    private SceneRouter() {

    }
    private static SceneRouter getInstance(){
        if(instance == null){
            instance = new SceneRouter();
        }
        return instance;
    }

    public void SetPrimaryStage(Stage stage){
        this.primaryStage = stage;
    }
    public void SwitchToMenu(){
        switchScene("Views/Menu-View.fxml", "Menu");
    }
    public void SwitchToCalculator(){
        switchScene("Views/Calculator-View.fxml", "Calculator");
    }
    private void switchScene(String fxmlPath, String title){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
            Scene scene = new Scene(fxmlLoader.load(), 400,500);
            primaryStage.setScene(scene);
            primaryStage.setTitle(title);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
