package ru.project.instazoo.payload.response;

import lombok.Getter;

@Getter
public class InvalidLoginResponse {

public String username;
public String password;

    public InvalidLoginResponse() {
        this.username = "Invalid username";
        this.password = "Invalid password";
    }
}
