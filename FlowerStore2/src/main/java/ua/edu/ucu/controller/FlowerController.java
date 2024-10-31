package ua.edu.ucu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.edu.ucu.model.Flower;
import ua.edu.ucu.service.FlowerService;

import java.util.List;

@RestController //ability to work by httpzators (get, post...)
@RequestMapping("/api/v1")//шлях до запиту
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService){
        this.flowerService = flowerService;
    }
    @GetMapping("/flower")
    public List<Flower> getFlower(){
        return flowerService.getFlowers();
    }
    @PostMapping("/flower")
    public Flower createFlower(@RequestBody Flower flower){
        return flowerService.createFlower(flower);
    }
}
