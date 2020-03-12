package com.example.NBAshop.Controller;

import com.example.NBAshop.Model.Shirt;
import com.example.NBAshop.Repository.ShirtRepository;
import com.example.NBAshop.Service.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {


    @Autowired
    ShirtService shirtService;


    @RequestMapping("/")    // แบบนี้
    public String Helloword() {

        return "Hello World";
    }

    @RequestMapping("/pim")    // แบบนี้
    public String pim() {

        return "pimphan sanruangdech";
    }

    @RequestMapping("/getallData")    // แบบนี้
    public List<Shirt> getallData() {
        return shirtService.getallData();
    }

}
