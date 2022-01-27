package com.udemy.patterns.behavioural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {

    private String userName;
    private List<String> permissions;

    public User(String userName, String ...permissions) {
        this.userName = userName;
        this.permissions = new ArrayList<>();
        Stream.of(permissions).map(String::toLowerCase).forEach(permission -> this.permissions.add(permission));
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getPermissions() {
        return permissions;
    }
}
