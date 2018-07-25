package com.conygre.rest.service;

import com.conygre.rest.entities.Restaurant;


public interface RestaurantService {
    Iterable<Restaurant> getAllRestaurants();

    Restaurant getRestaurantById(int id);

    Restaurant addNewRestaurant(Restaurant restaurant);

    Restaurant updateRestaurant(Restaurant restaurant);

    void deleteRestaurant(int id);

    void deleteRestaurant(Restaurant restaurant);
}
