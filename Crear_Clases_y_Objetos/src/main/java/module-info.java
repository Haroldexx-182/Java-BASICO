module com.example.crear_clases_y_objetos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crear_clases_y_objetos to javafx.fxml;
    exports com.example.crear_clases_y_objetos;
}