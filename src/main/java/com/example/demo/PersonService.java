package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PersonService {
    @PostConstruct
    void init() {
        Person person = new Person("Alex", "Mercer", 25);
        Person person1 = new Person("Tom", "Felton", 21);
        personRepository.saveAll(List.of(person, person1));
    }

    private final PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

}
