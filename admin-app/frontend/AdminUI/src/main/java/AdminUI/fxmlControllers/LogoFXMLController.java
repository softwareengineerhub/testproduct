package AdminUI.fxmlControllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import com.app.DaoImpl;
import com.app.DaoImplService;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LogoFXMLController implements Initializable {

    @FXML
    private ImageView image;

    @FXML
    private JFXPasswordField passField;

    @FXML
    private JFXTextField loginField;

    @FXML
    private JFXButton confirmButton;

    @FXML
    private Label infoLabel;




    DaoImplService daoImplService = new DaoImplService();
    DaoImpl dao = daoImplService.getDaoImplPort();

    @FXML
    void confirmButtonClick(MouseEvent event) {

        try {
            if (dao.authentication(loginField.getText(), passField.getText()) == true) {

                Stage stage = (Stage) confirmButton.getScene().getWindow();
                stage.close();

                Parent root = FXMLLoader.load(getClass().getResource("/fxml/AdminScene.fxml"));
                Scene scene = new Scene(root);
                Stage stage2 = new Stage();
                stage2.setScene(scene);
                stage2.show();
            }else{
                infoLabel.setText("Wrong login or Password");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(25), image);
        rotateTransition.setByAngle(9 * 360);
        rotateTransition.play();
    }
}
