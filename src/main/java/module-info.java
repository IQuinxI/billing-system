module com.example.test {
    requires javafx.controls;
    requires javafx.fxml;
    requires fontawesomefx;

    opens ma.emsi.billingsystem to javafx.fxml;

    exports ma.emsi.billingsystem;
    exports ma.emsi.billingsystem.Controllers;
    exports ma.emsi.billingsystem.Controllers.Admin;
    exports ma.emsi.billingsystem.Controllers.Client;


}