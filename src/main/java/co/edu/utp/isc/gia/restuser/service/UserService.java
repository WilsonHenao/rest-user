/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.service;

import co.edu.utp.isc.gia.restuser.web.dto.UserDto;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author wilso
 */
@Service
public class UserService {
    private final List<UserDto> users = new ArrayList<>();
    
    public UserDto save(UserDto user){
        
        user.setId(users.size() + 1L);
        user.setUsername(user.getUsername().toLowerCase());
        users.add(user);
        return user;
    }
    
    public List<UserDto> listAll(){
        return users;
    }
    
    public UserDto findOne(@PathVariable("id") Long id){
        return users.get(id.intValue() + 1);
    }
}
