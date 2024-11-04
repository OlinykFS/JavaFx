package org.example.javafxtest.navControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.javafxtest.Routers.SceneRouter;

public class NavigationController {
    @FXML
    public void switchToMenu(ActionEvent event) {
        SceneRouter.getInstance().switchToMenu();
    }
}
