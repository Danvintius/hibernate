package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Contact;
import ru.netology.hibernate.entity.Person;

import java.util.*;

@Repository
public class PersonRepository {
    @PersistenceContext
    protected EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        Query query = entityManager.createNamedQuery("select * from persons where city = city");
        query.setParameter("city", city);
        List<Person> personList = query.getResultList();

        return personList;
    }

}

