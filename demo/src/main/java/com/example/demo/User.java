package com.example.demo;

public class User {

    private String name;
    private String surname;
    private int birthyear;

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

