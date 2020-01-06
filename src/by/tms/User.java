package by.tms;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    public static final List<User> users = new ArrayList<>();

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }


    @Override
    public int hashCode() {
        return Objects.hash(login,password);
    }
}
