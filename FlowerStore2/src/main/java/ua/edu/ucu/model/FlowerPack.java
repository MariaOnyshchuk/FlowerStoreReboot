package ua.edu.ucu.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FlowerPack {
    private Flower flower;
    private int count;

    public FlowerPack(Flower flower, int count){
        this.flower = new Flower(flower);
        this.count = count;
    }

    public double getPrice(){
        return flower.getPrice()*count;
    }
    //    @Override
    public boolean equals(FlowerPack other) {
        if (!(other instanceof FlowerPack)) return false;

        return this.flower.getColor() == other.flower.getColor() &&
                this.flower.getFlowerType() == other.flower.getFlowerType() &&
                Double.compare(this.getPrice(), other.getPrice()) == 0;
    }
}