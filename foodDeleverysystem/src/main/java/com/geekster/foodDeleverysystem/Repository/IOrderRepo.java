package com.geekster.foodDeleverysystem.Repository;

import com.geekster.foodDeleverysystem.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends JpaRepository<Order, Integer> {
}
