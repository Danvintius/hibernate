package ru.netology.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import ru.netology.hibernate.domain.Person;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Person, Long> {
    public static void main(String[] args) {

    }

    public default String getPersonsByCity(String city) {
        return city;
    }
}
