module com.example.if_else {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.if_else to javafx.fxml;
    exports com.example.if_else;
}