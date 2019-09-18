package AdminUI.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {

    private int id;
    private String login;
    private String password;
    private String email;
    private String role;

    public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public Users(){

    }

    public Users(int id, String login, String password, String email, String role) {
        this.id = id;
        this.login = login;
        this.password = password;
        if (checkEmail(email)==true) {
            this.email = email;
        }else{
            System.out.println("Wrong email");
        }
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (checkEmail(email)==true) {
            this.email = email;
        }else{
            System.out.println("Wrong email");
        }
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return getId() == users.getId() &&
                Objects.equals(getLogin(), users.getLogin()) &&
                Objects.equals(getPassword(), users.getPassword()) &&
                Objects.equals(getEmail(), users.getEmail()) &&
                Objects.equals(getRole(), users.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLogin(), getPassword(), getEmail(), getRole());
    }
}
