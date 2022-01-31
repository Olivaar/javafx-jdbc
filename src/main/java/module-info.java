module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxjdbc to javafx.fxml;
    exports com.example.javafxjdbc;
    exports com.example.javafxjdbc.gui;
    opens com.example.javafxjdbc.gui to javafx.fxml;
}