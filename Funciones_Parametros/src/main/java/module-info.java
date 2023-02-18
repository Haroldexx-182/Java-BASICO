module com.example.funciones_parametros {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.funciones_parametros to javafx.fxml;
    exports com.example.funciones_parametros;
}