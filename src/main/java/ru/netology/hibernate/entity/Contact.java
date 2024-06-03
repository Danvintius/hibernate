package ru.netology.hibernate.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
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
