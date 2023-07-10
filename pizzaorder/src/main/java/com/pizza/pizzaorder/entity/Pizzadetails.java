package com.pizza.pizzaorder.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="addpizzadetails")
public class Pizzadetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    int id;
    String Name;
    String city;
    int quantity;
    int price;
}
