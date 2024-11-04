package org.example.javafxtest;

import javafx.application.Application;
import javafx.stage.Stage;
import org.example.javafxtest.Routers.SceneRouter;

public class JavaFxApplication extends Application {
    @Override
    public void start(Stage stage) {
        SceneRouter sceneRouter = SceneRouter.getInstance();
        sceneRouter.setPrimaryStage(stage);
        sceneRouter.switchToMenu();
    }

    public static void main(String[] args) {
        launch();
    }
}
