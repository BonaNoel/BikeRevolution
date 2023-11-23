package com.sfm2023.BikeRevolution.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@Entity
@Repository
@AllArgsConstructor
@NoArgsConstructor
public class Parts {
    @Id
    @GeneratedValue
    Long id;
    String partName;
    Integer partQuantity;
    Integer partPrice;
}
