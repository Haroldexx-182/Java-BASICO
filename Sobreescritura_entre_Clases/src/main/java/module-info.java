module com.example.sobreescritura_entre_clases {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sobreescritura_entre_clases to javafx.fxml;
    exports com.example.sobreescritura_entre_clases;
}