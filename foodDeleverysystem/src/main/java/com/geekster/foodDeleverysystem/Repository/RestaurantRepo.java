package com.geekster.foodDeleverysystem.Repository;

import com.geekster.foodDeleverysystem.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {
}
