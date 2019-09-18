package AdminUI.fxmlControllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LogoFXMLController implements Initializable {

    @FXML
    private ImageView image;

    @FXML
    private JFXButton confirmButton;

    @FXML
    void confirmButtonClick(MouseEvent event) {

        //TODO:
        //Процедура авторизации
        boolean authorized = true;
        if (authorized) {
            try {
                Stage stage = (Stage) confirmButton.getScene().getWindow();
                stage.close();

                Parent root = FXMLLoader.load(getClass().getResource("/fxml/AdminScene.fxml"));
                Scene scene = new Scene(root);
                Stage stage2 = new Stage();
                stage2.setScene(scene);
                stage2.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(25), image);
        rotateTransition.setByAngle(9*360);
        rotateTransition.play();
    }
}
