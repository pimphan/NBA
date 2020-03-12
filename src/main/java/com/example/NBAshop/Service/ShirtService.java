package com.example.NBAshop.Service;

import com.example.NBAshop.Model.Shirt;
import com.example.NBAshop.Repository.ShirtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ShirtService {

    @Autowired
    ShirtRepository shirtRepository;

    @RequestMapping("/getallData")    // แบบนี้
    public List<Shirt> getallData() {
        return shirtRepository.findAll();
    }

}
