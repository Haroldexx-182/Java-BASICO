module com.example.continue_y_break {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.continue_y_break to javafx.fxml;
    exports com.example.continue_y_break;
}