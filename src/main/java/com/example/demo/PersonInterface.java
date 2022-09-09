package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface PersonInterface extends CrudRepository<Person, Long> {
}
