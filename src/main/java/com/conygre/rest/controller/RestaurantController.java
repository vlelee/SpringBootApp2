package com.conygre.rest.controller;

import com.conygre.rest.entities.Restaurant;
import com.conygre.rest.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService service;

    @RequestMapping(method = RequestMethod.GET)
    Iterable<Restaurant> findAll(){
        return service.getAllRestaurants();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Restaurant getRestaurantById(@PathVariable("id") int id) {
        return service.getRestaurantById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void deleteRestaurant(@PathVariable("id") int id) {
        service.deleteRestaurant(id);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteRestaurant(@RequestBody Restaurant restaurant) {
        service.deleteRestaurant(restaurant);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void addRestaurant(@RequestBody Restaurant restaurant) {
        service.addNewRestaurant(restaurant);
    }

}
