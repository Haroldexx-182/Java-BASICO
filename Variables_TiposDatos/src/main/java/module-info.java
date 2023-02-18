module com.example.variables_tiposdatos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.variables_tiposdatos to javafx.fxml;
    exports com.example.variables_tiposdatos;
}