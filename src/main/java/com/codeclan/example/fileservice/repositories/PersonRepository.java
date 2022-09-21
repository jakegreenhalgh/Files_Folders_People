package com.codeclan.example.fileservice.repositories;

import com.codeclan.example.fileservice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
