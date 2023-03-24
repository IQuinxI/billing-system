module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens ma.emsi.billingsystem to javafx.fxml;
    exports ma.emsi.billingsystem;
}