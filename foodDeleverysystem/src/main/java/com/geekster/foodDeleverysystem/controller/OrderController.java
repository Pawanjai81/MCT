package com.geekster.foodDeleverysystem.controller;

import com.geekster.foodDeleverysystem.Model.Order;
import com.geekster.foodDeleverysystem.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeAnOrder(@RequestBody Order orders)
    {
        return orderService.placeAnOrder(orders);
    }

    @GetMapping("Orders")
    public List<Order> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @DeleteMapping("order/{id}")
    public String deleteOrderById(@PathVariable Integer id)
    {
        return orderService.deleteOrderById(id);
    }
}
