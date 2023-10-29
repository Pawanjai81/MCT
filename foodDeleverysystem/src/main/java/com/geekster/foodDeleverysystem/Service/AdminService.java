package com.geekster.foodDeleverysystem.Service;

import com.geekster.foodDeleverysystem.Model.foodItems;
import com.geekster.foodDeleverysystem.Repository.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    IAdminRepo AdminRepo;

    public String addAfoodItem(foodItems food){
        AdminRepo.save(food);
        return "foodItem is added :) !";
    }

    public String addListOffoods(List<foodItems> foods){
        AdminRepo.saveAll(foods);
        return "foodItems are added :) !";
    }
    public List<foodItems> getfoodItems() {
        return (List<foodItems>) AdminRepo.findAll();
    }
}
