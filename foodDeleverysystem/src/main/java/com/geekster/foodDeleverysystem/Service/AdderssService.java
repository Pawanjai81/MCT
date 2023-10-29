package com.geekster.foodDeleverysystem.Service;

import com.geekster.foodDeleverysystem.Model.Address;
import com.geekster.foodDeleverysystem.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdderssService {
    @Autowired
    IAddressRepo AddressRepo;

    public String addAddress(Address address) {
        AddressRepo.save(address);
        return "Address added :) !";
    }

    public Optional<Address> getAddress(Integer id) {
        return AddressRepo.findById(id);
    }

    public String deleteAddressById(Integer id) {
        AddressRepo.deleteById(id);
        return "Address removed !";
    }
}
