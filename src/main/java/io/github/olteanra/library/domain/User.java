package io.github.olteanra.library.domain;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * @author Rares Oltean
 */
public class User {

    private String fullName;
    private String username;
    private String password;

    @JsonCreator
    public User(String fullName, String username, String password) {
        this.fullName = fullName;
        this.username = username;
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Book{" +
                "fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
