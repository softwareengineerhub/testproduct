package AdminUI.fxmlControllers;

import AdminUI.model.Question;
import AdminUI.model.Users;
import com.jfoenix.controls.JFXButton;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminFXMLController implements Initializable {

    private ObservableList<Users> usersData = FXCollections.observableArrayList();
    private ObservableList<Question> questionsData = FXCollections.observableArrayList();

    @FXML
    private Label labelUsers;

    @FXML
    private Label labelQuestions;

    @FXML
    private AnchorPane usersPane;

    @FXML
    private JFXButton buttonRemoveUser;

    @FXML
    private JFXButton buttonAddUser;

    @FXML
    private JFXButton buttonEditUser;

    @FXML
    private AnchorPane questionsPane;

    @FXML
    private TableView<Users> usersTable;

    @FXML
    private TableColumn<Users, Integer> idColumn;

    @FXML
    private TableColumn<Users, String> loginColumn;

    @FXML
    private TableColumn<Users, String> passwordColumn;

    @FXML
    private TableColumn<Users, String> emailColumn;

    @FXML
    private TableColumn<Users, String> roleColumn;

    @FXML
    private TableView<Question> questionsTable;

    @FXML
    private TableColumn<Question, Integer> idColumnQuestion;

    @FXML
    private TableColumn<Question, String> questionColumnQuestion;

    @FXML
    private TableColumn<Question, String> a1ColumnQuestion;

    @FXML
    private TableColumn<Question, String> a2ColumnQuestion;

    @FXML
    private TableColumn<Question, String> a3ColumnQuestion;

    @FXML
    private TableColumn<Question, String> a4ColumnQuestion;

    @FXML
    private TableColumn<Question, String> correctColumnQuestion;

    @FXML
    private TableColumn<Question, String> authorColumnQuestion;

    @FXML
    private JFXButton buttonAddQuestion;

    @FXML
    private JFXButton buttonEditQuestion;

    @FXML
    private JFXButton buttonRemoveQuestion;

    @FXML
    void buttonAddQuestionClicked(MouseEvent event) {
        //TODO: add Question command
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/QuestionDetailsScene.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void buttonRemoveQuestionClicked(MouseEvent event) {
        //TODO: remove Question command
        Question question = questionsTable.getSelectionModel().getSelectedItem();
        questionsData.remove(question);
    }

    @FXML
    void buttonEditQuestionClicked(MouseEvent event) {
        //TODO: update Question command
        Question question = questionsTable.getSelectionModel().getSelectedItem();
        if (question != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/QuestionDetailsScene.fxml"));
                Stage stage = new Stage(StageStyle.DECORATED);
                stage.setScene(new Scene((Pane) loader.load()));

                QuestionDetailsFXMLController controller = loader.<QuestionDetailsFXMLController>getController();
                controller.initData(question);

                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void buttonAddUserClicked(MouseEvent event) {
        //TODO: add command
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/UserDetailsScene.fxml"));

            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void buttonRemoveUserClicked(MouseEvent event) {
        //TODO: remove command
        Users user = usersTable.getSelectionModel().getSelectedItem();
        usersData.remove(user);
    }

    @FXML
    void buttonEditUserClicked(MouseEvent event) {
        //TODO: update command
        Users user = usersTable.getSelectionModel().getSelectedItem();
        if (user != null) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/UserDetailsScene.fxml"));
                Stage stage = new Stage(StageStyle.DECORATED);
                stage.setScene(new Scene((Pane) loader.load()));

                UserDetailsFXMLController controller = loader.<UserDetailsFXMLController>getController();
                controller.initData(user);

                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    void labelQuestionsClicked(MouseEvent event) {
        usersPane.setVisible(false);
        questionsPane.setVisible(true);
    }

    @FXML
    void labelUsersClicked(MouseEvent event) {
        usersPane.setVisible(true);
        questionsPane.setVisible(false);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        usersPane.setVisible(false);
        questionsPane.setVisible(false);

        initData();
        initializeUsersTable();
        initializeQuestionsTable();
    }

    private void initData() {
        //TODO: get all data from DB

        usersData.add(new Users(1, "Alex",  "qwerty", "alex@mail.com","admin"));
        usersData.add(new Users(2, "Bob", "dsfsdfw",  "bob@mail.com","user"));
        usersData.add(new Users(3, "Jeck", "dsfdsfwe", "Jeck@mail.com", "user"));
        usersData.add(new Users(4, "Mike", "iueern",  "mike@mail.com","user"));
        usersData.add(new Users(5, "colin", "woeirn",  "colin@mail.com","user"));

        questionsData.add(new Question(1, "в каком году появился язык программирования java?", "1992", "1993", "1994", "1995", "1995", usersData.get(0).getId()));
        questionsData.add(new Question(2, "в каком году появился язык программирования C Sharp?", "2001", "2002", "2000", "2003", "2000", usersData.get(1).getId()));
    }

    private void initializeUsersTable() {

        idColumn.setCellValueFactory(new PropertyValueFactory<Users, Integer>("id"));
        loginColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("login"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("password"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("email"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<Users, String>("role"));

        usersTable.setItems(usersData);

    }

    private void initializeQuestionsTable() {

        idColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, Integer>("id"));
        questionColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("question"));
        a1ColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("a1"));
        a2ColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("a2"));
        a3ColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("a3"));
        a4ColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("a4"));
        correctColumnQuestion.setCellValueFactory(new PropertyValueFactory<Question, String>("correct"));

        questionsTable.setItems(questionsData);

    }
}
