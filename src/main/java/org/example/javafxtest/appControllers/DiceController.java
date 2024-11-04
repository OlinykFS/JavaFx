package org.example.javafxtest.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;

public class DiceController {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("@/org/example/javafxtest/Views/DiceView.fxml"));
    @FXML
    private Label label;
}
