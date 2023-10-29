package com.geekster.foodDeleverysystem.controller;

import com.geekster.foodDeleverysystem.Model.foodItems;
import com.geekster.foodDeleverysystem.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {

    @Autowired
    AdminService adminService;

    @PostMapping("foodItems")
    public String addAProduct(@RequestBody foodItems foodItem)
    {
        return  adminService.addAfoodItem(foodItem);
    }

    @PostMapping("foodItems")
    public String addListOffoods(@RequestBody List<foodItems> foods) {
        return adminService.addListOffoods(foods);
    }

    @GetMapping("foodItems/list")
    public List<foodItems> getfoodItems()
    {
        return adminService.getfoodItems();
    }
}
