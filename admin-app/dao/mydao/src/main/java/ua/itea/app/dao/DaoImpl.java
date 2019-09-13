package ua.itea.app.dao;

import ua.itea.app.model.Question;
import ua.itea.app.model.Users;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {

    @Override
    public void addUser(Users user) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("INSERT INTO testproduct.users(login, password, email, role) VALUES(?, ?, ?, ?)");
            ps.setObject(1, user.getLogin());
            ps.setObject(2, user.getPassword());
            ps.setObject(3, user.getEmail());
            ps.setObject(4, user.getRole());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Users> readAllUsers() {
        try(Connection c = getConnection()){
            List<Users> usersList = new ArrayList<>();
            String sql = "SELECT * FROM testproduct.users";
            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Users user =  null;
            while(rs.next()){
                user = new Users();
                user.setId(rs.getInt("id"));
                user.setEmail(rs.getString("email"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                usersList.add(user);
            }

            return usersList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateUsersById(Users user) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("UPDATE users SET login=?, email=?, role=?, password=? WHERE id=?");
            int i=0;
            ps.setString(++i, user.getLogin());
            ps.setString(++i, user.getEmail());
            ps.setString(++i, user.getRole());
            ps.setString(++i, user.getPassword());
            ps.setInt(++i, user.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {

        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM users WHERE id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean authentication(String login, String password) {
        boolean check = false;
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT login, password FROM users");
            ResultSet rs = ps.executeQuery();
            System.out.println("sql m here");
            while(rs.next()){
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

    @Override
    public String roleOfUser(int id) {
        String role = "";
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("SELECT role FROM users WHERE id=?");
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            Users user =  null;
            while(rs.next()){
                role = rs.getString("role");
            }
            return role;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addQuestion(Question question) {
        try (Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("INSERT INTO questions(question, a1, a2, a3, a4, correct, author_id) VALUES(?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, question.getQuestion());
            ps.setString(2, question.getA1());
            ps.setString(3, question.getA2());
            ps.setString(4, question.getA3());
            ps.setString(5, question.getA4());
            ps.setString(6, question.getCorrect());
            ps.setInt(7, question.getAuthor_id());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Question> readAllQuestions() {
        try(Connection c = getConnection()){
            List<Question> qList = new ArrayList<>();
            String sql = "SELECT * FROM questions";
            PreparedStatement ps = c.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            Question q;
            while(rs.next()){
                q = new Question();
                q.setId(rs.getInt("id"));
                q.setQuestion(rs.getString("question"));
                q.setA1(rs.getString("a1"));
                q.setA2(rs.getString("a2"));
                q.setA3(rs.getString("a3"));
                q.setA4(rs.getString("a4"));
                q.setCorrect(rs.getString("correct"));
                q.setAuthor_id(rs.getInt("author_id"));
                qList.add(q);

            }
            return qList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateQuestion(Question q) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("UPDATE questions SET question=?, a1=?, a2=?,a3=?,a4=?, correct=?, author_id=? WHERE id=?");
            int i=0;
            ps.setString(++i, q.getQuestion() );
            ps.setString(++i,q.getA1() );
            ps.setString(++i,q.getA2() );
            ps.setString(++i,q.getA3() );
            ps.setString(++i, q.getA4());
            ps.setString(++i, q.getCorrect());
            ps.setInt(++i, q.getAuthor_id());
            ps.setInt(++i, q.getId());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteQuestionById(int id) {
        try(Connection c = getConnection()){
            PreparedStatement ps = c.prepareStatement("DELETE FROM questions WHERE id=?");
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testproduct", "root", "ltvzirf1995");
    }
}
