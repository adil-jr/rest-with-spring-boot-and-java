package io.github.adil_jr.repository;

import io.github.adil_jr.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}