package com.example.NBAshop.Model;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //lombok เอาไว้ทำ get/set
@Document(collection = "Shirt")
public class Shirt {

//    @Id //บอก id ของ model
//    private ObjectId _id;
//    private String size;
//    private String number;
//    private String color;
//    private String team;
//    private String player;
//    private String price;
//    private String Name;

    @Id //บอก id ของ model
    private ObjectId _id;
    private String Brand;
    private  String Series;
    private double Price;
    private String Size;
    private String Color;
}
