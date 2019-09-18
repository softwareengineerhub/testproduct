package ua.itea.app.dao;

import ua.itea.app.model.Question;
import ua.itea.app.model.Users;

import java.util.List;

public interface Dao {

    public void addUser(Users user);

    public List<Users> readAllUsers();

    public void updateUsersByUsername(Users user);

    public void deleteUserByLogin(String login);

    public boolean authentication(String login, String password);

    public String roleOfUser(String login);

    public void addQuestion(Question question, String userLogin);

    public List<Question> readAllQuestions();

    public void updateQuestion(Question q);

    //public void deleteQuestionById(int id);
}
