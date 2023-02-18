module com.example.la_herencia {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.la_herencia to javafx.fxml;
    exports com.example.la_herencia;
}