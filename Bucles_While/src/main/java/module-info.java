module com.example.bucles_while {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bucles_while to javafx.fxml;
    exports com.example.bucles_while;
}