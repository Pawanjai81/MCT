package com.geekster.foodDeleverysystem.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "userOrder")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private LocalDateTime orderDateAndTime;
    @ManyToOne()
    @JoinColumn(name = "fk_user_id")
    private User user;

    @ManyToMany()
    @JoinTable(name = "fk_order_food_table",joinColumns = @JoinColumn(name = "fk_order_id"),
            inverseJoinColumns = @JoinColumn(name = "fk_food_id"))
    private List<foodItems> foodItems;

    @OneToOne()
    @JoinColumn(name = "fk_address_id")
    private Address address;
    private Integer foodItemQuantity;


}
