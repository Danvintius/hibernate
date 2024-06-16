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
    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNamedQuery("select * from persons where city = city");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();

        return personList;
    }

    public List<Person> getPersonsByAge() {
        return personList;
    }

    public List<Person> getPersonsByNameAndSurname() {
        return personList;
    }

}

