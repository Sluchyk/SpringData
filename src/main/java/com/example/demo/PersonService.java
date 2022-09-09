package com.example.demo;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PersonService{
    @PostConstruct
    void init()
    {
        Person person=new Person("Alex","Mercer",25);
        Person person1=new Person("Tom","Felton",21);
        personInterface.saveAll(List.of(person,person1));
    }
    private  final PersonInterface personInterface;
    public PersonService(PersonInterface personInterface) {
        this.personInterface = personInterface;
    }
          public  Person save(Person person)
          {
              return personInterface.save(person);
          }
          public  Iterable<Person> findAll()
          {
              return  personInterface.findAll();
          }

}
