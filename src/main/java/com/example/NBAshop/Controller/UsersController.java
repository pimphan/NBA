package com.example.NBAshop.Controller;

import com.example.NBAshop.Model.Users;
import com.example.NBAshop.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping("/Users")
@RequestMapping("/api/v1")

public class UsersController {
    @Autowired
    UsersService usersService;

//  @GetMapping()
//    public List<Users> getUsers() {
//        return ;
//    }

    @PostMapping("/user")
     public Users createUser(@RequestBody Users users){
        return  usersService.createUsers(users) ;
    }

    @GetMapping("/get")
    public List <Users> getUser(@RequestBody Users users){
        return  usersService.getUser(users) ;
    }

    @PostMapping("/update")
    public Optional<Users> updateUser(@RequestBody Users users){
        return  usersService.updateUser(users) ;
    }

}
