package com.example.NBAshop.Repository;

import com.example.NBAshop.Model.Shirt;
import com.example.NBAshop.Model.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends MongoRepository<Users, String> {
//    List<Users> findByUsers(String Name);
//
//    void deleteById(Long id);
//
//    Optional<Users> findById(Long id);

    Optional<Users> findById(ObjectId id);
}
