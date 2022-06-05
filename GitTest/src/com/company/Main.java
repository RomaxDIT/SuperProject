package com.company;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> registered = new ArrayList();

        Register R1 = new Register();
        R1.reg("Roman", "lionroar439");
        for (int i = 0; i < R1.registered.size(); i++) {
            System.out.println(R1.registered.get(i).GetName());
        }
    }
}
