module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;
    requires java.sql;
    opens ma.emsi.billingsystem to javafx.fxml;

    opens ma.emsi.billingsystem.Controllers to javafx.fxml;


    exports ma.emsi.billingsystem;
    exports ma.emsi.billingsystem.Controllers;
    exports ma.emsi.billingsystem.Controllers.Admin;
    exports ma.emsi.billingsystem.Controllers.Client;


}