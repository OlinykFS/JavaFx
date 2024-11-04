package org.example.javafxtest.appControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.javafxtest.Routers.SceneRouter;

public class MenuController {

    @FXML
    private void onCalcButtonClick(ActionEvent event) {
        SceneRouter.getInstance().switchToCalculator();
    }
    @FXML
    private void onDiceButtonClick(ActionEvent event) {
        SceneRouter.getInstance().switchToDice();
    }
}
