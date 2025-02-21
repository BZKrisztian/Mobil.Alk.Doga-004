package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
    
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("mainScene"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        try {
            trySetRoot(fxml);
        } catch (Exception e) {
            System.err.println("Failed to load properly. :c" + fxml);
            System.err.println(e.getMessage());
        }
    }
    public static void trySetRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        String resourcepath = "/com/example/" + fxml + ".fxml";
        URL url = App.class.getResource(resourcepath);
        if (url == null) {
            throw new IOException("Couldn't find " + resourcepath);
        }
        FXMLLoader fxmlLoader = new FXMLLoader(url);
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        Application.launch();
    }

}