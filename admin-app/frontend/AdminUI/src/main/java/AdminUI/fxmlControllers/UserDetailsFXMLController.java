package AdminUI.fxmlControllers;


import com.app.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import ua.itea.app.dao.Dao;
import ua.itea.app.model.Users;

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

    @FXML
    private Label infoLabel;

    DaoImplService daoImplService = new DaoImplService();
    DaoImpl dao = daoImplService.getDaoImplPort();

    @FXML
    void buttonCancelClicked(MouseEvent event) {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void buttonSaveClicked(MouseEvent event) throws IllegalAccessException, InstantiationException {
        //TODO: save command
        if (user == null) {
            user = new Users(loginTextField.getText(), passwordField.getText(), emailTextField.getText(), roleTextField.getText());
            List<Users> uList = dao.readAllUsers();

            for (int i = 0; i < uList.size(); i++) {
                if (uList.get(i).getLogin().equals(user.getLogin())) {
                    infoLabel.setText("Such Login already exists");
                    return;
                }
            }

                dao.addUser(user);

        } else {
            user.setEmail(emailTextField.getText());
            user.setLogin(loginTextField.getText());
            user.setPassword(passwordField.getText());
            user.setRole(roleTextField.getText());
            UpdateUsersById.class.newInstance().setArg0(user);
            dao.updateUsersById(user);
        }
        Stage stage = (Stage) buttonSave.getScene().getWindow();
        stage.close();
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
