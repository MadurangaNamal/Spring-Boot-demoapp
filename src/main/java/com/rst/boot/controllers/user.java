/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rst.boot.controllers;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.services.UserServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Maduranga
 */
@RestController
@RequestMapping("user")
public class user {
    
    @Autowired
    private UserServices userServices;
    
    
    @GetMapping("/all")
    public List<UserDTO> allUsers(){
    
    return userServices.findAllUsers();
    }
    
    @PostMapping("/add")
    public String adduser(@RequestBody UserDTO userdata){
        return userServices.saveUser(userdata);
        
    }
    
    @PutMapping("/update")
    public String updateuser(@RequestBody UserDTO newuserdata){
           return userServices.updateuser(newuserdata);
    }
 
   @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userServices.findById(id);
    }
}
