package com.conygre.rest.service;


import com.conygre.rest.dao.RestaurantRepository;
import com.conygre.rest.entities.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.Collection;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository dao;

    public Collection<Restaurant> getAllRestaurants(){
        return dao.findAll();
    }
    @Override
    public Restaurant getRestaurantById(int id) {
        return dao.findOne(id);
    }

    @Override
    public Restaurant addNewRestaurant(Restaurant restaurant) {
        //restaurant.setId(0); // assume it is not in the db
        return dao.save(restaurant);
    }


    @Override
    public Restaurant updateRestaurant(Restaurant restaurant) {
        return dao.save(restaurant);
    }

    @Override
    public void deleteRestaurant(int id) {
        dao.delete(id);

    }

    @Override
    public void deleteRestaurant(Restaurant restaurant) {
        deleteRestaurant(restaurant.getId());
    }

}
