module com.example.sentencias_switch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sentencias_switch to javafx.fxml;
    exports com.example.sentencias_switch;
}