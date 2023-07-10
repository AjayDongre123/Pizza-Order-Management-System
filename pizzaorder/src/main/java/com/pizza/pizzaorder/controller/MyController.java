package com.pizza.pizzaorder.controller;

import com.pizza.pizzaorder.entity.Pizzadetails;
import com.pizza.pizzaorder.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Pizza")
public class MyController {
    @Autowired
    PizzaService pizzaService;

    @PostMapping("/addPizza")
    public String ddPizza(@RequestBody Pizzadetails pizzadetails) {
        boolean result = pizzaService.addpizzadetails(pizzadetails);
        if (result) {
            System.out.println("run sucesssfully");
        } else {
            System.out.println("something went wrong");
        }
        return "run successfully";
    }

    @PutMapping("/updatePizzadetails/{id}")
    public ResponseEntity updatePizzadetails(@RequestBody Pizzadetails pizzadetails, @PathVariable int id) {

        return pizzaService.updatePizzadetails(pizzadetails, id);
    }

    @PutMapping("/deletePizzadetails/{id}")
    public ResponseEntity deletePizzadetails(@PathVariable int id) {
        return pizzaService.deletePizzadetails(id);
    }

    @GetMapping("/retrievePizzadetails")
    public ResponseEntity<Pizzadetails> retrievedetails() {
        return pizzaService.retrievePizzadetails();
    }

    @GetMapping("/retrieve/{id}")
    public ResponseEntity retrieve( @PathVariable int id) {

        return pizzaService.retrieve(id);
    }

}




