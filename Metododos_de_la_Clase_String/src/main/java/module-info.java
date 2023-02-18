module com.example.metododos_de_la_clase_string {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.metododos_de_la_clase_string to javafx.fxml;
    exports com.example.metododos_de_la_clase_string;
}