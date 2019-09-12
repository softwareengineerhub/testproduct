package ua.itea.app.dao;

import ua.itea.app.model.Users;

import java.util.List;

public interface Dao {

    public void addUser(Users user);

    public List<Users> readAll();

    public void update(String email, Users user);

    public void deleteByEmail(String email);

    public boolean autorization(String login, String password);

    public String roleOfUser(String login, String email);

}
