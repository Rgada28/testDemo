package com.rgada28.testdemo.controllers;

import com.rgada28.testdemo.entities.Person;
import com.rgada28.testdemo.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private PersonService personService;

    public PersonController(PersonService personService){
        this.personService=personService;
    }

    @GetMapping
    public List<Person> findAllPerson(){
        return  personService.getAllPersons();
    }

    @GetMapping("/exists/{id}")
    public Boolean doesPersonExists(@PathVariable Integer id){
        return  personService.doesPersonExists(id);
    }

}
