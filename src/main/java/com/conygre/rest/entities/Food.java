package com.conygre.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity @Table(name="foods")
public class Food implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;


    @Column(name="name")
    private String name;

    @Column(name="price")
    private float price;

    @JoinColumn(name="restaurant_id", referencedColumnName="id", nullable=false)
    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

    public Food(){

    }


    public Food(String n, Float p, Restaurant r){
        name = n;
        price = p;
        restaurant = r;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
