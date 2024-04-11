package ru.netology.hibernate.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "persons")
public class Person {
    @EmbeddedId
    private Contact contact;
    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "city_of_living")
    private String city;

    public Person() {

    }

    public Person(Contact contact, String name, String surname, int age, String phoneNumber, String city) {
        this.contact = new Contact();
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

}
