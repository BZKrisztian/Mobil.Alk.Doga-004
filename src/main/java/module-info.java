module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires transitive java.sql;

    
    opens com.example.controllers to javafx.fxml;


    opens com.example to javafx.fxml;
    exports com.example;
}
