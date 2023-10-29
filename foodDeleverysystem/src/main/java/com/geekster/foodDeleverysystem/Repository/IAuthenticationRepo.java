package com.geekster.foodDeleverysystem.Repository;

import com.geekster.foodDeleverysystem.Model.AuthenticationToken;
import com.geekster.foodDeleverysystem.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

}
