package com.example.controllers;

import java.io.IOException;

import com.example.App;
import com.example.management.DataSource;
import com.example.management.Numbers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcSceneController {

    @FXML
    private Button goBackButton_Calc;

    @FXML
    private Button calcButton;

    @FXML
    private TextField lengthInputArea;
    
    @FXML
    private TextField radiusInputArea;
        
    @FXML
    private TextField resultArea;
            
    @FXML
    void onClickGoBack2Main_2(ActionEvent event) throws IOException {
        App.setRoot("mainScene");
    }

    @FXML
    void onClickExecuteCalc(ActionEvent event) {
        try {
            tryexecuteCalc();
        } catch (Exception e) {
            resultArea.setText("Invalid input. Please enter numbers. >:c");
        }        
    }

    private void tryexecuteCalc(){
        double radius = Double.parseDouble(radiusInputArea.getText());
        double length = Double.parseDouble(lengthInputArea.getText());

        double surfaceArea = 2*Math.PI*radius*(radius+length);
        resultArea.setText(String.format("%.2f", surfaceArea));

        Numbers number = new Numbers();
        number.setRadius((double) radius);
        number.setLength((double) length);
        number.setSurface((double) surfaceArea);
        DataSource.createNumber(number);
    }


}
