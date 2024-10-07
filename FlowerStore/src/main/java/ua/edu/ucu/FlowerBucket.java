package ua.edu.ucu;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

//@Getter@Setter
//@NoArgsConstructor
//@AllArgsConstructor
public class FlowerBucket {
    private List<FlowerPack> flowerPacks;
    public FlowerBucket(){
        this.flowerPacks = new ArrayList<>();
    }


    public void addFlowerPack(FlowerPack pack){
        flowerPacks.add(pack);
    }

    public double getPrice(){
        double price = 0;
        for (FlowerPack flowerPack: flowerPacks){
            price+=flowerPack.getPrice();
        }
        return price;
    }

}
