package com.example.NBAshop.Service;

import com.example.NBAshop.Model.Users;
import com.example.NBAshop.Repository.UsersRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UsersService {
    private final com.example.NBAshop.Repository.UsersRepository UsersRepository;

    @Autowired
    public UsersService(UsersRepository repository){
        this.UsersRepository = repository;
    }


    public Users createUsers(Users users) {
        return UsersRepository.save(users);
    }

    public List<Users> getUser(Users users) {
        return UsersRepository.findAll();
    }

    public Optional<Users> updateUser(Users users) {
        return UsersRepository.findById();
    }


}
