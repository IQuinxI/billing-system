package ma.emsi.billingsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private ImageView ImageViewBackground;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("/Fxml/Login.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}