module com.example.bucles_for {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bucles_for to javafx.fxml;
    exports com.example.bucles_for;
}