package com.example.controllers;

import java.io.IOException;

import com.example.App;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AboutSceneController {

    @FXML
    private Button goBackButton_About;

    @FXML
    void onClickGoBack2Main(ActionEvent event) throws IOException {
        App.setRoot("mainScene");
    }

}
