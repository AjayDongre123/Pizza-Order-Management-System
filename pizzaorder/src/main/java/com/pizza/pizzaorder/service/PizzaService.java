package com.pizza.pizzaorder.service;


import com.pizza.pizzaorder.entity.Pizzadetails;
import com.pizza.pizzaorder.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {
    @Autowired
    PizzaRepository pizzaRepository;


    public boolean addpizzadetails(Pizzadetails pizzadetails) {
        boolean result = false;
        Pizzadetails pizzadetails1 = pizzaRepository.save(pizzadetails);
        if (pizzadetails != null) {
            return true;
        } else {
            return false;
        }
    }


    public ResponseEntity updatePizzadetails(Pizzadetails pizzadetails, int id) {
        Pizzadetails pizzadetails1 = pizzaRepository.findById(id).get();
        pizzadetails1.setName(pizzadetails.getName());

        pizzaRepository.save(pizzadetails);
        return new ResponseEntity<>("Successffully updated", HttpStatus.OK);

    }

    public ResponseEntity deletePizzadetails(int id){

       pizzaRepository.deleteById(id);

       return new ResponseEntity<>("delete successfully", HttpStatus.OK);
        }
    public ResponseEntity retrievePizzadetails(){
        List<Pizzadetails> all = pizzaRepository.findAll();

       // return new ResponseEntity<>( "retrieve successfuly", HttpStatus.OK);

        return new ResponseEntity<>(all, HttpStatus.OK);
    }
    public ResponseEntity retrieve(int id) {
        Pizzadetails pizzadetails = pizzaRepository.findById(id).get();

        //return new ResponseEntity<>("retrieve successfully", HttpStatus.OK);
        return new ResponseEntity<>(pizzadetails, HttpStatus.OK);
    }
}