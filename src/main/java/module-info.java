module com.example.uvdn3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.uvdn3 to javafx.fxml;
    exports com.example.uvdn3;
}