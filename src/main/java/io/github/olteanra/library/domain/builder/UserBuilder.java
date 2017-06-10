package io.github.olteanra.library.domain.builder;

import io.github.olteanra.library.domain.User;

/**
 * @author Rares Oltean
 */
public final class UserBuilder {
    private String fullName;
    private String username;
    private String password;

    public UserBuilder fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public User build() {
        User user = new User(fullName, username, password);
        return user;
    }
}
