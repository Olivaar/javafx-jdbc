module com.example.javafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxjdbc to javafx.fxml;
    exports com.example.javafxjdbc;
    exports com.example.javafxjdbc.gui;
    opens com.example.javafxjdbc.gui to javafx.fxml;
    opens com.example.javafxjdbc.model.entities to javafx.graphics, javafx.fxml, javafx.base;
}