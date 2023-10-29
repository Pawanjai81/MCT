package com.geekster.foodDeleverysystem.Service;

import com.geekster.foodDeleverysystem.Model.Restaurant;
import com.geekster.foodDeleverysystem.Repository.RestaurantRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.findAll();
    }
}
