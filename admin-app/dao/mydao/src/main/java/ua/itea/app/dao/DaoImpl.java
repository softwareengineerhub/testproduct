package ua.itea.app.dao;

import ua.itea.app.model.Users;

import java.sql.*;
import java.util.List;

public class DaoImpl implements Dao {


    public void addUser(Users user) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("INSERT INTO users(login, password, email, role) VALUES(?, ?, ?, ?)");
            ps.setString(1, user.getLogin());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getRole());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public List<Users> readAll() {
        try(Connection c = getConnection()){
            List<Users> usersList = new ArrayList<>();
            String sql = "SELECT * FROM users";
            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Users user =  null;
            while(rs.next()){
                user = new Users();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setLogin(rs.getString("login"));
//                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                usersList.add(user);
            }

            return usersList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update(String email, Users user) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("UPDATE users SET login=?, email=?, role=?, password=? WHERE email=?");
            int i=0;
            ps.setString(++i, user.getLogin());
            ps.setString(++i, user.getEmail());
            ps.setString(++i, user.getRole());
            ps.setString(++i, user.getPassword());
            ps.setString(++i, email);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteByEmail(String email) {

        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM users WHERE email=?");
            ps.setString(1, email);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean autorization(String login, String password) {
        boolean check = false;
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT login, password FROM users");
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if (login.equals(rs.getString("login"))){
                    if(password.equals(rs.getString("password"))){
                        check = true;
                    } else {
                        check = false;
                    }
                } else {
                    check = false;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return check;
    }

    public String roleOfUser(String login, String email) {
        String role = "";
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT role FROM users WHERE login=? AND email=?");
            ps.setString(1, login);
            ps.setString(2, email);

            ResultSet rs = ps.executeQuery();
            Users user =  null;
            while(rs.next()){
                role = rs.getString("role");
            }
            return role;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/database", "root", "ltvzirf1995");
    }
}
