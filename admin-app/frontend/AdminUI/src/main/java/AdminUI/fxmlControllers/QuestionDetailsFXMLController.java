package AdminUI.fxmlControllers;

import AdminUI.model.Question;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class QuestionDetailsFXMLController  implements Initializable {

    private Question question;

    @FXML
    private JFXTextField questionTextField;

    @FXML
    private JFXTextField a1TextField;

    @FXML
    private JFXTextField a3TextField;

    @FXML
    private JFXTextField a2TextField;

    @FXML
    private JFXTextField a4TextField;

    @FXML
    private JFXTextField correctTextField;

    @FXML
    private JFXButton buttonSave;

    @FXML
    private JFXButton buttonCancel;

    @FXML
    void buttonCancelClicked(MouseEvent event) {
        Stage stage = (Stage) buttonCancel.getScene().getWindow();
        stage.close();
    }

    @FXML
    void buttonSaveClicked(MouseEvent event) {
        //TODO: save command
        if (question == null) {
            //TODO: command create
            //id & author_id
            question = new Question(100, questionTextField.getText(), a1TextField.getText(), a2TextField.getText(), a3TextField.getText(), a4TextField.getText(), correctTextField.getText(), 1);
        } else {
            //TODO: command update
            question.setA1(a1TextField.getText());
            question.setA2(a2TextField.getText());
            question.setA3(a3TextField.getText());
            question.setA4(a4TextField.getText());
            question.setQuestion(questionTextField.getText());
            question.setCorrect(correctTextField.getText());
        }
        Stage stage = (Stage) buttonSave.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    void initData(Question question) {
        this.question = question;
        questionTextField.setText(question.getQuestion());
        a1TextField.setText(question.getA1());
        a2TextField.setText(question.getA2());
        a3TextField.setText(question.getA3());
        a4TextField.setText(question.getA4());
        correctTextField.setText(question.getCorrect());
    }
}
