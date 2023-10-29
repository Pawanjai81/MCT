package com.geekster.foodDeleverysystem.Service;

import com.geekster.foodDeleverysystem.Model.Order;
import com.geekster.foodDeleverysystem.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String placeAnOrder(Order order) {
        iOrderRepo.save(order);
        return "Order Placed :) !";
    }

    public List<Order> getAllOrders() {
        return (List<Order>) iOrderRepo.findAll();
    }

    public String deleteOrderById(Integer id) {
        iOrderRepo.deleteById(id);
        return "Order Cancelled :( !";
    }
}

    
