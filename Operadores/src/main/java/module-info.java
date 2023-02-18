module com.example.operadores {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.operadores to javafx.fxml;
    exports com.example.operadores;
}