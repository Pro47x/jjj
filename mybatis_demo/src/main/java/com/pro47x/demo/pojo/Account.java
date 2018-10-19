package com.pro47x.demo.pojo;

public class Account {
    private String username;
    private int money;

    public String getUsername() {
        return username;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
