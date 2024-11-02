package ua.edu.ucu.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;
import java.time.Period;

@Data @Table @Entity(name="app_user")
public class AppUser {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique=true)
    private String email;
    @Getter
    private LocalDate dob;
    @Transient
    private Integer age;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
