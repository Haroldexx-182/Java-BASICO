module com.example.polimorfismo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.polimorfismo to javafx.fxml;
    exports com.example.polimorfismo;
}