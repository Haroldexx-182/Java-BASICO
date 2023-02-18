module com.example.arrays {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.arrays to javafx.fxml;
    exports com.example.arrays;
}