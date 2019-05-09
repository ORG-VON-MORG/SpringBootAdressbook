package de.htwsaar.SpringBootAdressbook.dao;

import de.htwsaar.SpringBootAdressbook.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Person, Long> {
    Person findByUsername(String username);
}