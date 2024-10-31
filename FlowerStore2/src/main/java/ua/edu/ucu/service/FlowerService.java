package ua.edu.ucu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import ua.edu.ucu.model.Flower;
import ua.edu.ucu.repository.FlowerRepository;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }
    @PostMapping("/flower")
    public Flower createFlower(Flower flower){
        return flowerRepository.save(flower);
    }

}
