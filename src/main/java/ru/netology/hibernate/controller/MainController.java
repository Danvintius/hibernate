package ru.netology.hibernate.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MainController {

    private final PersonRepository repository;

    public MainController(PersonRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/persons/by-city")
    private List<Person> getPersonsByCity(@RequestParam(value = "city", required = false) String city) {
        return repository.getPersonsByCity(city);
    }

    @GetMapping("/")
    public String index(Model model) {
        return "Добро пожаловать!";
    }

    @GetMapping
    public String persons(Model model) {
        return "Добро пожаловать!";
    }
}
