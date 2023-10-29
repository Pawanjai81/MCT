package com.geekster.foodDeleverysystem.Repository;

import com.geekster.foodDeleverysystem.Model.foodCategory;
import com.geekster.foodDeleverysystem.Model.foodItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAdminRepo extends JpaRepository<foodItems, Integer> {
    List<foodItems> findByProductCategory(foodCategory category);
}
