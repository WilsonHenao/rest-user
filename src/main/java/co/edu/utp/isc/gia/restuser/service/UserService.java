/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.gia.restuser.service;

import co.edu.utp.isc.gia.restuser.data.entity.UserModel;
import co.edu.utp.isc.gia.restuser.data.repository.UserRepository;
import co.edu.utp.isc.gia.restuser.web.dto.UserDto;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

/**
 *
 * @author wilso
 */
@Service
public class UserService {
    //private final List<UserDto> users = new ArrayList<>();
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }
    
    
    public UserDto save(UserDto user){
        UserModel myUser = modelMapper.map(user, UserModel.class);
        myUser = userRepository.save(myUser);
        UserDto resp = modelMapper.map(myUser, UserDto.class);
        return resp;
    }
    
    public List<UserDto> listAll(){
        return null;
    }
}
