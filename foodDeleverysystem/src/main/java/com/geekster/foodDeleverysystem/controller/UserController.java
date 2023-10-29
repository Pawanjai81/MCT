package com.geekster.foodDeleverysystem.controller;

import com.geekster.foodDeleverysystem.Model.Order;
import com.geekster.foodDeleverysystem.Model.Restaurant;
import com.geekster.foodDeleverysystem.Model.User;
import com.geekster.foodDeleverysystem.Service.AuthenticationService;
import com.geekster.foodDeleverysystem.Service.RestaurantService;
import com.geekster.foodDeleverysystem.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    RestaurantService restaurantService;
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("user/signup")
    public String userSignUp(@Valid @RequestBody User newUser)
    {
        return userService.userSignUp(newUser);
    }
    //sign in
    @PostMapping("user/signIn/{email}/{password}")
    public String userSignIn(@PathVariable String email, @PathVariable String password)
    {
        return userService.userSignIn(email,password);
    }
    @DeleteMapping("user/signOut")
    public String userSignOut(@RequestParam String email, @RequestParam String token)
    {
        return userService.userSignOut(email,token);
    }
    @GetMapping("restaurants")
    public List<Restaurant> getRestaurants(){
        return restaurantService.getAllRestaurants();
    }

}
