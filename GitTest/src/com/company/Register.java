package com.company;
import java.util.ArrayList;
import java.util.Random;

public class Register {
    ArrayList<User> registered = new ArrayList();

    public void reg(String name, String pass) {
        User new_user = new User();
        new_user.SetPassword(pass);
        new_user.SetName(name);
        registered.add(new_user);
    }

    public void reg (String name){

        String pass = "";
        String password = "QqWwEeRrTtYyUuIiOoPpAaSsDdFfGgHhJjKkLlZzXxCcVvBbNnMm1234567890";
        for (int i = 0; i < 10; i++){
            pass+=password.charAt((int) ((Math.random() * (password.length() - 0)) + 0));
        }
        User new_user = new User();
        new_user.SetPassword(pass);
        new_user.SetName(name);
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
