/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rst.boot.services;

import com.rst.boot.domain.UserDTO;
import java.util.List;

/**
 *
 * @author Maduranga
 */
public interface UserServices {

    String saveUser(UserDTO userdata);
    
    List<UserDTO> findAllUsers();

    String updateuser(UserDTO newuserdata);

    UserDTO findById(Integer id); 
    
}
