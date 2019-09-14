package AdminUI.business;

public class User {

    private int id;
    private String login;
    private String email;
    private String password;
    private String role;

    private static int count;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User() {
        count++;
    }

    public User(int id, String login, String email, String password, String role) {
        this.id = id;
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
        count++;
    }

    public User(String login, String email, String password, String role) {
        this.id = count;
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
        count++;
    }
}
