module com.example.comentarios_documentacion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.comentarios_documentacion to javafx.fxml;
    exports com.example.comentarios_documentacion;
}