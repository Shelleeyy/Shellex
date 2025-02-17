module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    
    exports com.example;
    exports com.example.view to javafx.graphics;
} 