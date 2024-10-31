package ua.edu.ucu.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Flowers")
public class Flower {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private FlowerType flowerType;


    public Flower(Flower flower){
        this.color = flower.color;
//        this.flowerType = flower.flowerType;
        this.price = flower.price;
//        this.sepalLengh = flower.sepalLengh;
    }

    private String name;
    private String color;
    private double price;
    private boolean available;

}
