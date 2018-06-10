package com.baizhi.entity;


public class produce {
    private String name;
    private String password;
    private String email;
    private String url;
    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public produce() {
    }

    public produce(String name, String password) {

        this.name = name;
        this.password = password;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

