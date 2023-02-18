module com.example.notacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.notacion to javafx.fxml;
    exports com.example.notacion;
}