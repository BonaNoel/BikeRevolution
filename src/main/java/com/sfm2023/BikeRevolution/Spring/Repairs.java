package com.sfm2023.BikeRevolution.Spring;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Repairs {

    @Id
    @GeneratedValue
    Long id;
    String repairName;
    String repairCost;
}
