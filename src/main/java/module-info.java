module com.example.chatappproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.chatappproject to javafx.fxml;
    exports com.example.chatappproject;
}