package ua.edu.ucu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.ucu.model.Flower;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Integer> {

}
