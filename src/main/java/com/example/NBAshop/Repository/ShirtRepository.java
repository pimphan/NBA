package com.example.NBAshop.Repository;

import com.example.NBAshop.Model.Shirt;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShirtRepository extends MongoRepository<Shirt, String> {

}