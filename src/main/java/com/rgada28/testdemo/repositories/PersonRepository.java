package com.rgada28.testdemo.repositories;

import com.rgada28.testdemo.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Boolean existsByPersonId(Integer id);
}
