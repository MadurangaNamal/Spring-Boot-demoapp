/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rst.boot.repositories;

import com.rst.boot.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Maduranga
 */
public interface UserRepository extends JpaRepository<UserDTO,Integer>{

    public UserDTO findOne(Integer id);
    
}
