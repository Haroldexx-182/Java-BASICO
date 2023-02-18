module com.example.tecnicas_de_refactoring {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tecnicas_de_refactoring to javafx.fxml;
    exports com.example.tecnicas_de_refactoring;
}