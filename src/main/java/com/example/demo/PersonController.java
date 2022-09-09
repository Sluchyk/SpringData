package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {
 private final  PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }
      @PostMapping("/save")
    public  Person save(@RequestBody Person person)
      {
         return personService.save(person);
      }
      @GetMapping("/all")
    public  Iterable<Person> findAll()
      {
          return personService.findAll();
      }

}
