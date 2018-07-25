package com.conygre.rest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity @Table(name="restaurants")
public class Restaurant implements Serializable {
    public void setId(int id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name") private String name;
    @Column(name="categories") private String category;
    @Column(name="rating") private int rating;

    public Restaurant(){

    }

    public Restaurant(String n, String c, int r) {
        name = n;
        category = c;
        rating = r;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

   public List<Food> getFoodNames() {
        return foodNames;
    }

    public void setFoodNames(List<Food> foodNames) {
        this.foodNames = foodNames;
    }

    @JsonIgnore
    @OneToMany(mappedBy="restaurant", cascade={CascadeType.MERGE, CascadeType.PERSIST})
    private List<Food> foodNames = new ArrayList<Food>();
}
