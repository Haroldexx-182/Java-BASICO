module com.example.retorno_funcion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.retorno_funcion to javafx.fxml;
    exports com.example.retorno_funcion;
}