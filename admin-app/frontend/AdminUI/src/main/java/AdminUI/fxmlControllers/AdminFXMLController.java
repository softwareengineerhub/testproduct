package AdminUI.fxmlControllers;

import AdminUI.business.Question;
import AdminUI.business.User;
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

    private ObservableList<User> usersData = FXCollections.observableArrayList();
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
    private TableView<User> usersTable;

    @FXML
    private TableColumn<User, Integer> idColumn;

    @FXML
    private TableColumn<User, String> loginColumn;

    @FXML
    private TableColumn<User, String> passwordColumn;

    @FXML
    private TableColumn<User, String> emailColumn;

    @FXML
    private TableColumn<User, String> roleColumn;

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
        User user = usersTable.getSelectionModel().getSelectedItem();
        usersData.remove(user);
    }

    @FXML
    void buttonEditUserClicked(MouseEvent event) {
        //TODO: update command
        User user = usersTable.getSelectionModel().getSelectedItem();
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

        usersData.add(new User(1, "Alex", "alex@mail.com", "qwerty", "admin"));
        usersData.add(new User(2, "Bob", "bob@mail.com","dsfsdfw",  "user"));
        usersData.add(new User(3, "Jeck", "Jeck@mail.com", "dsfdsfwe", "user"));
        usersData.add(new User(4, "Mike", "mike@mail.com","iueern",  "user"));
        usersData.add(new User(5, "colin", "colin@mail.com","woeirn",  "user"));

        questionsData.add(new Question(1, "в каком году появился язык программирования java?", "1992", "1993", "1994", "1995", "1995", usersData.get(0)));
        questionsData.add(new Question(2, "в каком году появился язык программирования C Sharp?", "2001", "2002", "2000", "2003", "2000", usersData.get(1)));
    }

    private void initializeUsersTable() {

        idColumn.setCellValueFactory(new PropertyValueFactory<User, Integer>("id"));
        loginColumn.setCellValueFactory(new PropertyValueFactory<User, String>("login"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<User, String>("password"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<User, String>("email"));
        roleColumn.setCellValueFactory(new PropertyValueFactory<User, String>("role"));

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
