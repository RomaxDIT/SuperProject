package com.company;

public class User
{
    private String name;
    private String password;

    public void SetName(String name) {
        this.name = name;
    }

    public void SetPassword(String password) {
        this.password = password;
    }

    public String GetName() {
        return this.name;
    }

    public String GetPassword() {
        return this.password;
    }
}
