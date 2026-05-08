package org.java.spring.spring_la_mia_pizzeria_crud.repository;

import org.java.spring.spring_la_mia_pizzeria_crud.models.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
