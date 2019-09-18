package ua.itea.app.DAO;

import ua.itea.app.model.Question;
import ua.itea.app.model.Users;

import java.util.List;

public interface IDAO {

    public void addUser(Users user);

    public List<Users> readAllUsers();

    public void updateUsersById(Users user);

    public void deleteById(int id);

    public boolean authentication(String login, String password);

    public String roleOfUser(int id);

    public void addQuestion(Question question);

    public List<Question> readAllQuestions();

    public void updateQuestion(Question q);

    public void deleteQuestionById(int id);
}
