package com.company;
import java.util.ArrayList;

public class Register {
    ArrayList<User> registered = new ArrayList();

    public Register() {
    }

    public void reg(String name, String pass) {
        User new_user = new User();
        new_user.setPassword(pass);
        new_user.setName(name);
        registered.add(new_user);
    }

    public void reg (String name){

        String pass = "";
        String password = "QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMm1234567890";
        User new_user = new User();
        new_user.setPassword(pass);
        new_user.setName(name);
        registered.add(new_user);
    }


    public void del(String name, String pass)
    {
        int del;
        for (del=0;del<registered.size();del++);
        if (registered.get(del).GetName().equals(name)&& registered.get(del).GetPassword().equals(pass));
        {registered.remove(del);}
    }
}
