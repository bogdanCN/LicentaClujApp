package com.neamtu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Neamtu on 1/19/17.
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {


    private UserRepository userRepository;

    @Autowired
    public UserController( UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserModel> getAllUser() {

        return userRepository.findAll();
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login (@RequestBody UserModel userModel){

        UserModel newUser = null;

        try{
            newUser = userRepository.findByUserEmailLike(userModel.getUserEmail());
        }
            catch(Exception e){
                System.out.println(e);
            }
        if(newUser.getUserPassword().equalsIgnoreCase(userModel.getUserPassword())) {
            return true;
        }

        return false;
    }

}
