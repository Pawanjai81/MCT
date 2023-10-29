package com.geekster.foodDeleverysystem.controller;

import com.geekster.foodDeleverysystem.Model.Address;
import com.geekster.foodDeleverysystem.Service.AdderssService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AdderssController {
    @Autowired
    AdderssService addressService;
    @PostMapping("address")
    public String addAddress(@RequestBody Address address)
    {
        return addressService.addAddress(address);
    }


    @GetMapping("address/{Id}")
    public Optional<Address> getAddress(@PathVariable Integer Id)
    {
        return addressService.getAddress(Id);
    }

    @DeleteMapping("address/{id}")
    public String deleteAddressById(@PathVariable Integer id){return addressService.deleteAddressById(id);}

}
