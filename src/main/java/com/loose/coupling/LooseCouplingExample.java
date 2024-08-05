package com.loose.coupling;

public class LooseCouplingExample {
    public static void main(String[] args) {
        UserDataProvider ud1 = new UserDatabaseProvider();
        UserManager um1 = new UserManager(ud1);
        System.out.println(um1.getUserInfo());
    }
}
