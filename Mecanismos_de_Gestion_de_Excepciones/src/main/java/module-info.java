module com.example.mecanismos_de_gestion_de_excepciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mecanismos_de_gestion_de_excepciones to javafx.fxml;
    exports com.example.mecanismos_de_gestion_de_excepciones;
}