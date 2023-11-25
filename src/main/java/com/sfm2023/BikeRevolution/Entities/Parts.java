package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Repository;

@Data
@Entity
@Repository
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Integer quantity;
    Integer price;
}
