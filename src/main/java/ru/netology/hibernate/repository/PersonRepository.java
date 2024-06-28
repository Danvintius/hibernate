package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Contact;
import ru.netology.hibernate.entity.Person;

import java.util.*;

@Repository
public interface PersonRepository extends JpaRepository<Long, Contact> {

    List<Person> findByCity(String city);
    List<Person> findByAge(int age);
    List<Person> findByNameAndSurname(String name, String surname);

    List<Person> getPersonsByCity(String city);
}

