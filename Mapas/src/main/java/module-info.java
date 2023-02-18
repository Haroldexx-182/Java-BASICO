module com.example.mapas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mapas to javafx.fxml;
    exports com.example.mapas;
}