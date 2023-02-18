module com.example.sobrecargafunciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sobrecargafunciones to javafx.fxml;
    exports com.example.sobrecargafunciones;
}