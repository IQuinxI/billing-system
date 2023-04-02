package ma.emsi.billingsystem.Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import ma.emsi.billingsystem.DB.Instancer;
public class LoginController {


    Instancer instancer = new Instancer();

    @FXML
    private TextField TFEmail;
    @FXML
    private TextField TFPassword;

    @FXML
    private void BtnLogin() {

        boolean response = instancer.client.isClient(TFEmail.getText(), TFPassword.getText());

        Dialog<String> dialog = new Dialog<String>();
        ButtonType type = new ButtonType("Ok", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().add(type);

        if(response) {
            dialog.setTitle("Login");
            dialog.setContentText("logged in successfully");
        }else {
            dialog.setTitle("Error");
            dialog.setContentText("Wrong email or username");
        }

        dialog.showAndWait();

    }
}

