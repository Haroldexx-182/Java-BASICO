module com.example.io_standar {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.io_standar to javafx.fxml;
    exports com.example.io_standar;
}