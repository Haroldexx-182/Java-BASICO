module com.example.crear_nuevoproyecto {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crear_nuevoproyecto to javafx.fxml;
    exports com.example.crear_nuevoproyecto;
}