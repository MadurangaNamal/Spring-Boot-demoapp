/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rst.boot.services.impl;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maduranga
 */
@Service
public class UserServiceImpl implements UserServices{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        
        List<UserDTO> allusers = userRepository.findAll();
        
        return allusers;
    }

    @Override
    public String saveUser(UserDTO userdata) {
        userRepository.save(userdata);
        return "Data Saved";
    }
    
    @Override
    public String updateuser(UserDTO newuserdata){
        String msg =null;
        if(newuserdata.getId() != null){
             userRepository.save(newuserdata);
             msg = "Data Updated!!";
        }
        else{
        msg="Error!!";
        }
        return msg;
    }
    @Override
     public UserDTO findById(Integer id){
         return userRepository.findOne(id);
     }
}
