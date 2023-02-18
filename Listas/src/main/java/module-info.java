module com.example.listas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listas to javafx.fxml;
    exports com.example.listas;
}