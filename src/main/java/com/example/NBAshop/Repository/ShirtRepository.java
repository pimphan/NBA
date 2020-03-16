package com.example.NBAshop.Repository;

import com.example.NBAshop.Model.Shirt;
import com.example.NBAshop.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ShirtRepository extends MongoRepository<Shirt, String> {
   // List<Users> findByUsers(String Name);
}