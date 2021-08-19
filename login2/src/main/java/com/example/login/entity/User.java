package com.example.login.entity;

public class User {
    private String account;
    private long id;
    private int age;
    private String name;
    private String address;
    private String password;

    public User(String account,long id, int age, String name, String address, String password) {
        this.account = account;
        this.id = id;
        this.age = age;
        this.name = name;
        this.address = address;
        this.password = password;
    }
    public String getAccount() {
        return account;
    }
    public long getId() {
        return id;
    }
    public void setAccount(String account) {
        this.account = account;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}