package ua.itea.app.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Users {

   private String login;
   private String password;
   private String email;
   private UserRole role;


    public Users(){

    }

    public Users(String login, String password, String email, UserRole role) {

        this.login = login;
        this.password = password;
        this.email = email;
        this.role = role;
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
            this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Users{"+
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        if (!email.equals(users.email)) return false;
        return password.equals(users.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getPassword(), getEmail(), getRole());
    }
}
