package ua.edu.ucu.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Item {
    @Getter
    private String description;

    protected void setDescription(String str) {
        description = str;
    }

    public abstract double price();
}
