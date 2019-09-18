package ua.itea.app.DAO;

import ua.itea.app.model.User;

import java.util.List;

public class UserDAO implements IDAO<User> {
    @Override
    public boolean create(User user) {
        return false;
    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public List<User> readAll() {
        return null;
    }

    @Override
    public User update(User user, User newT) {
        return null;
    }

    @Override
    public User delete(User user) {
        return null;
    }

    @Override
    public User delete(int id) {
        return null;
    }

    @Override
    public int getId(User user) {
        return 0;
    }
}
