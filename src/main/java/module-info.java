module com.example.project4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens project4 to javafx.fxml;
    exports project4;
}