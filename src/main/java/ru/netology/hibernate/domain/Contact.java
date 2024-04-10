package ru.netology.hibernate.domain;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String surname;
    private int age;

    public Contact() {

    }

    public Contact(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
