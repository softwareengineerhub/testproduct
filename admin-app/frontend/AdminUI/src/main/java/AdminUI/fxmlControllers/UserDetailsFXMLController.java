package AdminUI.fxmlControllers;

import com.app.ws.api.Users;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.soap.client.SoapService;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class UserDetailsFXMLController implements Initializable {

    private Users user;

    @FXML
    private JFXTextField loginTextField;

    @FXML
    private JFXTextField emailTextField;

    @FXML
    private JFXTextField roleTextField;

    @FXML
    private JFXPasswordField passwordField;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonCancel;

    private SoapService soapService = new SoapService();

    @FXML
    void buttonCancelClicked(MouseEvent event) {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void buttonSaveClicked(MouseEvent event) {
        //TODO: save command
        if (user == null) {
            //TODO: здесь вызов метода "add"
           // user = new Users(100, loginTextField.getText(), emailTextField.getText(), passwordField.getText(), roleTextField.getText());
            user = new Users();
            user.setRole(roleTextField.getText());
            user.setLogin(loginTextField.getText());
            user.setPassword(passwordField.getText());
            user.setEmail(emailTextField.getText());
            soapService.addUser(user);
            updateData();

        } else {

            //TODO: здесь вызов метода "update"
            user.setEmail(emailTextField.getText());
            user.setLogin(loginTextField.getText());
            user.setPassword(passwordField.getText());
            user.setRole(roleTextField.getText());
            soapService.updateUsersByUsername(user);
            updateData();

        }

        Stage stage = (Stage) buttonSave.getScene().getWindow();
        stage.close();
    }

    private void updateData() {
        List<Users> users= soapService.readAllUsers();
        AdminFXMLController.usersData.clear();
        AdminFXMLController.usersData.addAll(users);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    void initData(Users user) {
        this.user = user;
        loginTextField.setText(user.getLogin());
        passwordField.setText(user.getPassword());
        emailTextField.setText(user.getEmail());
        roleTextField.setText(user.getRole());
    }
}
