package com.bosonit.EJ2.infraestructure.Repository;

import com.bosonit.EJ2.domain.PersonaEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends MongoRepository<PersonaEnt,Integer> {
    List<PersonaEnt> findByName(String name);
}
