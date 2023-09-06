package com.rgada28.testdemo.services;

import com.rgada28.testdemo.entities.Person;
import com.rgada28.testdemo.repositories.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;
    }

    public Boolean doesPersonExists(Integer id){
        return personRepository.existsByPersonId(id);
    }

    public List<Person> getAllPersons(){
        return  personRepository.findAll();
    }
}
