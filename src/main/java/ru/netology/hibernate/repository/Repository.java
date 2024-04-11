package ru.netology.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.hibernate.entity.Person;

import java.util.*;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Person, Long> {
    public static void main(String[] args) {

    }

    public default String getPersonsByCity(String city) {
        ArrayList<Person> personList = new ArrayList<Person>();
        for (int i = 0; i < personList.size(); i++) {
            if (personList(i).city == city) {
                return personList(i);
            }
        }
        return city;
    }
}

