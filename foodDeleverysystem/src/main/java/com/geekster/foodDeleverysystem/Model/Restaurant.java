package com.geekster.foodDeleverysystem.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer restaurantId;

    @NotBlank
    @Pattern(regexp = "^[a-zA-Z ]+$")
    private String restaurantName;

    private String restaurantAddress;

    @Size(min = 12,max = 12)
    @Pattern( regexp = "91[0-9]+",message = "Enter a Valid Phone Number")
    private String restaurantContact;

    @Email(message = "Enter valid Email")
    private String restaurantEmail;

}
