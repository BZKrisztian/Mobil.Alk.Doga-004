package com.example.controllers;

import java.io.IOException;

import com.example.App;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainSceneController {

    @FXML
    private Button aboutPageButton;

    @FXML
    private Button calcPageButton;

    @FXML
    private Button exitButton;

    @FXML
    void onClickExit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void onClickGetAbout(ActionEvent event) throws IOException {
        App.setRoot("aboutScene");
    }

    @FXML
    void onClickGoCalcPage(ActionEvent event) throws IOException {
        App.setRoot("calcScene");
    }

}
