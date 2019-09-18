package com.app.ws.api;

import ua.itea.app.dao.Dao;
import ua.itea.app.dao.DaoImpl;
import ua.itea.app.model.Question;
import ua.itea.app.model.Users;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

@WebService
public class DaoAPI {
    private DaoImpl dao;

    public void setDao(DaoImpl dao) {
        this.dao = dao;
    }

    @WebMethod
    public void addUser(Users user){
        dao.addUser(user);
    }

    public List<Users> readAllUsers(){
        return dao.readAllUsers();
    }

    public void updateUsersByUsername(Users user){
        dao.updateUsersByUsername(user);
    }

    public void deleteUserByLogin(String login){
        dao.deleteUserByLogin(login);
    }

    public boolean authentication(String login, String password){
        return dao.authentication(login, password);
    }

    public String roleOfUser(String login){
        return dao.roleOfUser(login);
    }

    public void addQuestion(Question question, String userLogin){
        dao.addQuestion(question, userLogin);
    }

    public List<Question> readAllQuestions(){
        return dao.readAllQuestions();
    }

    public void updateQuestion(Question q){
        dao.updateQuestion(q);
    }

}
