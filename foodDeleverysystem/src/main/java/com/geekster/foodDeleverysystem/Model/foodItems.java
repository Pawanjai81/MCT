package com.geekster.foodDeleverysystem.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class foodItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;
    private String foodtName;
    private Integer foodPrice;
    private String foodDesc;
    @Enumerated(value = EnumType.STRING)
    private foodCategory foodCategory;
}

