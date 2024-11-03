package org.example.javafxtest;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {
    @FXML
    private TextField display;

    private double firstOperand = 0;
    private String Operator = "";
    private boolean startNewNumber = true;

    @FXML
    public void onNumberButtonClick(ActionEvent event) {
        if (startNewNumber) {
            display.clear();
            startNewNumber = false;
        }
        Button button = (Button) event.getSource();
        display.appendText(button.getText());
    }
    @FXML
    public void onOperatorButtonClick(ActionEvent event) {
        firstOperand = Double.parseDouble(display.getText());
        Button button = (Button) event.getSource();
        Operator = button.getText();
        startNewNumber = true;
    }

    @FXML
    public void onClearButtonClick(ActionEvent event) {
        display.clear();
        firstOperand = 0;
        Operator = "";
        startNewNumber = true;
    }
    @FXML
    public void onEqualsButtonClick(ActionEvent event) {
        double SecondOperand = Double.parseDouble(display.getText());
        double result;

        switch (Operator) {
            case "+":
                result = firstOperand + SecondOperand;
                break;
            case "-":
                result = firstOperand - SecondOperand;
                break;
            case "*":
                result = firstOperand * SecondOperand;
                break;
            case "/":
                if(SecondOperand == 0){
                    display.setText("shodi na nol nelzia");
                    return;
                }
                result = firstOperand / SecondOperand;
                break;
            default:
                return;
        }
        display.setText(String.valueOf(result));
        startNewNumber = true;
    }
}