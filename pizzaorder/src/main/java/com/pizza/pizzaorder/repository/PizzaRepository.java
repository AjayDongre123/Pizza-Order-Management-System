package com.pizza.pizzaorder.repository;

import com.pizza.pizzaorder.entity.Pizzadetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizzadetails,Integer> {

}
