module com.example.clases_abstractas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clases_abstractas to javafx.fxml;
    exports com.example.clases_abstractas;
}