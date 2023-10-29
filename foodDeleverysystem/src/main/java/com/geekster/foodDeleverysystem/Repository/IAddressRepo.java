package com.geekster.foodDeleverysystem.Repository;

import com.geekster.foodDeleverysystem.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
