module com.example.interfaces {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.interfaces to javafx.fxml;
    exports com.example.interfaces;
}