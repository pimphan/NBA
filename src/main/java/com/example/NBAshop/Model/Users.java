package com.example.NBAshop.Model;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;

@Data
@Document(collection = "Shirt")
public class Users {
    @Id
    @NotNull
    private ObjectId _id;

    private String size;

    private String color;

    private String player;

    private int number;

    private String team;

    private int price;

}


