package ru.netology.hibernate.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "persons")
public class Person {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;
    private int age;
    @Column (name = "phone_number")
    private String phoneNumber;

    @Column (name = "city_of_living")
    private String city;

    public Person() {

    }

    public Person(Long id, String name, String surname, int age, String phoneNumber, String city) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

}
